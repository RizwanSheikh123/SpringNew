package com.map.dependent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.map.dependent.bean.Book;

public class Main {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/map/dependent/ap.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Book book = (Book)beanFactory.getBean("book");
		book.show();
	}
}
