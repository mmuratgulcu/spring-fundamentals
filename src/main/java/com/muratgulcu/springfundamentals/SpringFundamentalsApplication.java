package com.muratgulcu.springfundamentals;

import com.muratgulcu.app.AppBean;
import com.muratgulcu.app.AppBean2;
import com.muratgulcu.springfundamentals.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;


@SpringBootApplication

@PropertySources({
		@PropertySource("classpath:config.properties"),
		@PropertySource("classpath:config.properties")
})
//@ComponentScan(basePackageClasses = AppBean.class)
public class SpringFundamentalsApplication implements CommandLineRunner {

	@Autowired
	private AppBean bean;

	@Autowired
	private Environment environment;

	@Value(value = "Murat")
	private String isim;

	@Value("${ad}")
	private String ad;

	@Value("${surname2:Muhammet}")
	private String soyisim;

	@Value("#{beanServiceTest.name}")
	private String userServiceBeanName;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentalsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println("Bean sayısı : " + beanDefinitionCount);

		Object singletonBean = applicationContext.getBean("singletonBean");
		System.out.println(singletonBean);
		singletonBean = applicationContext.getBean("singletonBean");
		System.out.println(singletonBean);
		singletonBean = applicationContext.getBean("singletonBean");
		System.out.println(singletonBean);
		singletonBean = applicationContext.getBean("singletonBean");
		System.out.println(singletonBean);

		System.out.println("*********");

		Object prototypeBean = applicationContext.getBean("prototypeBean");
		System.out.println(prototypeBean);
		prototypeBean = applicationContext.getBean("prototypeBean");
		System.out.println(prototypeBean);
		prototypeBean = applicationContext.getBean("prototypeBean");
		System.out.println(prototypeBean);
		prototypeBean = applicationContext.getBean("prototypeBean");
		System.out.println(prototypeBean);

		String name = environment.getProperty("name2");
		String surname = environment.getProperty("surname2");

		System.out.println(name + " - " + surname);

		System.out.println(isim + " - " + soyisim);

		System.out.println(userServiceBeanName);

		System.out.println("**********");

		System.out.println(ad);

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}*/
	}
}
