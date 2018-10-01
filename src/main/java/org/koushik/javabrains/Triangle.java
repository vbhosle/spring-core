package org.koushik.javabrains;

import java.util.List;

public class Triangle {

	private List<Point> points;

	public Triangle() {
		System.out.println("Triangle constructor");
	}

	public void draw() {
		System.out.println("Triangle drawn with following points:");
		for (Point point : points) {
			System.out.println(point);
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

}
