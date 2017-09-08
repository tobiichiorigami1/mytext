package shiyansan;

public class Auto {
   int lunzi;
   String color;	
   int weight;	
   int speed;
   public int speedUp(int a){
	   speed+=a;
       return speed;
   }
   public Auto speedDown(int b){
	  if(speed-b>0){
		 speed-=b;
		 return Auto.this;
	  }   
	  else{
		  return Auto.this.tingChe();
	  }
   }
   public Auto tingChe(){
	   
	   System.out.println("车停下来了");
     return null;
   }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
