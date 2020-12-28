package com.cy;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDatasource {
	
	@Autowired
	private DataSource ds;//默认使用hikari数据源
	
	@Test
	void testDatasource() throws SQLException {
//		System.out.println(ds);
		System.out.println(ds.getConnection());
	}
}
