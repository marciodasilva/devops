package com.devops.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by marciodasilva on 10/15/16.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.devops.backend.persistence.repository")
@EntityScan(basePackages = "com.devops.backend.persistence.domain.backend")
@EnableTransactionManagement
@PropertySource("file:///${user.home}/.devops/application-common.properties")
public class ApplicationConfig {
}
