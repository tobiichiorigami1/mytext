

public class Person {
    int age;
	String name;
	Dog wc=new Dog();
    public Person() {
		
	}
	public Person(int age, String name, Dog wc) {
	    this.age = age;
		this.name = name;
		this.wc = wc;
	}
//	public void jia(int []arr){
//		
//	    int sum=0;
//		for(int i=0;i<arr.length;i++){
//	    sum+=arr[i];
//}
//	System.out.println(sum);
//	}
	public void jia(int...arrs) {
		int sum=0;
		for(int i=0;i<arrs.length;i++){
	    sum+=arrs[i];
}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		Dog wc=new Dog(2,"����");
        Dog dh=new Dog(3,"���");
//		wc.name="����";
//		wc.age=2;
		Person xP=new Person(23,"СP",wc);
	    xP.wc.name="������";
		Person xp2=new Person(24,"СP2",dh);
		System.out.println(xp2.wc);
	    int[]a={};
		xP.jia();
	}


}
