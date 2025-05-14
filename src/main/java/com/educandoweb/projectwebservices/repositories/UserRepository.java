package com.educandoweb.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projectwebservices.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
}
