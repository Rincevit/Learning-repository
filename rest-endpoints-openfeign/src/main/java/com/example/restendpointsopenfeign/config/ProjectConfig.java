package com.example.restendpointsopenfeign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = "com.example.restendpointsopenfeign.proxy")
public class ProjectConfig {
}
