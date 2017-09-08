package สตั้ม๙;

public class Sanjiao extends Tuxing{
    int di;
    int gao;
	public Sanjiao(String name,int di,int gao){
		super(name);
		this.di=di;
		this.gao=gao;
	}
	public double findArea() {
		return di*gao/2;
	}
        
}
