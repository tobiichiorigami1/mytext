package ���;


public class DaCar {
    Furniture fs[]=new Furniture[5];
	//���ɼҾ� 
	
	
	//���䷽��
    public  void transport(Furniture []fs) {
		this.fs=fs;
    	// TODO Auto-generated method stub
        System.out.println("�ߡ�����ͣ");
        for(Furniture f:fs){
        	f.getInfo();
        }
	}
    
}
