package Figures;

public abstract class Shape {

	private String color;
	private double thickness;

	public Shape() {

	}

	public Shape(String color, double thickness) {
		this.color = color;
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", thickness=" + thickness + "]";
	}

	abstract public double perimeter();

	abstract public double area();
}
