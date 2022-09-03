/*
 * Copyright 2020-2022 the original author or authors.
 */

package com.study.service.impl;

import com.study.service.TestService;

import org.springframework.stereotype.Service;

/**
 * 测试Service实现类.
 *
 * @author zhang   2022/9/3 上午2:55
 */
@Service("TestService")
public class TestServiceImpl implements TestService {
	@Override
	public String sayHello(String name) {
		System.out.println("Last Dance，author：" + name);
		return "";
	}
}
