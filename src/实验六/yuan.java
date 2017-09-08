package สตั้ม๙;

public class yuan extends Tuxing{
    final double PI=3.14;
	int radius;
    public yuan(String name,int radius){
    	super(name);
    	this.radius=radius;
    }
public double findArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

}
