package shiyanbasan;
public class Teacher {
	  String name;
      int num;    
	  private static Teacher teacher=new Teacher(null,0);
      public static Teacher getInstance(){
    	  return teacher;
      } 
	  private Teacher(String name,int num) {
		this.name=name;
		  this.num=num;
		// TODO Auto-generated constructor stub
		}
}
