package com.joonhee.domain.us_economy.usecase;

import com.joonhee.domain.us_economy.contract.ChartData;

public interface InflationIndicator {
    ChartData getCoreCpi();
    ChartData getCpi();
    ChartData getCorePpi();
    ChartData getEmploymentCostIndex();
    ChartData getAverageHourlyEarnings();
}
