package com.devops.config;

import com.devops.backend.service.EmailServices;
import com.devops.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by marciodasilva on 10/8/16.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.devops/application-dev.properties")
public class DevelopmentConfig {
    @Bean
    public EmailServices emailServices(){
        return new MockEmailService();
    }
}
