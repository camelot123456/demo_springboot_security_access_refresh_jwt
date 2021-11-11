package com.springboottutorials.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboottutorials.userservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
