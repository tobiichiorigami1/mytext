package shiyanjiuliu;

import java.util.Scanner;

public class Stud {
     int no;
     String name; 
     double deg;
	 static double sum;
	 static int num=4;
     static Stud []s=new Stud[num];  
     public Stud(){
    	 
     }
     public Stud(int no, String name, double deg) {
		super();
		this.no = no;
		this.name = name;
		this.deg = deg;
	    }
     public static void disp(){
    	for(int i=0;i<num;i++){
    	System.out.println("学生姓名"+s[i].name+"学生学号"+s[i].no
    			+"学生成绩"+s[i].deg);	
    	}}
    public static void avg(){
    	for(int i=0;i<num;i++){
            sum+=s[i].deg;
         }
     System.out.println("平均成绩："+sum/num);
    }
    
    public static void main(String []args){
    	Scanner sc=new Scanner(System.in);
    	Stud si[]=new Stud[num];
    	for(int i=0;i<num;i++){
    		System.out.println("请输入学生学号");
    		int n=sc.nextInt();
    		System.out.println("请输入学生姓名");
    	    String na=sc.next();
    	    System.out.println("请输入该学生的成绩");
    	    int gr=sc.nextInt();
    	    si[i]=new Stud(n,na,gr);
    	}
    	s=si;
    	Stud.disp();
    	Stud.avg();
    	 }
    
    }




