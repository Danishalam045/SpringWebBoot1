package com.telusko.SpringBootWeb1;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home(){
        System.out.println("HomeController called");
        return "index.jsp";
    }
}
