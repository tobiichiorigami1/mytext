
public class Hero {
//属性
	int hp;
	int mp;
	String sex;
	int attack;
	String weapon;
	String name;
	String job;
	//方法
	public void move() {
		System.out.println(name+"动了");
	    
	}
	//活着返回true  挂了返回false
	public boolean hurt(int value) {
		hp-=value;
	    if(hp<=0){
	    	System.out.println(name+"挂了");
	    return false;
	    }    
		return true;
	}
	public void daZhuZai(Zhuzai zhuzai){
	    System.out.println("攻击"+zhuzai.nameString);
		zhuzai.hurt(attack);	
	    
	}
	public void useSkill(int value){
		mp-=value;
	    if(mp<=0){
	    	System.out.println("not enough mana");
	    }
	    else{
	    	System.out.println("释放技能");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hero zhaoyun=new Hero();
        zhaoyun.hp=1000;
        zhaoyun.mp=500;
        zhaoyun.name="赵云";
        zhaoyun.job="战士";
	    zhaoyun.sex="男";
	    boolean live=zhaoyun.hurt(5000);
	    if(live){
	    zhaoyun.useSkill(200);
	    }
	    System.out.println(zhaoyun.hp);
	    System.out.println(zhaoyun.mp);
	}

}
