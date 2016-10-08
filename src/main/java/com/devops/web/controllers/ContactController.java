package com.devops.web.controllers;

import com.devops.backend.service.EmailServices;
import com.devops.web.domain.frontend.FeedbackPojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by marciodasilva on 10/8/16.
 */
@Controller
public class ContactController {
    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);
    private static final String FEEDBACK_MODEL_KEY = "feedback";
    private static final String CONTACT_US_VIEW_NAME = "contact/contact";

    @Autowired
    private EmailServices emailServices;

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactGet(ModelMap model){
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);
        return ContactController.CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedback) {
        LOG.debug("Feedback POJO content: {}", feedback);
        emailServices.sendFeedbackEmail(feedback);
        return ContactController.CONTACT_US_VIEW_NAME;
    }
}
