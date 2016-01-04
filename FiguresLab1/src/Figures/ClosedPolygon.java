package Figures;
import java.util.ArrayList;
import java.util.List;

import Exceptions.GeometricException;

public class ClosedPolygon extends Shape implements Polygon {

	List<Point> listOfPoints = new ArrayList<Point>();

	public ClosedPolygon() {

	}

	public ClosedPolygon(String color, double thickness) {
		super(color, thickness);
	}

	@Override
	public String toString() {
		return "ClosedPolygon [listOfPoints=" + listOfPoints + "]";
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
	public double perimeter() {
		double P = 0;
		for (int index = 1; index <= listOfPoints.size(); index++) {
			if (index == listOfPoints.size()) {
				P = P + listOfPoints.get(index - 1).getDistance(listOfPoints.get(0));
			} else
				P = P + listOfPoints.get(index - 1).getDistance(listOfPoints.get(index));
		}
		return P;
	}

	@Override
	public double area() {
		double S = 0;
		for (int index = 1; index <= listOfPoints.size(); index++) {
			if (index == listOfPoints.size()) {
				double x1 = listOfPoints.get(index - 1).getX(listOfPoints.get(index - 1));
				double y1 = listOfPoints.get(index - 1).getY(listOfPoints.get(index - 1));
				double x2 = listOfPoints.get(0).getX(listOfPoints.get(0));
				double y2 = listOfPoints.get(0).getY(listOfPoints.get(0));
				// S = S + Math.abs((x1+x2)*(y1-y2))/2;
				S = S + ((x1 + x2) * (y1 - y2)) / 2;
			} else {
				double x1 = listOfPoints.get(index - 1).getX(listOfPoints.get(index - 1));
				double y1 = listOfPoints.get(index - 1).getY(listOfPoints.get(index - 1));
				double x2 = listOfPoints.get(index).getX(listOfPoints.get(index));
				double y2 = listOfPoints.get(index).getY(listOfPoints.get(index));
				// S = S + Math.abs((x1+x2)*(y1-y2))/2;
				S = S + ((x1 + x2) * (y1 - y2)) / 2;
			}
		}
		return S;
	}
}
