package com.artemdev.spring;

import com.artemdev.spring.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");

        // clazz -> String -> Map<String,Object> - запрос на создание bean-объекта;
        var connectionPool = context.getBean("pool-1", ConnectionPool.class);
        System.out.println(connectionPool);
    }
}

