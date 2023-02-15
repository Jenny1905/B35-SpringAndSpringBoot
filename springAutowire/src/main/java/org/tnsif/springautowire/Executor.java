package org.tnsif.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//driver class
public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Human h1=c.getBean("human",Human.class);
		h1.startPumping();
		
	}

}
