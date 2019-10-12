package com.xi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    /**
     * 验证用户是否登录
     * @return true登录，false未登录
     */
    @PostMapping("/islogin")
    public boolean isLogin(){
        return true;
    }

    /**
     * 用户登录操作
     * @return true登录成功，flase登录失败
     */
    @PostMapping("/inlogin")
    public boolean inLogin(){
        return true;
    }

    /**
     * 用户注销操作
     * @return true注销成功，flase注销失败
     */
    @PostMapping("/outlogin")
    public boolean outLogin(){
        return true;
    }
}
