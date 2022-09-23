package com.muratgulcu.springfundamentals.component;

import org.springframework.stereotype.Service;

@Service("beanServiceTest")
public class UserService {

    private String name = "Ali";

    public String getName() {
        return name;
    }
}