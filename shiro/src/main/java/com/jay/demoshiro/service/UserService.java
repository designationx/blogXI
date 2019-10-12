package com.jay.demoshiro.service;

import com.jay.demoshiro.model.User;

/**
 * @Author: Jay_Liu
 * @Description:
 * @Date: Created in 21:21 2018/3/24 0024
 * @Modified By:
 */
public interface UserService {

    User findByUsername(String username);
}
