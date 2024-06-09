package com.joonhee.domain.us_economy.service;

import com.joonhee.domain.us_economy.contract.ChartData;
import com.joonhee.domain.us_economy.contract.ChartResponse;
import com.joonhee.domain.us_economy.port.out.InflationIndicatorInvestingComPort;
import com.joonhee.domain.us_economy.usecase.InflationIndicator;

public class InflationIndicatorProcessor implements InflationIndicator {
    private final InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort;

    public InflationIndicatorProcessor(
            InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort
    ) {
        this.inflationIndicatorInvestingComPort = inflationIndicatorInvestingComPort;
    }

    @Override
    public ChartData getCoreCpi() {
        return ChartData.from(inflationIndicatorInvestingComPort.getCoreCpi());
    }

    @Override
    public ChartData getCpi() {
        return ChartData.from(inflationIndicatorInvestingComPort.getCpi());
    }

    @Override
    public ChartData getCorePpi() {
        return ChartData.from(inflationIndicatorInvestingComPort.getCorePpi());
    }

    @Override
    public ChartData getEmploymentCostIndex() {
        return ChartData.from(inflationIndicatorInvestingComPort.getEmploymentCostIndex());
    }

    @Override
    public ChartData getAverageHourlyEarnings() {
        return ChartData.from(inflationIndicatorInvestingComPort.getAverageHourlyEarnings());
    }
}
