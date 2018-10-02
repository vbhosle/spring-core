package org.koushik.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape, InitializingBean, DisposableBean{

	private List<Point> points;

	public Triangle() {
		System.out.println("Triangle constructor");
	}


	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle bean initialized");
	}

	public void destroy() throws Exception {
		System.out.println("Triangle bean disposed");
	}


	public void draw() {
		System.out.println("Triangle drawn with following points:");
		for (Point point : points) {
			System.out.println(point);
		}
	}

}
