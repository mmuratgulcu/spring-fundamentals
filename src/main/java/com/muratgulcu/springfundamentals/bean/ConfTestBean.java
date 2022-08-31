package com.muratgulcu.springfundamentals.bean;

import com.muratgulcu.springfundamentals.component.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(value = "bean100",proxyBeanMethods = true)
public class ConfTestBean {

    @Bean(value = "testBean123")
    public TestBean testBean(){
        TestBean testBean = new TestBean();
        testBean.setTitle("deneme");
        return testBean;
    }

    @Bean(value = "user-controller")
    public UserController userController(){
        return new UserController();
    }
}
