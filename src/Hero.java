
public class Hero {
//����
	int hp;
	int mp;
	String sex;
	int attack;
	String weapon;
	String name;
	String job;
	//����
	public void move() {
		System.out.println(name+"����");
	    
	}
	//���ŷ���true  ���˷���false
	public boolean hurt(int value) {
		hp-=value;
	    if(hp<=0){
	    	System.out.println(name+"����");
	    return false;
	    }    
		return true;
	}
	public void daZhuZai(Zhuzai zhuzai){
	    System.out.println("����"+zhuzai.nameString);
		zhuzai.hurt(attack);	
	    
	}
	public void useSkill(int value){
		mp-=value;
	    if(mp<=0){
	    	System.out.println("not enough mana");
	    }
	    else{
	    	System.out.println("�ͷż���");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hero zhaoyun=new Hero();
        zhaoyun.hp=1000;
        zhaoyun.mp=500;
        zhaoyun.name="����";
        zhaoyun.job="սʿ";
	    zhaoyun.sex="��";
	    boolean live=zhaoyun.hurt(5000);
	    if(live){
	    zhaoyun.useSkill(200);
	    }
	    System.out.println(zhaoyun.hp);
	    System.out.println(zhaoyun.mp);
	}

}
