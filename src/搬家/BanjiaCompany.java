package ���;


public class BanjiaCompany {
        //��
	  DaCar car=new DaCar(); 
	//��ҷ���
	  
	//�����������Ҿ�
	  public void banJia(){
		  Furniture zz=new Furniture("����",20);
		  Furniture yz=new Furniture("����",10);
		  Furniture chuang=new Furniture("��",50);
		   Furniture fs[]={zz,yz,chuang};
		  car.transport(fs);
		  
	  }
}
