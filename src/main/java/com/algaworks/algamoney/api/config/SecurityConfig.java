package com.algaworks.algamoney.api.config;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticantionManagerBuilder auth) throws Exception{
		
	}
}
