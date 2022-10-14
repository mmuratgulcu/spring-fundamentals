package com.muratgulcu.springfundamentals.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class LazyConfigurationBean {

    public LazyConfigurationBean() {
        System.out.println("LazyConfigurationBean oluşturuldu");
    }

    @Bean
    public Bmw bmw(){
        return new Bmw();
    }

    @Bean
    public Ford ford(){
        return new Ford();
    }


}
