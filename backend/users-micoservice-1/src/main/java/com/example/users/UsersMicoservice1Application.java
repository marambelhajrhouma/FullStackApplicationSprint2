package com.example.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.annotation.PostConstruct;
import com.example.users.entities.*;
import com.example.users.service.UserService;

@SpringBootApplication
public class UsersMicoservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicoservice1Application.class, args);
	}
	@Autowired
	UserService userService;
	/*
	 @PostConstruct
	void init_users() {
	//ajouter les rôles
	userService.addRole(new Role(null,"ADMIN"));
	userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null));
	userService.saveUser(new User(null,"maram","123",true,null));
	userService.saveUser(new User(null,"farah","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("admin", "USER");
	userService.addRoleToUser("nadhem", "USER");
	userService.addRoleToUser("yassine", "USER");
	} */
/*	
	 @Bean
	 BCryptPasswordEncoder getBCE() {
	 return new BCryptPasswordEncoder();
	 }
	*/
}