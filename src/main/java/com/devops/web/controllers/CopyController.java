package com.devops.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marciodasilva on 10/8/16.
 */
@Controller
public class CopyController {
    @RequestMapping("/about")
    public String about(){
        return "copy/about";
    }
}
