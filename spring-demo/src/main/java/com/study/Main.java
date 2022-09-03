/*
 * Copyright 2020-2022 the original author or authors.
 */

package com.study;

import com.study.config.TestConfig;
import com.study.service.TestService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main 入口.
 *
 * @author zhang   2022/9/3 上午2:58
 */
public final class Main {
	private Main(){
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

		TestService testService = (TestService) context.getBean("TestService");
		testService.sayHello("zhang san");
	}
}
