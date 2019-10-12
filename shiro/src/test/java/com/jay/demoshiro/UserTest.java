package com.jay.demoshiro;

import com.jay.demoshiro.mapper.UserMapper;
import com.jay.demoshiro.model.User;
import com.jay.demoshiro.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Jay_Liu
 * @Description:
 * @Date: Created in 10:54 2018/3/27 0027
 * @Modified By:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @Test
    public void testUserMapper(){
        System.out.println("测试开始");
        User admin = userMapper.findByUsername("admin");
        System.out.println(admin.getPassword());

    }

    @Test
    public void testService(){
        System.out.println("测试开始");
        User user = userService.findByUsername("admin");
        System.out.println(user.getRoles());
    }


}
