package com.joonhee.domain.chart.dto;

import com.joonhee.domain.chart.contract.ChartResponse;

import java.util.List;
import java.util.stream.Collectors;


public class ChartViewResponse {
    public ChartType type;
    public List<AnnouncedData> content;

    public ChartViewResponse(List<AnnouncedData> content, ChartType type) {
        this.content = content;
        this.type = type;
    }

    public static ChartViewResponse from(ChartResponse chartResponse, ChartType type) {
        List<AnnouncedData> content = chartResponse.attr.stream().map(attr -> new AnnouncedData(
                attr.actual,
                attr.forecast,
                -1f,
                attr.getAnnouncedAt()
        )).collect(Collectors.toList());
        return new ChartViewResponse(content, type);
    }
}

