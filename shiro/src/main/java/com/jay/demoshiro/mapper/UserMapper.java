package com.jay.demoshiro.mapper;

import com.jay.demoshiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Jay_Liu
 * @Description:
 * @Date: Created in 21:19 2018/3/24 0024
 * @Modified By:
 */
public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
