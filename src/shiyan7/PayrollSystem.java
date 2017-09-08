package shiyan7;

import java.util.Scanner;

public class PayrollSystem {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee []list={new SalariedEmployee("小明",1,1990,5,15,100),
			  new HourlyEmployee("大白", 2, 1991, 6, 26,60,3)};
			Scanner	sc=new Scanner(System.in);
			System.out.println("请输入今年的月份");
		    int a=sc.nextInt();
		for(int i=0;i<list.length;i++){
			list[i].toString1();
			list[i].earning(a);
			
		}
	}

}
