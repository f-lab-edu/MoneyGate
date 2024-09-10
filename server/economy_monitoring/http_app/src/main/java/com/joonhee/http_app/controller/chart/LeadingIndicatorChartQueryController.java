package com.joonhee.http_app.controller.chart;

import com.joonhee.domain.chart.dto.ChartViewResponse;
import com.joonhee.domain.chart.usecase.InflationIndicator;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/chart")
public class LeadingIndicatorChartQueryController {
    private final InflationIndicator inflationIndicator;

    public LeadingIndicatorChartQueryController(InflationIndicator inflationIndicator) {
        this.inflationIndicator = inflationIndicator;
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/core-cpi")
    ChartViewResponse getCoreCpi() {
        return inflationIndicator.getCoreCpi();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/cpi")
    ChartViewResponse getCpi() {
        return inflationIndicator.getCpi();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/core-ppi")
    ChartViewResponse getCorePpi() {
        return inflationIndicator.getCorePpi();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/employment-cost-index")
    ChartViewResponse getEmploymentCostIndex() {
        return inflationIndicator.getEmploymentCostIndex();
    }

    @Operation(tags = "LeadingIndicator")
    @GetMapping("/average-hourly-earnings")
    ChartViewResponse getAverageHourlyEarnings() {
        return inflationIndicator.getAverageHourlyEarnings();
    }
}
