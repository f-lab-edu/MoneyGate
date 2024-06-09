package com.joonhee.domain.us_economy.usecase;

import com.joonhee.domain.us_economy.contract.ChartData;

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
