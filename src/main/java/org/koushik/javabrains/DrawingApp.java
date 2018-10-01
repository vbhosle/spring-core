package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String args[]) {
		
		// Using bean factory
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\virajb\\spring-workspace\\spring-core\\src\\main\\resources\\spring.xml"));
//		Triangle triangle1 = (Triangle) factory.getBean("triangle");
//		Triangle triangle2 = (Triangle) factory.getBean("triangle");
//		triangle1.draw();
//		System.out.println(triangle1 == triangle2); //scope is singleton by default !!
		
		// Using ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		triangle.draw();
	}
}
