package san;

public class Hero {
    String name;
    Pet pet;
    public Hero(String name) {
		this.name=name;
	}
    public Hero(String name,Pet pet) {
		this.name=name;
	    this.pet=pet;
    }
    public void run() {
		System.out.println("Ó¢ĞÛÅÜ×Å");
    	pet.fllow();
	}
}
