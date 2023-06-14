package com.eeco.sprintteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eeco.sprintteste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
