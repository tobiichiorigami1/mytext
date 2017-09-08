package touzi;


public class TouZi {
     int mian;
     int dian;
     static Math sMath;
     public void roll() {
		// TODO Auto-generated method stub
        int i=0;
        i=(int)(sMath.random()*6+1);
	    dian=i;
        System.out.println("µãÊıÊÇ"+i);
     }
     public static void main(String[] args) {
	  TouZi touZi=new TouZi();
	  touZi.roll();
	}
}
