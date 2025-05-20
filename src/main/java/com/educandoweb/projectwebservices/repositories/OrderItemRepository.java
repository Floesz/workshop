package com.educandoweb.projectwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projectwebservices.entities.OrderItem;
import com.educandoweb.projectwebservices.entities.pk.*;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
