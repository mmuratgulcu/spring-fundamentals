package com.muratgulcu.springfundamentals.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LazyBeanApp {

    private final LazyBean lazyBean;

    public LazyBeanApp(@Lazy LazyBean lazyBean) {
        this.lazyBean = lazyBean;
        System.out.println("LazyBeanApp oluşturuldu");
    }

    @GetMapping()
    public void test(){
        lazyBean.yazdir();
    }
}
