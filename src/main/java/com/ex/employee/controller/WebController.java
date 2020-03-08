package com.ex.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server-version")
public class WebController {

    @GetMapping
    public String serverVersion() {
        return "Server version 1.0.0";
    }
}
