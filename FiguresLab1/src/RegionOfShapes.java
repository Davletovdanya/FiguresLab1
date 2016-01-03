import java.util.HashMap;
import java.util.Map;

public class RegionOfShapes {
	
	private Map<String, Shape> shapes = new HashMap<String, Shape>();
	
	public RegionOfShapes(){
		
	}
	
	@Override
	public String toString() {
		return "RegionOfShapes [shapes=" + shapes + "]";
	}

	public void addShape(String name, Shape Sh){
		shapes.put(name, Sh);
	}
	
	public void removeShape(String name) {
		shapes.remove(name);
	}
}
