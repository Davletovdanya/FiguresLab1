package AllTests;

import Figures.*;
import Exceptions.GeometricException;
import org.junit.Test;
import static org.junit.Assert.*;

public class AllTests {

	@Test
	public void testAddPointOfPolygon(){
		Point myPoint1 = new Point(0, 0);
		Point myPoint2 = new Point(0, 3);
		Point myPoint3 = new Point(3, 0);
		ClosedPolygon myPolygon = new ClosedPolygon();
		myPolygon.addPoint(myPoint1);
		myPolygon.addPoint(myPoint2);
		myPolygon.addPoint(myPoint3);
		assertEquals(4.5, myPolygon.area(), 0.1);
		
	}
}
