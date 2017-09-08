package si;

public class Circle extends GeometricObject{
     double radius;
     public Circle(double radius ,String color, double weight){
         super(color, weight);
    	 this.radius=radius;
     
     }
	public double getRadius() {
		return radius;
	}

	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
     
}
