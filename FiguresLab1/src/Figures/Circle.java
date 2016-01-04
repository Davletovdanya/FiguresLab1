package Figures;

public class Circle extends Shape {

	Point center;
	double radius;

	public Circle(Point center, double radius) {
		super("00FF00", 3.0);
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}

	@Override
	final public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	final public double area() {
		return Math.PI * radius * radius;
	}
}
