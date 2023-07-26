package com.artemdev.spring;

import com.artemdev.spring.database.pool.ConnectionPool;
import com.artemdev.spring.database.repository.CompanyRepository;
import com.artemdev.spring.database.repository.UserRepository;
import com.artemdev.spring.ioc.Container;
import com.artemdev.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var container = new Container();

//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);
        var userService = container.get(UserService.class);
        // TODO: 26.07.2023 userService
    }
}
