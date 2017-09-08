package liu;

public class interfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vehicle sVehicle=new Bus();
         Vehicle dVehicle=new Bike();
         sVehicle.run();
         sVehicle.start();
         dVehicle.run();
         dVehicle.start();
	}

}
