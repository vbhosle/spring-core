package org.koushik.javabrains;

import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle: " + center);
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
