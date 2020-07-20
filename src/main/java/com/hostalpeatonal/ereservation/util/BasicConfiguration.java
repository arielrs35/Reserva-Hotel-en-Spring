/**
 * 
 */
package com.hostalpeatonal.ereservation.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Clase para manejar la seguridad
 * @author Kyozuke
 *
 */
@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter{
	protected void configure(HttpSecurity http) throws Exception{
	http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/app/login").permitAll()
		.failureUrl("/app/login?error=true")
		.defaultSuccessUrl("/app/home");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
				auth.inMemoryAuthentication()
				.withUser("Ariel")
				.password(encoder.encode("hostal"))
				.roles("USER");
	}
	
	@Override
	public void configure(WebSecurity security) {
		security.ignoring()
		.antMatchers("/resources(**","/static/**", "/css/**", "/js/**", "/images/**");
	}

}
