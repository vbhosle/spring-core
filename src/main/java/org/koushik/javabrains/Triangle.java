package org.koushik.javabrains;

public class Triangle {

	private String name;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void draw() {
		System.out.println(name + " Triangle drawn from "+ pointA + ", " + pointB +", " + pointC);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
