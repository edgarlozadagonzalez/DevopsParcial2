package com.parcial.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String home(){
        return "Parcial 2 - Devops Pipelines CI/CD\n Edgar David Lozada Gonzalez";
    }
}
