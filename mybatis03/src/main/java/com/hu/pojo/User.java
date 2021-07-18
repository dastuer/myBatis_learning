package com.hu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok插件使用
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private String pwd;
    public User(String id,String pwd){
        this.id=id;
        this.pwd=pwd;
    }
}
