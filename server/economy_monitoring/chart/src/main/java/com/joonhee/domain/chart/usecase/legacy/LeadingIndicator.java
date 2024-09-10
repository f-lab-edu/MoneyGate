package com.joonhee.domain.chart.usecase.legacy;

import com.joonhee.domain.chart.contract.ChartData;

public interface LeadingIndicator {
    ChartData getCbConsumer();
    ChartData getPcePriceIndex();
    ChartData getPersonalIncome();
    ChartData getRetailSales();
    ChartData getNewHomeSales();
    ChartData getExistingHomeSales();
    ChartData getAllCarSales();
    ChartData getIsmManufacturingPMI();
    ChartData getManufacturingPMI();
}
