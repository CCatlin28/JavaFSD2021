package com.christy;

@Controller
public class GreetingController {
    @RequestMapping("/web")
    public String showHomePage(){
        return "WelcomePage";
    }
}
