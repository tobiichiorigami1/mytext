package shiyansan;

public class Car extends Auto {
    String kongTiao;
	String CD;
	public int speedUp(int a){
		   speed+=a;
	       System.out.println("车子加速了"+a);
		   return speed;
	   }
	   public Auto speedDown(int b){
		  if(speed-b>0){
			 speed-=b;
			 System.out.println("车子减速了"+b);
			 return null;
		  }   
		  else{
			  return Car.this.tingChe();
		  }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car car=new Car();
       car.speed=100;
       car.speedDown(50);
       car.speedDown(50);
	}

}
