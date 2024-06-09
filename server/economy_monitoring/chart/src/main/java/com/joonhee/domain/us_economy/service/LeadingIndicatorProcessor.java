package com.joonhee.domain.us_economy.service;

import com.joonhee.domain.us_economy.contract.ChartData;
import com.joonhee.domain.us_economy.port.out.LeadingIndicatorInvestingComPort;
import com.joonhee.domain.us_economy.usecase.LeadingIndicator;

public class LeadingIndicatorProcessor implements LeadingIndicator {
    private final LeadingIndicatorInvestingComPort leadingIndicatorInvestingComPort;

    public LeadingIndicatorProcessor(
            LeadingIndicatorInvestingComPort leadingIndicatorInvestingComPort
    ) {
        this.leadingIndicatorInvestingComPort = leadingIndicatorInvestingComPort;
    }

    @Override
    public ChartData getCbConsumer() {
        return ChartData.from(leadingIndicatorInvestingComPort.getCbConsumer());
    }

    @Override
    public ChartData getPcePriceIndex() {
        return ChartData.from(leadingIndicatorInvestingComPort.getPcePriceIndex());
    }

    @Override
    public ChartData getPersonalIncome() {
        return ChartData.from(leadingIndicatorInvestingComPort.getPersonalIncome());
    }

    @Override
    public ChartData getRetailSales() {
        return ChartData.from(leadingIndicatorInvestingComPort.getRetailSales());
    }

    @Override
    public ChartData getNewHomeSales() {
        return ChartData.from(leadingIndicatorInvestingComPort.getNewHomeSales());
    }

    @Override
    public ChartData getExistingHomeSales() {
        return ChartData.from(leadingIndicatorInvestingComPort.getExistingHomeSales());
    }

    @Override
    public ChartData getAllCarSales() {
        return ChartData.from(leadingIndicatorInvestingComPort.getAllCarSales());
    }

    @Override
    public ChartData getIsmManufacturingPMI() {
        return ChartData.from(leadingIndicatorInvestingComPort.getIsmManufacturingPMI());
    }

    @Override
    public ChartData getManufacturingPMI() {
        return ChartData.from(leadingIndicatorInvestingComPort.getManufacturingPMI());
    }
}
