package com.weescoelho.products_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weescoelho.products_api.entities.User;

@Repository // Notation opcional -> JpaRepository já está registrado
public interface UserRepository extends JpaRepository<User, Long> {

}
