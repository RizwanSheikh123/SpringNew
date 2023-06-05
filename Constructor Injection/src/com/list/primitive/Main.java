package com.list.primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.primitive.bean.Emp;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/list/primitive/ap.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Emp emp = (Emp)factory.getBean("emp");
		System.out.println(emp);
	}
}
