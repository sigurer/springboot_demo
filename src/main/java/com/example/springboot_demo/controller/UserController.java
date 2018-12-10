package com.example.springboot_demo.controller;

import com.example.springboot_demo.domain.User;
import com.example.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/to_login")
    public String toLogin(@ModelAttribute User user){
        return "login";

    }


    @RequestMapping("/login")
    public String login(@ModelAttribute User user){
        if(userService.checkLogin(user.getAccount(),user.getPassword())){
            return "login_success";
        }else{
            return "failure";
        }
    }

}
