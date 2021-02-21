package com.gao.service.impl;


import com.gao.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
