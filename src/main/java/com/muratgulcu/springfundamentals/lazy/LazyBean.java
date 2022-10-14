package com.muratgulcu.springfundamentals.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {

    public LazyBean() {
        System.out.println("LazyBean oluşturuldu.");
    }

    public void yazdir(){
        System.out.println("LazyBean yazdir metodu çağırıldı.");
    }
}
