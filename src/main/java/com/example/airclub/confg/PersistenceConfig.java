package com.example.airclub.confg;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.airclub.dao")
public class PersistenceConfig {
}
