package com.joonhee.domain.chart.port.out;

import com.joonhee.domain.chart.contract.ChartResponse;

public interface InflationIndicatorInvestingComPort {
    ChartResponse getCoreCpi();
    ChartResponse getCpi();
    ChartResponse getCorePpi();
    ChartResponse getEmploymentCostIndex();
    ChartResponse getAverageHourlyEarnings();
}
