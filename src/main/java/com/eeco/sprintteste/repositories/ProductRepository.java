package com.eeco.sprintteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eeco.sprintteste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
