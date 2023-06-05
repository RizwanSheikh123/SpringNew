package com.set.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.set.dependent.bean.Vendor;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/set/dependent/ap.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Vendor vendor = (Vendor)factory.getBean("vendor");
		vendor.getVendorCustomer();
	}
}
