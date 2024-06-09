package com.joonhee.http_app.port.out.investingcom.leadingindicator;

import com.joonhee.domain.us_economy.contract.ChartResponse;
import com.joonhee.domain.us_economy.port.out.LeadingIndicatorInvestingComPort;

public class LeadingIndicatorPortImpl implements LeadingIndicatorInvestingComPort {
    private final LeadingIndicatorFeignClient leadingIndicatorFeignClient;

    public LeadingIndicatorPortImpl(LeadingIndicatorFeignClient leadingIndicatorFeignClient) {
        this.leadingIndicatorFeignClient = leadingIndicatorFeignClient;
    }

    @Override
    public ChartResponse getCbConsumer() {
        return leadingIndicatorFeignClient.getCbConsumer();
    }

    @Override
    public ChartResponse getPcePriceIndex() {
        return leadingIndicatorFeignClient.getPce();
    }

    @Override
    public ChartResponse getPersonalIncome() {
        return leadingIndicatorFeignClient.getPersonalIncome();
    }

    @Override
    public ChartResponse getRetailSales() {
        return leadingIndicatorFeignClient.getRetailSales();
    }

    @Override
    public ChartResponse getNewHomeSales() {
        return leadingIndicatorFeignClient.getNewHomeSales();
    }

    @Override
    public ChartResponse getExistingHomeSales() {
        return leadingIndicatorFeignClient.getExistingHomeSales();
    }

    @Override
    public ChartResponse getAllCarSales() {
        return leadingIndicatorFeignClient.getAllCarSales();
    }

    @Override
    public ChartResponse getIsmManufacturingPMI() {
        return leadingIndicatorFeignClient.getIsmManufacturingPMI();
    }

    @Override
    public ChartResponse getManufacturingPMI() {
        return leadingIndicatorFeignClient.getManufacturingPMI();
    }
}
