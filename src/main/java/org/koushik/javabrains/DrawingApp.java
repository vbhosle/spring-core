package org.koushik.javabrains;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");
		context.registerShutdownHook();
		System.out.println("Before getBean");
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		
//		String message = context.getMessage("greeting", null, "Hola", Locale.UK);
//		System.out.println(message);
//		
//		message = context.getMessage("question", null, "Que te llamo?", Locale.UK);
//		System.out.println(message);
//		
	}
}
