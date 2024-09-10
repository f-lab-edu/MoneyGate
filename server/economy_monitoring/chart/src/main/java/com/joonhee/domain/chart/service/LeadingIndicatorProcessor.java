package com.joonhee.domain.chart.service;

import com.joonhee.domain.chart.dto.ChartType;
import com.joonhee.domain.chart.dto.ChartViewResponse;
import com.joonhee.domain.chart.port.out.LeadingIndicatorInvestingComPort;
import com.joonhee.domain.chart.usecase.LeadingIndicator;

public class LeadingIndicatorProcessor implements LeadingIndicator {
    private final LeadingIndicatorInvestingComPort leadingIndicatorInvestingComPort;

    public LeadingIndicatorProcessor(
            LeadingIndicatorInvestingComPort leadingIndicatorInvestingComPort
    ) {
        this.leadingIndicatorInvestingComPort = leadingIndicatorInvestingComPort;
    }

    @Override
    public ChartViewResponse getCbConsumer() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getCbConsumer(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getPcePriceIndex() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getPcePriceIndex(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getPersonalIncome() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getPersonalIncome(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getRetailSales() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getRetailSales(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getNewHomeSales() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getNewHomeSales(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getExistingHomeSales() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getExistingHomeSales(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getAllCarSales() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getAllCarSales(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getIsmManufacturingPMI() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getIsmManufacturingPMI(), ChartType.LEADING_INDICATOR);
    }

    @Override
    public ChartViewResponse getManufacturingPMI() {
        return ChartViewResponse.from(leadingIndicatorInvestingComPort.getManufacturingPMI(), ChartType.LEADING_INDICATOR);
    }
}
