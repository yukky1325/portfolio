package com.todojava.tasklist.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {

        return "login";
    }

    @GetMapping("/logout")
    public String showLogout() {

        return "logout";
    }


}
