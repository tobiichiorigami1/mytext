package shiyanjiuwu;

public class Stud {
     int no;
     String name; 
     double deg;
	 static double sum;
	 static int num=4;
     Stud []s=new Stud[num];  
     public Stud(){
    	 init();
     }
     public Stud(int no, String name, double deg) {
		super();
		this.no = no;
		this.name = name;
		this.deg = deg;
	    for(int i=0;i<num;i++){
        sum+=s[i].deg;
     }}
    public  void init(){
    s[0]=new Stud(1,"xy",90);   
    s[1]=new Stud(2,"xyz",92); 	
    s[2]=new Stud(3,"yz",93); 	
    s[3]=new Stud(4,"xz",94); 		
    }
    public  void disp(){
    	for(int i=0;i<num;i++){
    	System.out.println("学生姓名"+s[i].name+"学生学号"+s[i].no
    			+"学生成绩"+s[i].deg);	
    	}}
    public static void avg(){
     	
     System.out.println("平均成绩："+sum/num);
    }
    
    public static void main(String []args){
    	
    	
    }
    
    }




