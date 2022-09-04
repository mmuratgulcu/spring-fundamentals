package com.muratgulcu.springfundamentals.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "bean1")
public class User {

    @Autowired
    private UserController userController;

    private UserRepository userRepository;

    private UserService userService;

    private Advice advice;


    public User(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void testMethod(Advice advice){
        this.advice=advice;
    }
}
