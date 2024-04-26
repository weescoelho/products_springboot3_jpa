package com.weescoelho.products_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weescoelho.products_api.entities.Category;

@Repository // Notation opcional -> JpaRepository já está registrado
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
