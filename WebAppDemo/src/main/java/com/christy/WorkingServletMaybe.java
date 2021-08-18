package com.christy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkingServletMaybe {

    @RequestMapping("/")
    public String showHomePage(){
        return "employeeHomePage";
    }

}
