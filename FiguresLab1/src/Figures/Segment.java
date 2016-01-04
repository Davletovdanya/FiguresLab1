package Figures;
import Exceptions.GeometricException;

public class Segment extends Shape {

	private Point A;
	private Point B;

	public Segment(Point A, Point B) {
		this.A = A;
		this.B = B;
	}

	public Segment(String color, double thickness) {
		super(color, thickness);
	}

	@Override
	public String toString() {
		return "Segment [A=" + A + ", B=" + B + "]";
	}

	@Override
	public double perimeter() {
		double P = A.getDistance(B);
		return P;
	}

	@Override
	public double area() {
		try {
			throw new GeometricException("Площадь не может быть вычеслена для отрезка");
		} catch (GeometricException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
