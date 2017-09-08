package shiyansan;

public class Truck extends Vehicles {
      float load;
	  public Truck(){
		  brand="五菱宏光";
		  color="银色";
		  load=1.0f;
	  }
	 public void showTruck() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(load);
		
	}
	  public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
