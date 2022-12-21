package com.ecommerce.ecommerce.service.impl;

import com.ecommerce.ecommerce.entity.OrderCartEntity;
import com.ecommerce.ecommerce.repository.OrderCartRepository;
import com.ecommerce.ecommerce.service.OrderCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCartServiceImpl implements OrderCartService {

    @Autowired
    OrderCartRepository orderCartRepository;

    @Override
    public void create(OrderCartEntity orderCartEntity) {
        orderCartRepository.save(orderCartEntity);
    }
}
