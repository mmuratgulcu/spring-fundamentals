package com.muratgulcu.springfundamentals;

import com.muratgulcu.app.AppBean;
import com.muratgulcu.app.AppBean2;
import com.muratgulcu.springfundamentals.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
//@ComponentScan(basePackageClasses = AppBean.class)

public class SpringFundamentalsApplication implements CommandLineRunner {

	@Autowired
	private AppBean bean;
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println("Bean sayısı : " + beanDefinitionCount);

	/*	String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}*/
	}





}
