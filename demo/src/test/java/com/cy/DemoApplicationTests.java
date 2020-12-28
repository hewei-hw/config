package com.cy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private ApplicationContext ctx;
	
	private DefaultCache cache;

	@Test
	 void contextLoads() {
//		System.out.println(ctx);
//		DefaultCache bean = ctx.getBean("defaultCache", DefaultCache.class);
//		System.out.println(bean);
		System.out.println(cache);
	}
	

}
