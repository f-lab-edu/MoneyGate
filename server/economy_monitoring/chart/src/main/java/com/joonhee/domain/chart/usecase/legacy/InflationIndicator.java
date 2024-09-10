package com.joonhee.domain.chart.usecase.legacy;

import com.joonhee.domain.chart.contract.ChartData;

public interface InflationIndicator {
    ChartData getCoreCpi();
    ChartData getCpi();
    ChartData getCorePpi();
    ChartData getEmploymentCostIndex();
    ChartData getAverageHourlyEarnings();
}
