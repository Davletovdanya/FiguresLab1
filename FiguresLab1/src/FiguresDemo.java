
public class FiguresDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point myPoint1 = new Point(0, 0);
		Point myPoint2 = new Point(0, 3);
		Point myPoint3 = new Point(3, 0);
		Point myPoint4 = new Point(2, 0);
		
		boolean bool = myPoint1.equals(myPoint2);
		System.out.println(bool);
		
		System.out.println(myPoint1);
		
		Circle myCircle = new Circle(myPoint1, 4.0);
		System.out.println(myCircle);
		System.out.println(myCircle.area());
		
		System.out.println(myPoint2.getDistance(myPoint3));
		
		ClosedPolygon myPolygon = new ClosedPolygon("00FF00", 3.0);
		myPolygon.addPoint(myPoint1);
		myPolygon.addPoint(myPoint2);
		myPolygon.addPoint(myPoint3);
		myPolygon.addPoint(myPoint4);
		System.out.println(myPolygon.area());
		
		Polyline myPolyline = new Polyline();
		myPolyline.addPoint(myPoint1);
		myPolyline.addPoint(myPoint2);
		myPolyline.addPoint(myPoint3);
		//myPolyline.addPoint(myPoint4);
		System.out.println(myPolyline.perimeter());
		
		Segment mySegment = new Segment(myPoint1, myPoint2);
		System.out.println(mySegment.perimeter());
		
		RegionOfShapes myRegion = new RegionOfShapes();
		myRegion.addShape("Окружность", myCircle);
		myRegion.addShape("Отрезок", mySegment);
		myRegion.addShape("Полилиния", myPolyline);
		myRegion.removeShape("Окружность");
		System.out.println(myRegion);
	}
}
