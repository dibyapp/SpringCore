package com.dib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dib.beans.Wish;

@SpringBootApplication
public class BootBasicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Wish wish=null;
		ctx = SpringApplication.run(BootBasicApplication.class, args);
		
		wish = ctx.getBean("wmg", Wish.class);
		
		System.out.println(wish.getMessage("Dibya"));
		
	}

}
