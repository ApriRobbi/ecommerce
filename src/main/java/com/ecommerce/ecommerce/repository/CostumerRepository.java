package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.CostumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<CostumerEntity, Long> {

    CostumerEntity findByEmailAndPassword(String email, String password);
}
