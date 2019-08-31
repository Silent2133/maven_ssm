package com.liuchao.controller;

import com.liuchao.domain.User;
import com.liuchao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findOne")
    public String findOne(Model model){

        User user = userService.findById(4);
        model.addAttribute("user",user);
        return "show";

    }
}
