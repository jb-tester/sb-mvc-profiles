package com.example.sbmvcprofiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * *******************************
 * Created by irina on 9/25/2019.
 * Project: sb-mvc-profiles
 * *******************************
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "home_attr1");
        final String view_name = "home";
        return view_name;
    }

    @RequestMapping(value = "/test1")
    public ModelAndView test1() {

        ModelAndView mav = new ModelAndView("test1");
        mav.addObject("test1_name", "_value");
        return mav;
    }
}
