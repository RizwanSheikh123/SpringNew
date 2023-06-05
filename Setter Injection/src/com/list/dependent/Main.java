package com.list.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.dependent.bean.Emp;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/list/dependent/ap.xml");
		Emp emp = context.getBean("emp",Emp.class);
		System.out.println(emp);
	}
}
