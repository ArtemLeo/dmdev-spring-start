package com.artemdev.spring;

import com.artemdev.spring.database.pool.ConnectionPool;
import com.artemdev.spring.database.repository.CompanyRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {

            // clazz -> String -> Map<String,Object> - запрос на создание bean-объекта;
            var connectionPool = context.getBean("pool-1", ConnectionPool.class);
            System.out.println(connectionPool);

            var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
        }
    }
}

