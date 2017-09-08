
public class Zhuzai {
	// 属性
	String nameString = "暗影主宰";
	int attack = 300;
	int hp = 10000;

	// 方法
	// 攻击
	public Zhuzai gongji(Hero hero) {
		// 攻击攻击它的英雄
		System.out.println("攻击" + hero.name);
		// 减掉英雄的血量
		hero.hurt(attack);
        return Zhuzai.this;
	}
	public boolean hurt(int value) {
		hp-=value;
	    if(hp<=0){
	    	System.out.println(nameString+"挂了");
	    return false;
	    }    
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
