package shiyianjiuba;

public class Computer {
     public static Student s[]=new Student[4];
	 public void sort(){
           for(int i=0;i<4;i++){
        	  for(int j=i+1;j<4;j++){
        		  if(s[i].score<s[j].score){
        			  Student t=null;
        			  t=s[i];
        			  s[i]=s[j];
        			  s[j]=t;
        		  }
        	  }
           }		 
	 }
	 public void disp(){
		 for(int i=0;i<s.length*0.7;i++){
			 System.out.println("学生姓名"+s[i].name+"成绩"+s[i].score+"pass");
		 }
		 for(int i=(int)(s.length*0.7);i<s.length;i++){
			 System.out.println("学生姓名"+s[i].name+"成绩"+s[i].score+"fail");
		 } 
	 }
	

}
