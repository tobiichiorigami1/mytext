package com.chouxiang;

public class Hehe extends TestAbstract{
    // 抽象类的非抽象子类     必须要重写抽象类的抽象方法
	
	public  final String NAME_STRING;
	
	static {
		//System.out.println(NAME_STRING);
		//NAME_STRING="abc";
	}
	public Hehe() {
		NAME_STRING="asd";
		// TODO Auto-generated constructor stub
	}
	@Override
	public void haha() {
		System.out.println("haha");
		
	}

}
