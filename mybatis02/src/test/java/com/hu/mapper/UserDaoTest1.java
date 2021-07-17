package com.hu.mapper;

import com.hu.pojo.User02;
import com.hu.utils.MybatisUtil02;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest1 {
    @Test
    public void testDao1(){
        SqlSession session = MybatisUtil02.getSession();
        List<User02> users = session.selectList("getUserList");
        System.out.println(users);
        session.close();
    }
    @Test
    public void userListLimitTest(){
        SqlSession session = MybatisUtil02.getSession();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("startPage",0);
        map.put("pageSize",2);
        UserMapper02 mapper = session.getMapper(UserMapper02.class);
        List<User02> users = mapper.getUserListByLimit(map);
        System.out.println(users);
        session.close();
    }
    @Test
    public void rowBoundLimitTest(){
        SqlSession session = MybatisUtil02.getSession();
        // rowBounds实现分页
        RowBounds rowBounds = new RowBounds(0,3);
        List<User02> list = session.selectList("getUserListRowBound", null, rowBounds);
        System.out.println(list);
        session.close();
    }
}
