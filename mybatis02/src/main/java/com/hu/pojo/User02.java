package com.hu.pojo;

import org.apache.ibatis.type.Alias;


public class User02 {
    private String id;
    private String name;
    private String password;
    public User02() {
    }
    public User02(String id, String password) {
        this.id = id;
        this.password=password;
    }
    public User02(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return password;
    }

    public void setPwd(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User02{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
