package com.joonhee.http_app.controller.chart.legacy;

import com.joonhee.domain.chart.contract.ChartData;
import com.joonhee.domain.chart.usecase.legacy.InflationIndicator;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public class LegacyLeadingIndicatorChartQueryController {
    private final InflationIndicator inflationIndicator;

    public LegacyLeadingIndicatorChartQueryController(InflationIndicator inflationIndicator) {
        this.inflationIndicator = inflationIndicator;
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/core-cpi")
    ChartData getCoreCpi() {
        return inflationIndicator.getCoreCpi();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/cpi")
    ChartData getCpi() {
        return inflationIndicator.getCpi();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/core-ppi")
    ChartData getCorePpi() {
        return inflationIndicator.getCorePpi();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/employment-cost-index")
    ChartData getEmploymentCostIndex() {
        return inflationIndicator.getEmploymentCostIndex();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/average-hourly-earnings")
    ChartData getAverageHourlyEarnings() {
        return inflationIndicator.getAverageHourlyEarnings();
    }
}
