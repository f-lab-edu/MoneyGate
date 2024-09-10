package com.joonhee.domain.chart.service.legacy;

import com.joonhee.domain.chart.contract.ChartData;
import com.joonhee.domain.chart.port.out.InflationIndicatorInvestingComPort;
import com.joonhee.domain.chart.usecase.legacy.InflationIndicator;

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
