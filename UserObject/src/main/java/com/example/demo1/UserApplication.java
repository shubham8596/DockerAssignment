package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UserApplication.class);
    }
	
	public static void main(String[] args) {
	//	System.setProperty("server.port","8080");
		SpringApplication.run(UserApplication.class, args);
	}
	/*
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
		builder.userDetailsService(new UserDetailsService() {
		
			@Override
			public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
				// TODO Auto-generated method stub
				return new CustomUserDetails(repo.findUsername(s));
			}

			
	});
		
	}*/
}
