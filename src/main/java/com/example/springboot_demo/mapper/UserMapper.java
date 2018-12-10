package com.example.springboot_demo.mapper;

import com.example.springboot_demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User findUser(@Param("account")String account);
}
