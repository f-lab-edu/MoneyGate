package com.joonhee.http_app.configure.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.joonhee")
public class FeignClientConfig {
}
