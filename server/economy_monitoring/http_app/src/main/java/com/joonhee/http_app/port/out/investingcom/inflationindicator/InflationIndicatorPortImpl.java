package com.joonhee.http_app.port.out.investingcom.inflationindicator;

import com.joonhee.domain.us_economy.contract.ChartResponse;
import com.joonhee.domain.us_economy.port.out.InflationIndicatorInvestingComPort;

public class InflationIndicatorPortImpl implements InflationIndicatorInvestingComPort {
    private final InflationIndicatorFeignClient inflationIndicatorFeignClient;

    public InflationIndicatorPortImpl(InflationIndicatorFeignClient inflationIndicatorFeignClient) {
        this.inflationIndicatorFeignClient = inflationIndicatorFeignClient;
    }

    @Override
    public ChartResponse getCoreCpi() {
        return inflationIndicatorFeignClient.getCoreCpi();
    }

    @Override
    public ChartResponse getCpi() {
        return inflationIndicatorFeignClient.getCpi();
    }

    @Override
    public ChartResponse getCorePpi() {
        return inflationIndicatorFeignClient.getCorePpi();
    }

    @Override
    public ChartResponse getEmploymentCostIndex() {
        return inflationIndicatorFeignClient.getEmploymentCostIndex();
    }

    @Override
    public ChartResponse getAverageHourlyEarnings() {
        return inflationIndicatorFeignClient.getAverageHourlyEarnings();
    }
}
