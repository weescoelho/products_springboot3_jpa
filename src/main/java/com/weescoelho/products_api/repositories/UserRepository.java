package com.weescoelho.products_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weescoelho.products_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
