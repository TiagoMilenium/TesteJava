package com.tiagoLuiz.repositories;

import com.tiagoLuiz.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
