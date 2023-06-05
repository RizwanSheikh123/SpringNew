package com.set.primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.primitive.bean.Emp;
import com.set.primitive.bean.Vendor;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/set/primitive/ap.xml");
		Vendor vendor = (Vendor)context.getBean("vendor");
		System.out.println(vendor);
	}
}
