package com.list.primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.primitive.bean.Emp;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/list/primitive/ap.xml");
		Emp emp = applicationContext.getBean("emp",Emp.class);
		System.out.println(emp);
	}
}
