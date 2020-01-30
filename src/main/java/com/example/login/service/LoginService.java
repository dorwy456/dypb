package com.example.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.mapper.LoginMapper;
import com.example.login.vo.User;

@Service
public class LoginService {
 
    @Autowired
    LoginMapper loginMapper;
    
    public List<User> getAll() throws Exception{
        return loginMapper.getLoginInfo();
    }
}