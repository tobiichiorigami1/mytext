package shiyansi;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a=new Animal();
        a.eat();
        Dog b=new Dog();
        Cat c=new Cat();
	    Eagle d=new Eagle();
	    a=b;
	    a.eat();
	    a=c;
	    a.eat();
	    Cat e=(Cat)a;
	    e.jiao();
	    a=d;
	    a.eat();
	}

}
