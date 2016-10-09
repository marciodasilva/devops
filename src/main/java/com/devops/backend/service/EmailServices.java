package com.devops.backend.service;

import com.devops.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by marciodasilva on 10/8/16.
 */
public interface EmailServices {
    /**
     * @param feedback
     */
    public void sendFeedbackEmail(FeedbackPojo feedback);

    /**
     * @param message
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
