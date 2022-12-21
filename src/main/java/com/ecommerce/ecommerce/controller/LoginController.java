package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.LoginDto;
import com.ecommerce.ecommerce.entity.CostumerEntity;
import com.ecommerce.ecommerce.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public CostumerEntity login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto);
    }
}
