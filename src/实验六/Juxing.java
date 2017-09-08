package สตั้ม๙;


public class Juxing extends Tuxing {
    int chang;
    int kuan;
    public Juxing(String name,int chang,int kuan){
    	super(name);
    	this.chang=chang;
        this.kuan=kuan;			
    }
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return chang*kuan;
	}
     
}
