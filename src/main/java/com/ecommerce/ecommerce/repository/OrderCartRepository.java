package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.OrderCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCartRepository extends JpaRepository<OrderCartEntity, Long> {
}
