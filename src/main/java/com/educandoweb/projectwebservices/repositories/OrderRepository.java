package com.educandoweb.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projectwebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
