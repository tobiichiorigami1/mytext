package shiyianjiuba;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in); 
		System.out.println("请输入学生个数");
		int f=sc.nextInt();
        Student e[]=new Student[f];
         for(int i=0;i<e.length;i++){
        	 System.out.println("请输入学生姓名");
        	 String a=sc.next();
        	 System.out.println("请输入学生成绩");
        	 int b=sc.nextInt();
        	 e[i]=new Student(a,b); 
         }
	       Computer.s=e;
	       Computer a=new Computer();
	       a.sort();
	       a.disp();
	       
	}

}
