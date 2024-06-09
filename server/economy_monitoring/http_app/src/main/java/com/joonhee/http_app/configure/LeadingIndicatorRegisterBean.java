package com.joonhee.http_app.configure;

import com.joonhee.domain.us_economy.port.out.LeadingIndicatorInvestingComPort;
import com.joonhee.domain.us_economy.service.LeadingIndicatorProcessor;
import com.joonhee.domain.us_economy.usecase.LeadingIndicator;
import com.joonhee.http_app.port.out.investingcom.leadingindicator.LeadingIndicatorFeignClient;
import com.joonhee.http_app.port.out.investingcom.leadingindicator.LeadingIndicatorPortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeadingIndicatorRegisterBean {
    @Bean
    public LeadingIndicator LeadingIndicatorService(
            LeadingIndicatorInvestingComPort leadingIndicatorInvestingComPort
    ) {
        return new LeadingIndicatorProcessor(
                leadingIndicatorInvestingComPort = leadingIndicatorInvestingComPort
        );
    }

    @Bean
    public LeadingIndicatorInvestingComPort investingComPort(
            LeadingIndicatorFeignClient leadingIndicatorFeignClient
    ) {
        return new LeadingIndicatorPortImpl(
                leadingIndicatorFeignClient = leadingIndicatorFeignClient
        );
    }
}