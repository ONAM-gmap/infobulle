package com.example.model;

public class Point {
	private Long id;
	private Double X;
	private Double Y;
	public Point(Double x, Double y) {
		super();
		X = x;
		Y = y;
	}
	
	public Point() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getX() {
		return X;
	}
	public void setX(Double x) {
		X = x;
	}
	public Double getY() {
		return Y;
	}
	public void setY(Double y) {
		Y = y;
	}
	@Override
	public String toString() {
		return "Point [getX()=" + getX() + ", getY()=" + getY() + "]";
	}
}
