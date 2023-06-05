package com.first.primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.first.primitive.bean.Primitives;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/first/primitive/ap.xml");
		Primitives pri = applicationContext.getBean("pri",Primitives.class);
		System.out.println(pri);
	}
}
