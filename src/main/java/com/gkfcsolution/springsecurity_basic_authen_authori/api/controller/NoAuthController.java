package com.gkfcsolution.springsecurity_basic_authen_authori.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 14:08
 * File: null.java
 * Project: springsecurity_basic_Authen_authori
 *
 * @author Frank GUEKENG
 * @date 20/09/2025
 * @time 14:08
 */
@RestController
@RequestMapping("/public/api/v1/rest")
public class NoAuthController {

    @GetMapping("/sayHi")
    public String sayHello(){
        return "Hello from no Authentication Controller";
    }
}
