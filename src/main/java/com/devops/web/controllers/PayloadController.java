package com.devops.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marciodasilva on 10/9/16.
 */
@Controller
public class PayloadController {
    public static final String PAYLOAD_VIEW_NAME="payload/payload";
    @RequestMapping("/payload")
    public String playload(){
        return PAYLOAD_VIEW_NAME;
    }
}
