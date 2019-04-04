package com.YLYLO.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.YLYLO.entites.User;

@RestController
public class AlertController {

    private static final String template = "Hello ";

    @RequestMapping("/alert")
    public User alert() {
        return new User("Volkswagen GTI", "Seattle");
    }
}
