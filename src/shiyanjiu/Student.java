package shiyanjiu;

import java.util.Scanner;

public class Student extends Person{
      int a[]=new int[5];
      public Student() {
		// TODO Auto-generated constructor stub
	      Scanner scanner=new Scanner(System.in);
    	  for(int i=0;i<5;i++)
	    {
	    	System.out.println("请输入第"+i+"门课的成绩");
	    	int b=scanner.nextInt();
	    	a[i]=b;
	    }
      }
           public void getPingjun() {
		      int sum=0;
           for(int i=0;i<5;i++){
        	   
        	   sum+=a[i];
           }
		System.out.println(sum/5);
           
           }
          




}
