package com.joonhee.domain.chart.dto;

import java.time.ZonedDateTime;

public class AnnouncedData {
    public double actual;
    public double consensus;
    public double last;
    public ZonedDateTime announcedAt;

    public AnnouncedData(double actual, double consensus, double last, ZonedDateTime announcedAt) {
        this.actual = actual;
        this.consensus = consensus;
        this.last = last;
        this.announcedAt = announcedAt;
    }
}