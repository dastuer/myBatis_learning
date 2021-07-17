package com.hu.mapper;

import com.hu.pojo.User02;

import java.util.List;
import java.util.Map;

public interface UserMapper02 {
    List<User02> getUserList();
    List<User02> getUserListByLimit(Map map);
    List<User02> getUserListRowBound();
}
