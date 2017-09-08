package shiyan7;


public class SalariedEmployee extends Employee{
    private int monthlySalary;
	public SalariedEmployee(String name,int number,int year,int month,int day,int monthlySalary) {
		super(name, number, year, month, day);
		this.monthlySalary=monthlySalary;
		// TODO Auto-generated constructor stub
	}
    @Override
	public int earning(int a) {
		// TODO Auto-generated method stub
		if(a==super.birthday.getMonth()){
			System.out.println("加工资");
		}
    	System.out.println("工资是"+monthlySalary);
		return monthlySalary;
	}
	@Override
	public void toString1() {
		// TODO Auto-generated method stub
		System.out.println("按月计算的员工");
		super.toString1();
	    
	}

}
