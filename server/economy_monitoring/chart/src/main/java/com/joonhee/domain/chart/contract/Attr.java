package com.joonhee.domain.chart.contract;

import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@JsonNaming
public class Attr {
    public long timestamp;
    public String actualState;
    public double actual;
    public String actualFormatted;
    public double forecast;
    public String forecastFormatted;
    public double revised;
    public String revisedFormatted;

    public ZonedDateTime getAnnouncedAt() {
        return Instant.ofEpochMilli(timestamp).atZone(ZoneId.of("UTC"));
    }
}