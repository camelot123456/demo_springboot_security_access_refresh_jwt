package com.springboottutorials.userservice.service;

import java.util.List;

import com.springboottutorials.userservice.domain.Role;
import com.springboottutorials.userservice.domain.User;

public interface UserService {

	User saveUSer(User user);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User getUser(String username);
	List<User> getUsers();
	
}
