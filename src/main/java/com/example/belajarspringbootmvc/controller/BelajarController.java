package com.example.belajarspringbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BelajarController {
    @RequestMapping("/")
    public String root(){
        return "index";
    }
}