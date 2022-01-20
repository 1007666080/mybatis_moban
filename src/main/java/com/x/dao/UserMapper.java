package com.x.dao;

import com.x.pojo.User;

import java.util.List;

/**
 * @Author Lenovo
 * @Date 2022-01-20 14:56
 */
public interface UserMapper {
    List<User> userSelect();
}
