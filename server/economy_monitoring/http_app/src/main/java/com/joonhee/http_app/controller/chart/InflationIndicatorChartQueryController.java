package com.joonhee.http_app.controller.chart;

import com.joonhee.domain.us_economy.contract.ChartData;
import com.joonhee.domain.us_economy.usecase.LeadingIndicator;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public class InflationIndicatorChartQueryController {
    private final LeadingIndicator leadingIndicator;

    public InflationIndicatorChartQueryController(LeadingIndicator leadingIndicator) {
        this.leadingIndicator = leadingIndicator;
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/cb-consumer")
    ChartData getCbConsumer() {
        return leadingIndicator.getCbConsumer();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/pce-price-index")
    ChartData getPcePriceIndex() {
        return leadingIndicator.getPcePriceIndex();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/personal-income")
    ChartData getPersonalIncome() {
        return leadingIndicator.getPersonalIncome();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/retail-sales")
    ChartData getRetailSales() {
        return leadingIndicator.getRetailSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/new-home-sales")
    ChartData getNewHomeSales() {
        return leadingIndicator.getNewHomeSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/existing-home-sales")
    ChartData getExistingHomeSales() {
        return leadingIndicator.getExistingHomeSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/all-car-sales")
    ChartData getAllCarSales() {
        return leadingIndicator.getAllCarSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/ism-manufacturing-pmi")
    ChartData getIsmManufacturingPmi() {
        return leadingIndicator.getIsmManufacturingPMI();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/manufacturing-pmi")
    ChartData getManufacturingPmi() {
        return leadingIndicator.getManufacturingPMI();
    }
}
