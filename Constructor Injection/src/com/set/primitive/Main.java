package com.set.primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.primitive.bean.Emp;
import com.set.primitive.bean.Vendor;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/set/primitive/ap.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Vendor vendor = (Vendor)factory.getBean("vendor");
		System.out.println(vendor);
	}
}
