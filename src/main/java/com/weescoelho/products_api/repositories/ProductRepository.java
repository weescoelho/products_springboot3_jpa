package com.weescoelho.products_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weescoelho.products_api.entities.Product;

@Repository // Notation opcional -> JpaRepository já está registrado
public interface ProductRepository extends JpaRepository<Product, Long> {

}
