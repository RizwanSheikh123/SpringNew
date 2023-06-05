package com.first.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.first.dependent.bean.Primitives;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/first/dependent/ap1.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Primitives pri = (Primitives)factory.getBean("pri");
		System.out.println(pri);
	}
}
