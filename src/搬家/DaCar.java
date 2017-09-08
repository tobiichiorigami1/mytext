package 搬家;


public class DaCar {
    Furniture fs[]=new Furniture[5];
	//容纳家具 
	
	
	//运输方法
    public  void transport(Furniture []fs) {
		this.fs=fs;
    	// TODO Auto-generated method stub
        System.out.println("走。。。停");
        for(Furniture f:fs){
        	f.getInfo();
        }
	}
    
}
