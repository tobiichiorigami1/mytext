package Testmachine;

import java.util.Scanner;

public class KaoShiJi {
	// 总题库
	Ti[] ztk = new Ti[10];
	// 临时题库
	Ti[] lstk = new Ti[3];
	// 学生信息
	Student stus[] = new Student[3];

	public KaoShiJi() {
		// 创建十道题 放入到总题库中
		Ti t1 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t2 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t3 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t4 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t5 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t6 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t7 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t8 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t9 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		Ti t10 = new Ti("1+1", "A.2 B.3 C.4 D.5", "A");
		ztk[0] = t1;
		ztk[1] = t2;
		ztk[2] = t3;
		ztk[3] = t4;
		ztk[4] = t5;
		ztk[5] = t6;
		ztk[6] = t7;
		ztk[7] = t8;
		ztk[8] = t9;
		ztk[9] = t10;
		// 创建三个学生放入 学生数组中
       Student zsStudent=new Student("zs","zs","123");
       Student lsStudent=new Student("ls","ls","456");
       Student wwStudent=new Student("ww","ww","789");
	   stus[0]=zsStudent;
	   stus[1]=lsStudent;
	   stus[2]=wwStudent;
}
      //登录
	  public Student login(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请输入用户名及密码");
	  String loginString=sc.next();
	  String pwdString=sc.next();
	  Student xx=null;
	  for(int i=0;i<stus.length;i++)
	  {
		  if(stus[i].getLogin().equals(loginString)){
			  if(stus[i].getPwd().equals(pwdString)){
				  xx=stus[i];
			  }
		  }
	  }
		 return xx; 
	  } 
	
	
	
	
	 
	  //考试
	 public void kaoShi(){
		 Student userStudent=login();
		 if(userStudent!=null){
			 XuanTiQi.getInstance().xuanTi(ztk, lstk);
			 Scanner scanner=new Scanner(System.in);
			 for(int i=0;i<lstk.length;i++){
			 System.out.println(lstk[i].getTiGan());
			 System.out.println(lstk[i].getXuanXiang());
	         String daan=scanner.next();
	         if(lstk[i].getAnswer().equals(daan)){
	        	 System.out.println("你真棒");
	         }
	         else {
				System.out.println("再接再厉");
			}
    }
		 
		 }
		 else {
			System.out.println("用户名和密码不存在");
			login();
		}
	 }
	
	
}
