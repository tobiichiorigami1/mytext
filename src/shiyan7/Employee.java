package shiyan7;



public abstract class Employee {
     private String name;
     private int number;
     protected MyDate birthday=new MyDate();
     public Employee(String name,int number,int year,int month,int day) {
		this.name=name;
		this.number=number;
	    birthday.setDay(day);
	    birthday.setMonth(month);
	    birthday.setYear(year);
     }
     public abstract int earning(int a);
     public void toString1() {
		System.out.println(name);
		System.out.println(number);
	    System.out.println(birthday.toDateString());
     }


}
