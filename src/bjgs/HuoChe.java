package bjgs;


public class HuoChe {
    String name;
	JiaJu[] jj=new JiaJu[5];  
	public HuoChe(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  HuoChe zhuandx(JiaJu []jj) {
	   System.out.println("����Ŀ�ĵ�����Ķ�����"); 
        for(int i=0;i<jj.length;i++){
        	System.out.print(jj[i].getName()+",");
        }
	    return null;
	}
}
