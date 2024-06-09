package com.joonhee.http_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
        basePackages = {"com.joonhee.http_app", "com.joonhee.domain.us_economy"}
)
//@ImportAutoConfiguration(FeignAutoConfiguration.class)
public class HttpAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpAppApplication.class, args);
    }

}
