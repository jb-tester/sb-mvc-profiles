package com.example.sbmvcprofiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form() {
        return new ModelAndView("form", "command", "form");
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    @ResponseBody
    public String process(String myForm) {
        return "submitted";
    }
}