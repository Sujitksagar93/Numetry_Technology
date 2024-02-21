package com.psring.security.springsecurity.config;


import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User.UserBuilder;





@Configuration
public class SecurityConfiguration {
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(authorize -> authorize
        .requestMatchers("/home/public").permitAll()
        .anyRequest().authenticated());
		
		
		return httpSecurity.build();
	}

}
