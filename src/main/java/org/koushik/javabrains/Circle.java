package org.koushik.javabrains;

import java.util.Locale;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(messageSource.getMessage("draw.circle", null, "Circle", new Locale("es", "ES")));
		System.out.println(messageSource.getMessage("draw.point", new Object[] {center.getX(), center.getY()}, "points plotted", new Locale("es", "ES")));
		System.out.println(messageSource.getMessage("greeting", null, "Hello", new Locale("es", "ES")));
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Circle initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Circle destroyed");
	}

}
