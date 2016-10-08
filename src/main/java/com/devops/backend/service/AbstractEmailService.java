package com.devops.backend.service;

import com.devops.web.domain.frontend.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;


/**
 * Created by marciodasilva on 10/8/16.
 */

public abstract class AbstractEmailService implements EmailServices{

    @Value("${default.to.address}")
    private String defaulToAddress;
    protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPojo feedback){
        Logger LOG = LoggerFactory.getLogger(AbstractEmailService.class);
        LOG.debug("Address: defaultToAddress = {}", defaulToAddress);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaulToAddress);
        message.setFrom(feedback.getEmail());
        message.setSubject("[DevOps Buddy]: Feedback received from " + feedback.getFirstName() + " " + feedback
                .getLastName() + "!");
        message.setText(feedback.getFeedback());
        return message;  // for now!
     }

    @Override
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedbackPojo));
    }
}
