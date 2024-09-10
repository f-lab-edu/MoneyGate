package com.joonhee.domain.chart.usecase;

import com.joonhee.domain.chart.dto.ChartViewResponse;

public interface InflationIndicator {
    ChartViewResponse getCoreCpi();
    ChartViewResponse getCpi();
    ChartViewResponse getCorePpi();
    ChartViewResponse getEmploymentCostIndex();
    ChartViewResponse getAverageHourlyEarnings();
}
