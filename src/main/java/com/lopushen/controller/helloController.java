package com.lopushen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by i.lopushen on 11/07/2016.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }
}
