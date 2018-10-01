package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext context;
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {
		System.out.println("Trianble constructor");
	}

	public void draw() {
		System.out.println("Triangle drawn from " + pointA + ", " + pointB + ", " + pointC);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

}
