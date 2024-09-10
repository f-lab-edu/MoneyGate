package com.joonhee.http_app.configure.legacy;

import com.joonhee.domain.chart.port.out.LeadingIndicatorInvestingComPort;
import com.joonhee.domain.chart.service.legacy.LeadingIndicatorProcessor;
import com.joonhee.domain.chart.usecase.legacy.LeadingIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LegacyLeadingIndicatorRegisterBean {
    @Bean
    public LeadingIndicator legacyLeadingIndicatorService(
            LeadingIndicatorInvestingComPort leadingIndicatorInvestingComPort
    ) {
        return new LeadingIndicatorProcessor(
                leadingIndicatorInvestingComPort = leadingIndicatorInvestingComPort
        );
    }
}