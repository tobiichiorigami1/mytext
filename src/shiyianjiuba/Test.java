package shiyianjiuba;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in); 
		System.out.println("������ѧ������");
		int f=sc.nextInt();
        Student e[]=new Student[f];
         for(int i=0;i<e.length;i++){
        	 System.out.println("������ѧ������");
        	 String a=sc.next();
        	 System.out.println("������ѧ���ɼ�");
        	 int b=sc.nextInt();
        	 e[i]=new Student(a,b); 
         }
	       Computer.s=e;
	       Computer a=new Computer();
	       a.sort();
	       a.disp();
	       
	}

}
