package si;

public class Test {
        GeometricObject c;
        GeometricObject d;
	public void equalsArea(GeometricObject a,GeometricObject b){
		if(a.findArea()==b.findArea()){
			System.out.println(a.findArea());
			System.out.println(b.findArea());
			System.out.println("�����ͬ");
		 }
	    else {
			System.out.println(a.findArea());
			System.out.println(b.findArea());
	    	System.out.println("�����ͬ");
		}
	}
	public void displayGeometricObject(GeometricObject e){
//		if (e instanceof Circle) {
//			Circle f = (Circle) e;
//			System.out.println("Բ�������"+f.findArea());
//		}
//		if (e instanceof MyRectangle) {
//			MyRectangle h = (MyRectangle) e;
//			System.out.println("�����ε������"+h.findArea());
//		}
	System.out.println("�����"+e.findArea());
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
