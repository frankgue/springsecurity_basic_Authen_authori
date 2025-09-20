package com.gkfcsolution.springsecurity_basic_authen_authori.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 12:05
 * File: null.java
 * Project: springsecurity_basic_Authen_authori
 *
 * @author Frank GUEKENG
 * @date 20/09/2025
 * @time 12:05
 */
@RestController
@RequestMapping("/api/v1/rest/auth")
public class ApplicationController {
@GetMapping("/getMsg")
    public String greeting(){
        return "Spring Security Authentication and Authorization";
    }
}
