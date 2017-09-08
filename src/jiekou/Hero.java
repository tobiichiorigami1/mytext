package jiekou;

import java.util.Scanner;

public class Hero {
    String nameString;
	int hp;
	int lv;
	public Hero() {
		hp=100;
		lv=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入英雄姓名：");
		String aString=scanner.next();
		nameString=aString;
	   getInfo(); 	
	}
	public  void jue(Hero hero) {
		// TODO Auto-generated method stub
         hero.hp-=100;
	}
	public  void jue(Hero hero,int shanghai) {
		// TODO Auto-generated method stub
         hero.hp-=shanghai;
	}
	public Hero(int a)throws NovalueException
	{
		if(a!=1&&a!=2)
		{
		throw new NovalueException();
		
		}
	    else{if(a==2){
	    	hp=200;
			lv=2;
			Scanner scanner=new Scanner(System.in);
			System.out.println("请输入英雄姓名：");
			String aString=scanner.next();
			nameString=aString;
		   getInfo(); 	 
	    } 
	     if(a==1){
	    	 hp=100;
				lv=1;
				Scanner scanner=new Scanner(System.in);
				System.out.println("请输入英雄姓名：");
				String aString=scanner.next();
				nameString=aString;
			   getInfo(); 	 
	     }}
	}
	public void getInfo() {
		System.out.println("英雄姓名"+nameString);
        System.out.println("血量"+hp);
        System.out.println("等级"+lv);
	}
	public static void main(String[] args)throws NullPointerException {
		// TODO Auto-generated method stub
       try {
    	   Hero hero=new Hero(3);
	} catch (NovalueException e) {
		System.out.println("不是英雄");
	}
       Hero hero2=new Hero();
//	   hero2.jue(hero);
//	   hero.getInfo();  
	}

}
