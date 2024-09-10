package com.joonhee.domain.chart.usecase;

import com.joonhee.domain.chart.dto.ChartViewResponse;

public interface LeadingIndicator {
    ChartViewResponse getCbConsumer();
    ChartViewResponse getPcePriceIndex();
    ChartViewResponse getPersonalIncome();
    ChartViewResponse getRetailSales();
    ChartViewResponse getNewHomeSales();
    ChartViewResponse getExistingHomeSales();
    ChartViewResponse getAllCarSales();
    ChartViewResponse getIsmManufacturingPMI();
    ChartViewResponse getManufacturingPMI();
}
