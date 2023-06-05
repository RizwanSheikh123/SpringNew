package com.set.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.set.dependent.bean.Vendor;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/set/dependent/ap.xml");
		Vendor vendor = (Vendor)context.getBean("vendor");
		vendor.getVendorCustomer();
	}
}
