package 搬家;


public class BanjiaCompany {
        //车
	  DaCar car=new DaCar(); 
	//搬家方法
	  
	//往车子里塞家具
	  public void banJia(){
		  Furniture zz=new Furniture("桌子",20);
		  Furniture yz=new Furniture("椅子",10);
		  Furniture chuang=new Furniture("床",50);
		   Furniture fs[]={zz,yz,chuang};
		  car.transport(fs);
		  
	  }
}
