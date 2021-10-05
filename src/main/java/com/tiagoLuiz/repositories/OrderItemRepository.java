package com.tiagoLuiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoLuiz.entities.OrderItem;
import com.tiagoLuiz.entities.enums.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
