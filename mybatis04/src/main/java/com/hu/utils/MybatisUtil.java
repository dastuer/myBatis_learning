package com.hu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory factory = null;
    static {
        try {
            String res = "mybatis-config.xml";
//            引入外部配置信息
//            Properties prop = new Properties();
//            InputStream pIn = Resources.getResourceAsStream("db.properties");
//            prop.load(pIn);
            InputStream in = Resources.getResourceAsStream(res);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(in);
//            factory = builder.build(in,prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return factory.openSession(true);
    }
}
