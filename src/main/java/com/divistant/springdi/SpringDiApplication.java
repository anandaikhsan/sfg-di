package com.divistant.springdi;

import com.divistant.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Set;

@SpringBootApplication
// menentukan lokasi untuk scan komponen oleh Spring
@ComponentScan(basePackages = {"com.divistant.services", "com.divistant.springdi"})
public class SpringDiApplication {

	public static void main(String[] args) {
		//line untuk mendapatkan context
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		/**
		 * mendapatkan instance object tanpa menggunakan 'new'
		 * instance object diambil dari spring context
		 */
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-----Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-----Property");
		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----Setter");
		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----Constructor");
		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("-----Profile Bean");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

	}

}
