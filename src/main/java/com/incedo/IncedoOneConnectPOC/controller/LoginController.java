package com.incedo.IncedoOneConnectPOC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        System.out.println("Inside GET Login");
        return "login";
    }
//    @PostMapping("/login")
//    public String doLogin(@ModelAttribute("user") IncedoUser user ) {
//        System.out.println("username received:"+user.getUsername());
//        return "loginSuccess";
//    }
}
