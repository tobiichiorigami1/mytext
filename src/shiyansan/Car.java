package shiyansan;

public class Car extends Auto {
    String kongTiao;
	String CD;
	public int speedUp(int a){
		   speed+=a;
	       System.out.println("���Ӽ�����"+a);
		   return speed;
	   }
	   public Auto speedDown(int b){
		  if(speed-b>0){
			 speed-=b;
			 System.out.println("���Ӽ�����"+b);
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
