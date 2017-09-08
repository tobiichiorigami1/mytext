package oop;

public class Tufu {
    Pig pig;
	String date;
    public Tufu(Pig pig) {
		this.pig=pig;
	}
    public void shazhu(){
		if(pig.weight>200){
			System.out.println("É±ÁË³ÔÈâ");
		}
    	 else {
			System.out.println("Ñø×Å");
		}
	}
	public static void main(String[] args) {
		  
	}

}
