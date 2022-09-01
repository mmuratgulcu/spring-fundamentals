package com.muratgulcu.springfundamentals.component;

import com.muratgulcu.app.AppBean;
import com.muratgulcu.app.AppBean2;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration("testBean")
@Import(value = {AppBean.class, AppBean2.class})
public class AppConfig {
}
