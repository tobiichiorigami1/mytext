
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hero zhaoyun=new Hero();
        zhaoyun.attack=1000;
        zhaoyun.hp=1000;
        zhaoyun.mp=500;
        zhaoyun.name="ÕÔÔÆ";
        zhaoyun.job="Õ½Ê¿";
	    zhaoyun.sex="ÄÐ";
        Zhuzai zz=new Zhuzai();	
	    //f0
        for(int i=0;i<zhaoyun.hp&&i<zz.hp;){
        zz.gongji(zhaoyun);    
	    System.out.println(zhaoyun.hp);
	    if(zhaoyun.hp<=0){
	    	break;
	    }
	    zhaoyun.daZhuZai(zz);
	    System.out.println(zz.hp);}
	     }

}
