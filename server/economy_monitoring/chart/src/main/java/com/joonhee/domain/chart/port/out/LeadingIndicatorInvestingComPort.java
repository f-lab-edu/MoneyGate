package com.joonhee.domain.chart.port.out;

import com.joonhee.domain.chart.contract.ChartResponse;

public interface LeadingIndicatorInvestingComPort {
    ChartResponse getCbConsumer();
    ChartResponse getPcePriceIndex();
    ChartResponse getPersonalIncome();
    ChartResponse getRetailSales();
    ChartResponse getNewHomeSales();
    ChartResponse getExistingHomeSales();
    ChartResponse getAllCarSales();
    ChartResponse getIsmManufacturingPMI();
    ChartResponse getManufacturingPMI();
}
