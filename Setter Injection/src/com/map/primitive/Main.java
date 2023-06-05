package com.map.primitive;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.list.dependent.bean.Emp;
import com.map.primitive.bean.Book;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/map/primitive/ap.xml");
		Book book = context.getBean("book",Book.class);
		book.show();
	}
}
