package com.cy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;

import com.cy.dao.GoodsDao;
import com.cy.pojo.Goods;

@SpringBootTest
public class TestDaoGoods {
	@Autowired
	private GoodsDao cxt;
	
	@Test
	public void finn() {
		List<Goods> f = cxt.findAll();
		for (Goods s:f) {
			System.out.println(s);
			
		}
	}
	
	@Test
	void deleteObjects() {
		int ros = cxt.deleteObjects(1,3);
		System.out.println("影响行数："+ros);
	}
}
