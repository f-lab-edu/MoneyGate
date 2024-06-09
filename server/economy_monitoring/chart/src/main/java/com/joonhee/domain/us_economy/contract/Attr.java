package com.joonhee.domain.us_economy.contract;

import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Date;

@JsonNaming
class Attr {
    public Date timestamp;
    public String actualState;
    public double actual;
    public String actualFormatted;
    public double forecast;
    public String forecastFormatted;
    public double revised;
    public String revisedFormatted;
}