package com.jay.demoshiro.service;

import com.jay.demoshiro.mapper.UserMapper;
import com.jay.demoshiro.model.User;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @Author: Jay_Liu
 * @Description:
 * @Date: Created in 21:22 2018/3/24 0024
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
