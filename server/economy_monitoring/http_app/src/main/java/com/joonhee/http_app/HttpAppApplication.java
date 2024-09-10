package com.joonhee.http_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
        basePackages = {"com.joonhee.http_app", "com.joonhee.domain.chart"}
)
public class HttpAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpAppApplication.class, args);
    }

}
