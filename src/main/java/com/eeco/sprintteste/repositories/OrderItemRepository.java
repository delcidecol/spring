package com.eeco.sprintteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eeco.sprintteste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
