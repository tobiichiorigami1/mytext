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
    	System.out.println("ѧ������"+s[i].name+"ѧ��ѧ��"+s[i].no
    			+"ѧ���ɼ�"+s[i].deg);	
    	}}
    public static void avg(){
     	
     System.out.println("ƽ���ɼ���"+sum/num);
    }
    
    public static void main(String []args){
    	
    	
    }
    
    }




