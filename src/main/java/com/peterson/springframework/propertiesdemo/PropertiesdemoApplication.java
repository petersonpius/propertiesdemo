package com.peterson.springframework.propertiesdemo;

import com.peterson.springframework.propertiesdemo.Repository.DummyDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertiesdemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(PropertiesdemoApplication.class, args);
		DummyDatasource dummyDatasource= (DummyDatasource) ctx.getBean(DummyDatasource.class);
		System.out.println(dummyDatasource.getName());
		System.out.println(dummyDatasource.getPassword());
		System.out.println(dummyDatasource.getUrl());
	}
}
