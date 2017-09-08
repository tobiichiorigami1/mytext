package shiyansan;

public class Car1 extends Vehicles {
     int seat;
	public Car1(){
		brand="上海大众";
		color="白";
	    seat=5;
	}
	public void showCar() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(seat);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
