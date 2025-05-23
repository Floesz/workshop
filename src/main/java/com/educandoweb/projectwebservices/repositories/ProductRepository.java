package com.educandoweb.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projectwebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
