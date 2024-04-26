package com.weescoelho.products_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weescoelho.products_api.entities.Order;

@Repository // Notation opcional -> JpaRepository já está registrado
public interface OrderRepository extends JpaRepository<Order, Long> {

}
