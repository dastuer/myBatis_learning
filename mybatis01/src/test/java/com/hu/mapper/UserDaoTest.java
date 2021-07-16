package com.hu.mapper;

import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.hu.utils.MybatisUtil;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void testDao1(){
        SqlSession session = MybatisUtil.getSession();

        List<User> users = session.selectList("getUserList");
        System.out.println(users);

        session.close();
    }
    @Test
    public void testGetUserListLike(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println(mapper.getUserListLike("李"));
        session.close();
    }
    @Test
    public void testGetUser(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println(mapper.getUser("a001"));
        session.close();
    }
    @Test
    public void testAddUser(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.insertUser(new User("a004","里啊","sabdhjsdja"));
//        增删改必须提交事务
        session.commit();
        session.close();
    }
    @Test
    public void testAddUser2(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("userId","a003");
        map.put("userName","海德堡");
        map.put("password","sgudhs");
        mapper.insertUser2(map);
        session.commit();
        session.close();
    }
    @Test
    public void updateUser(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser(new User("a001","好好好","1212121"));
        session.commit();
        session.close();
    }
    @Test
    public void updateUserPwd(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id","a004");
        map.put("pwd","asddsdasd");
        mapper.updateUserPwd(map);
        session.commit();
        session.close();
    }
    @Test
    public void delUser(){
        SqlSession session = MybatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.delUserById("a001");
        session.commit();
        session.close();
    }

}
