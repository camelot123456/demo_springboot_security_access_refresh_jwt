package com.springboottutorials.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboottutorials.userservice.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{

	Role findByName(String name);
	
}
