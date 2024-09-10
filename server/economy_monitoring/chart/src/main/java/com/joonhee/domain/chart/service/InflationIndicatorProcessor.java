package com.joonhee.domain.chart.service;

import com.joonhee.domain.chart.dto.ChartType;
import com.joonhee.domain.chart.dto.ChartViewResponse;
import com.joonhee.domain.chart.port.out.InflationIndicatorInvestingComPort;
import com.joonhee.domain.chart.usecase.InflationIndicator;

public class InflationIndicatorProcessor implements InflationIndicator {
    private final InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort;

    public InflationIndicatorProcessor(
            InflationIndicatorInvestingComPort inflationIndicatorInvestingComPort
    ) {
        this.inflationIndicatorInvestingComPort = inflationIndicatorInvestingComPort;
    }

    @Override
    public ChartViewResponse getCoreCpi() {
        return ChartViewResponse.from(inflationIndicatorInvestingComPort.getCoreCpi(), ChartType.INFLATION_INDICATOR);
    }

    @Override
    public ChartViewResponse getCpi() {
        return ChartViewResponse.from(inflationIndicatorInvestingComPort.getCpi(), ChartType.INFLATION_INDICATOR);
    }

    @Override
    public ChartViewResponse getCorePpi() {
        return ChartViewResponse.from(inflationIndicatorInvestingComPort.getCorePpi(), ChartType.INFLATION_INDICATOR);
    }

    @Override
    public ChartViewResponse getEmploymentCostIndex() {
        return ChartViewResponse.from(inflationIndicatorInvestingComPort.getEmploymentCostIndex(), ChartType.INFLATION_INDICATOR);
    }

    @Override
    public ChartViewResponse getAverageHourlyEarnings() {
        return ChartViewResponse.from(inflationIndicatorInvestingComPort.getAverageHourlyEarnings(), ChartType.INFLATION_INDICATOR);
    }
}
