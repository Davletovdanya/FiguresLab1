package Figures;
import java.util.ArrayList;
import java.util.List;

import Exceptions.GeometricException;

public class Polyline extends Shape implements Polygon {

	private List<Point> listOfPoints = new ArrayList<Point>();

	public Polyline() {

	}

	public Polyline(String color, double thickness) {
		super(color, thickness);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Polyline [listOfPoints=" + listOfPoints + "]";
	}

	@Override
	public void addPoint(Point X) {
		boolean exc = false;
		for (Point p : listOfPoints) {
			if (p.equals(X)) {
				exc = true;
				try {
					throw new GeometricException("Совпадение точек");
				} catch (GeometricException e) {
					e.printStackTrace();
				}
			}
		}
		if (exc == false)
			listOfPoints.add(X);
	}

	@Override
	public void removePoint(Point X) {
		listOfPoints.remove(X);
	}

	@Override
	final public double perimeter() {
		double P = 0;
		for (int index = 1; index <= listOfPoints.size(); index++) {
			if (index == listOfPoints.size()) {
				return P;
			} else
				P = P + listOfPoints.get(index - 1).getDistance(listOfPoints.get(index));
		}
		return P;
	}

	@Override
	final public double area() {
		try {
			throw new GeometricException("Площадь не может быть вычеслена для полилинии");
		} catch (GeometricException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
