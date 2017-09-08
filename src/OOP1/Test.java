package OOP1;

public  class Test {
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Asd.inner i=new Asd().new inner();
		 i.run();
		 new Object(){
			   public void run(){
				   System.out.println("haha");
			   }  
		   }.run();
	}

}
