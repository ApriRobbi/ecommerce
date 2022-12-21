package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.entity.CostumerEntity;
import com.ecommerce.ecommerce.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CostumerController {

    @Autowired
    private CostumerService costumerService;

    @PostMapping("/costumer")
    public CostumerEntity create(@RequestBody CostumerEntity costumerEntity){
        return costumerService.createCostumer(costumerEntity);
    }
}
