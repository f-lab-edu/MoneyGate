package com.joonhee.http_app.configure;

import com.joonhee.domain.us_economy.port.out.InflationIndicatorInvestingComPort;
import com.joonhee.domain.us_economy.service.InflationIndicatorProcessor;
import com.joonhee.domain.us_economy.usecase.InflationIndicator;
import com.joonhee.http_app.port.out.investingcom.inflationindicator.InflationIndicatorFeignClient;
import com.joonhee.http_app.port.out.investingcom.inflationindicator.InflationIndicatorPortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class InflationIndicatorRegisterBean {
    @Bean
    public InflationIndicator InflationIndicatorService(
            InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort
    ) {
        return new InflationIndicatorProcessor(
                inflationIndicatorInvestingComPort = inflationIndicatorInvestingComPort
        );
    }

    @Bean
    public InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort(
            InflationIndicatorFeignClient inflationIndicatorFeignClient
    ) {
        return new InflationIndicatorPortImpl(
                inflationIndicatorFeignClient = inflationIndicatorFeignClient
        );
    }
}