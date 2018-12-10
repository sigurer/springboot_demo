package com.example.springboot_demo.service;

import com.example.springboot_demo.domain.User;
import com.example.springboot_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean checkLogin(String account,String password) {
        User user = userMapper.findUser(account);
        if(password.equals(user.getPassword())){
            return true;
        } else {
            return false;
        }
    }
}
