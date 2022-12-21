package com.ecommerce.ecommerce.service.impl;

import com.ecommerce.ecommerce.entity.CostumerEntity;
import com.ecommerce.ecommerce.repository.CostumerRepository;
import com.ecommerce.ecommerce.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerServiceImpl implements CostumerService {

    @Autowired
    CostumerRepository costumerRepository;

    @Override
    public CostumerEntity createCostumer(CostumerEntity costumerEntity) {

        return costumerRepository.save(costumerEntity);
    }
}
