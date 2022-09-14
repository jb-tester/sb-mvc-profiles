package com.example.sbmvcprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * *******************************
 * Created by irina on 9/25/2019.
 * Project: sb-mvc-profiles
 * *******************************
 */
@Controller
public class MyController {

    
    @Autowired
    private MyDataBean data;

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", data.getData());
        final String view_name = "home";
        return view_name;
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public ModelAndView test1() {

        ModelAndView mav = new ModelAndView("test1");
        mav.addObject("test1_name", "_value");
        return mav;
    }
}
