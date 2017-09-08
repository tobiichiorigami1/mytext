package san;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Hero hero=new Hero("asd");
         Pet aPet=new Pet();
         Dog dog=new Dog();
         Cat cat=new Cat();
         Bird bird=new Bird();
         Hero hero2=new Hero("asdw",aPet);
         aPet=dog;
         Hero hero3=new Hero("awer",aPet);
	     
	     hero2.run();
	     hero3.run();
	}

}
