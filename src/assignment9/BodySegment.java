package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = Color.blue;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public void setX(double a) {
		this.x = a;
	}
	
	public void setY(double b) {
		this.y = b;
	}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(this.color);
		StdDraw.setPenRadius(this.size);
		StdDraw.filledCircle(this.x,  this.y,  this.size);
	}
	
}
