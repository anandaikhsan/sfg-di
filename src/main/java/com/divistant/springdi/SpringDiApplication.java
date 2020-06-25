package com.divistant.springdi;

import com.divistant.springdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		//line untuk mendapatkan context
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		/**
		 * mendapatkan instance object tanpa menggunakan 'new'
		 * instance object diambil dari spring context
		 */
		MyController myController = (MyController) ctx.getBean("myController");

		String salam = myController.sayHello();

		System.out.println(salam);
	}

}
