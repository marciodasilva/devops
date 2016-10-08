package com.devops.backend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by marciodasilva on 10/8/16.
 */
public class MockEmailService extends AbstractEmailService {

    private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    @Override
    public void sendGenericEmailMessage(SimpleMailMessage message){
        LOG.debug("Simulating the email services....");
        LOG.info(message.toString());
        LOG.debug("Email sent..!");
    }
}
