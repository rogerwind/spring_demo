package com.roger.test.Spring_Demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roger.beans.Chinese;
import com.roger.beans.Person;

public class AppTest {

	@Test
	public void testMain() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Person p = ctx.getBean("chinese", Chinese.class);
		p.useAxe();

		assert (true);
	}

}
