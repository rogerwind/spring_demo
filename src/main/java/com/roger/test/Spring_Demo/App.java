package com.roger.test.Spring_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roger.beans.Chinese;
import com.roger.beans.Person;
import com.toger.event.EmailEvent;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Person p = ctx.getBean("chinese", Chinese.class);
		p.useAxe();
		/*---------------------------------------------*/
		EmailEvent ele = new EmailEvent("hello", "test@163.com",
				"this is content.");
		ctx.publishEvent(ele);
		/*---------------------------------------------*/
		Chinese c = ctx.getBean("chinese", Chinese.class);
		System.out.println(c.getCtx());
		System.out.println(c.getCtx() == ctx);
		/*---------------------------------------------*/
	}
}
