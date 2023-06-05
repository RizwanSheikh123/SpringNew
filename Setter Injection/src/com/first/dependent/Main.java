package com.first.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.first.dependent.bean.Primitives;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/first/dependent/ap1.xml");
		Primitives primitives = applicationContext.getBean("pri",Primitives.class);
		System.out.println(primitives);
	}
}
