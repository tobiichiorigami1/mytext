
public class Zhuzai {
	// ����
	String nameString = "��Ӱ����";
	int attack = 300;
	int hp = 10000;

	// ����
	// ����
	public Zhuzai gongji(Hero hero) {
		// ������������Ӣ��
		System.out.println("����" + hero.name);
		// ����Ӣ�۵�Ѫ��
		hero.hurt(attack);
        return Zhuzai.this;
	}
	public boolean hurt(int value) {
		hp-=value;
	    if(hp<=0){
	    	System.out.println(nameString+"����");
	    return false;
	    }    
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
