package com.hu.mapper;

import com.hu.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//使用注解开发

public interface UserMapper {
    @Select("select * from `user`")
    List<User> getUsers();
    @Select("select from user where id = #{id}")
    User getUser(@Param("id") String id);
    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") String id);
    @Update("update user set name=#{name} where id=#{id}")
    int updateName(@Param("name") String name,@Param("id") String id);
    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);
    @Insert("insert into user value(#{id},#{name},#{pwd})")
    int addUser(User user);
}
