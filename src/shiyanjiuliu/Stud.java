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
    	System.out.println("ѧ������"+s[i].name+"ѧ��ѧ��"+s[i].no
    			+"ѧ���ɼ�"+s[i].deg);	
    	}}
    public static void avg(){
    	for(int i=0;i<num;i++){
            sum+=s[i].deg;
         }
     System.out.println("ƽ���ɼ���"+sum/num);
    }
    
    public static void main(String []args){
    	Scanner sc=new Scanner(System.in);
    	Stud si[]=new Stud[num];
    	for(int i=0;i<num;i++){
    		System.out.println("������ѧ��ѧ��");
    		int n=sc.nextInt();
    		System.out.println("������ѧ������");
    	    String na=sc.next();
    	    System.out.println("�������ѧ���ĳɼ�");
    	    int gr=sc.nextInt();
    	    si[i]=new Stud(n,na,gr);
    	}
    	s=si;
    	Stud.disp();
    	Stud.avg();
    	 }
    
    }




