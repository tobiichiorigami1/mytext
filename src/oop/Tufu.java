package oop;

public class Tufu {
    Pig pig;
	String date;
    public Tufu(Pig pig) {
		this.pig=pig;
	}
    public void shazhu(){
		if(pig.weight>200){
			System.out.println("ɱ�˳���");
		}
    	 else {
			System.out.println("����");
		}
	}
	public static void main(String[] args) {
		  
	}

}
