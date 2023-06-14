package com.eeco.sprintteste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eeco.sprintteste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
