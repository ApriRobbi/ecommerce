package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.LoginDto;
import com.ecommerce.ecommerce.entity.CostumerEntity;

public interface LoginService {

    CostumerEntity login(LoginDto loginDto);
}
