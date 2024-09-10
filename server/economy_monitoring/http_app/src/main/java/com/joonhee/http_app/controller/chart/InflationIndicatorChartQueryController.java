package com.joonhee.http_app.controller.chart;

import com.joonhee.domain.chart.dto.ChartViewResponse;
import com.joonhee.domain.chart.usecase.LeadingIndicator;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1/chart")
public class InflationIndicatorChartQueryController {

    private final LeadingIndicator leadingIndicator;

    public InflationIndicatorChartQueryController(LeadingIndicator leadingIndicator) {
        this.leadingIndicator = leadingIndicator;
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping(value = "/cb-consumer")
    ChartViewResponse getCbConsumer() {
        return leadingIndicator.getCbConsumer();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/pce-price-index")
    ChartViewResponse getPcePriceIndex() {
        return leadingIndicator.getPcePriceIndex();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/personal-income")
    ChartViewResponse getPersonalIncome() {
        return leadingIndicator.getPersonalIncome();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/retail-sales")
    ChartViewResponse getRetailSales() {
        return leadingIndicator.getRetailSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/new-home-sales")
    ChartViewResponse getNewHomeSales() {
        return leadingIndicator.getNewHomeSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/existing-home-sales")
    ChartViewResponse getExistingHomeSales() {
        return leadingIndicator.getExistingHomeSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/all-car-sales")
    ChartViewResponse getAllCarSales() {
        return leadingIndicator.getAllCarSales();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/ism-manufacturing-pmi")
    ChartViewResponse getIsmManufacturingPmi() {
        return leadingIndicator.getIsmManufacturingPMI();
    }

    @Operation(tags = "InflationIndicator")
    @GetMapping("/manufacturing-pmi")
    ChartViewResponse getManufacturingPmi() {
        return leadingIndicator.getManufacturingPMI();
    }
}
