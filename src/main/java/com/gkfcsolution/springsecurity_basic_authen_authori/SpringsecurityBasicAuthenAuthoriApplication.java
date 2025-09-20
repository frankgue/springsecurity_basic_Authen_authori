package com.gkfcsolution.springsecurity_basic_authen_authori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringsecurityBasicAuthenAuthoriApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityBasicAuthenAuthoriApplication.class, args);
	}

}
