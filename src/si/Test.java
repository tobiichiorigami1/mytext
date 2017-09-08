package si;

public class Test {
        GeometricObject c;
        GeometricObject d;
	public void equalsArea(GeometricObject a,GeometricObject b){
		if(a.findArea()==b.findArea()){
			System.out.println(a.findArea());
			System.out.println(b.findArea());
			System.out.println("面积相同");
		 }
	    else {
			System.out.println(a.findArea());
			System.out.println(b.findArea());
	    	System.out.println("面积不同");
		}
	}
	public void displayGeometricObject(GeometricObject e){
//		if (e instanceof Circle) {
//			Circle f = (Circle) e;
//			System.out.println("圆的面积是"+f.findArea());
//		}
//		if (e instanceof MyRectangle) {
//			MyRectangle h = (MyRectangle) e;
//			System.out.println("长方形的面积是"+h.findArea());
//		}
	System.out.println("面积是"+e.findArea());
	}
	public static void main(String[] args) {
		GeometricObject x=new MyRectangle(1, 2, "asd", 4);
        GeometricObject x1=new Circle(1,"asw",5);
	    Test test=new Test();
	    test.displayGeometricObject(x1);
	    test.displayGeometricObject(x);
	    test.equalsArea(x, x1);
	}

}
