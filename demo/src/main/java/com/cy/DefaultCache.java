package com.cy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
//@Scope("prototype") 多例
public class DefaultCache {
	public DefaultCache() {
		System.out.println("DefaultCache");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init()..");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destory()...");
	}
}
