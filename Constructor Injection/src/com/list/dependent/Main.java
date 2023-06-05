package com.list.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.dependent.bean.Vendor;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/list/dependent/ap.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Vendor emp = (Vendor)factory.getBean("emp");
		System.out.println(emp);
	}
}
