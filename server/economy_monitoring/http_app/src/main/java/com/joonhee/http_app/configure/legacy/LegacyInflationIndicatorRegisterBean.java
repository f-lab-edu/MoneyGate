package com.joonhee.http_app.configure.legacy;

import com.joonhee.domain.chart.port.out.InflationIndicatorInvestingComPort;
import com.joonhee.domain.chart.service.legacy.InflationIndicatorProcessor;
import com.joonhee.domain.chart.usecase.legacy.InflationIndicator;
import com.joonhee.http_app.port.out.investingcom.inflationindicator.InflationIndicatorFeignClient;
import com.joonhee.http_app.port.out.investingcom.inflationindicator.InflationIndicatorPortImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LegacyInflationIndicatorRegisterBean {
    @Bean
    public InflationIndicator legacyInflationIndicatorService(
            InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort
    ) {
        return new InflationIndicatorProcessor(
                inflationIndicatorInvestingComPort = inflationIndicatorInvestingComPort
        );
    }

    @Bean
    public InflationIndicatorInvestingComPort legacyInflationIndicatorInvestingComPort(
            InflationIndicatorFeignClient inflationIndicatorFeignClient
    ) {
        return new InflationIndicatorPortImpl(
                inflationIndicatorFeignClient = inflationIndicatorFeignClient
        );
    }
}