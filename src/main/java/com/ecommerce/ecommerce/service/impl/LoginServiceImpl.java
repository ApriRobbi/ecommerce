package com.ecommerce.ecommerce.service.impl;

import com.ecommerce.ecommerce.dto.LoginDto;
import com.ecommerce.ecommerce.entity.CostumerEntity;
import com.ecommerce.ecommerce.entity.OrderCartEntity;
import com.ecommerce.ecommerce.repository.CostumerRepository;
import com.ecommerce.ecommerce.service.LoginService;
import com.ecommerce.ecommerce.service.OrderCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    CostumerRepository costumerRepository;

    @Autowired
    OrderCartService orderCartService;

    @Override
    public CostumerEntity login(LoginDto loginDto) {

        CostumerEntity costumerEntity = costumerRepository.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());

        if (costumerEntity.getOrderCartId() == null) {
            OrderCartEntity orderCartEntity = new OrderCartEntity();
            orderCartEntity.setOrderCartType("WHISTLIST");
            orderCartEntity.setCostumerId(costumerEntity.getCostumerId());
            orderCartService.create(orderCartEntity);
            costumerEntity.setOrderCartId(orderCartEntity.getOrderCartId());
            costumerRepository.save(costumerEntity);
        } else {
            costumerEntity.getOrderCartId();
        }
        return costumerEntity;
    }
}
