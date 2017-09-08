package shiyansan;

public class Calculate2 extends Calculate1{
     public int cheng(int a,int b) {
		return a*b;
	}
	public double mul(double a,double b){
		return a/b;
	}
	public static void main(String[] args) {
		Calculate2 aCalculate2=new Calculate2();
        int a=aCalculate2.cheng(1, 2);
        double b=aCalculate2.mul(1, 2);
        int c=aCalculate2.add(1, 2);
	    int d=aCalculate2.sub(1, 2);
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	}

}
