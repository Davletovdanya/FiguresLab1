
public class ShapesFactory {

	//private Shape sh;
	
	public ShapesFactory() {
		
	}

	public Shape createShape(String str){
		Shape sh = null;
		if(str.equals("Circle")){
			Circle myCyrcle = new Circle(new Point(0, 0), 5);
			return myCyrcle;
		}
		else{
			try {
				throw new Exception("“ип не найден");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sh;
	}
}
