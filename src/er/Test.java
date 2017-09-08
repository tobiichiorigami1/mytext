package er;
public class Test {
public static void main(String[] args) {
	Animal a=new Animal("shuijun");
    Animal bAnimal=new Dog("a"); 
	a.Sing();
	bAnimal.Sing();
	Cat b=new Cat("a");
    Dog c=new Dog("s");
    Bird e=new Bird("fengwang");
    System.out.println(e.name);
    System.out.println(a.name);
    a=b;
    a.Sing(); 
    if (a instanceof Cat) {
		Cat f= (Cat)a;
		f.han();
	}
    a=c;
    a.Sing();
    if (a instanceof Dog) {
		Dog g = (Dog) a;
		g.jiao();
	}    
    a=e;
    a.Sing();
    if (a instanceof Bird) {
	Bird h = (Bird) a;
	h.zhazha();
}
   
}
}
