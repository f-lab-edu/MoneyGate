package com.joonhee.domain.chart.contract;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChartData {
    public List<Data> data;
    public List<Attr> attr;


    public ChartData(
            List<Data> data,
            List<Attr> attr
    ) {
        this.data = data;
        this.attr = attr;
    }

    static public class Data {
        Long value;
        Double percent;

        public Data(Long value, Double percent) {
            this.value = value;
            this.percent = percent;
        }
    }

    public static ChartData from(ChartResponse chartResponse) {
        try {
            return new ChartData(
                    chartResponse.data.stream()
                            .map(data ->
                                    new Data(
                                            Optional.ofNullable(data.get(0)).map(o -> (Long) o).orElseThrow(),
                                            Optional.ofNullable(data.get(1)).map(o -> Double.valueOf(o.toString())).orElseThrow()
                                    ))
                            .collect(Collectors.toList()
                            ),
                    chartResponse.attr
            );
        } catch (Exception e) {
            return null;
        }
    }
}
