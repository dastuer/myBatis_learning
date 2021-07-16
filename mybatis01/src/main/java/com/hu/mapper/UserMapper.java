package com.hu.mapper;

import com.hu.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserListLike(String name);
    User getUser(String id);
    int delUserById(String id);
    int insertUser(User user);
    int insertUser2(Map map);
    int updateUser(User user);
    int updateUserPwd(Map map);
}
