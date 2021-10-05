package com.tiagoLuiz.repositories;

import com.tiagoLuiz.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
