package shiyan7;


public class HourlyEmployee extends Employee{
    
	private int wage;
    private int hour;
    public HourlyEmployee(String name, int number, int year, int month, int day,int wage,int hour ) {
		super(name, number, year, month, day);
		this.wage=wage;
		this.hour=hour;
	}
	public int earning(int a) {
		// TODO Auto-generated method stub
		if(a==super.birthday.getMonth())
		{
			System.out.println("加工资");
		}
		System.out.println("工资是"+wage*hour);
		return wage*hour;
	}
	@Override
	public void toString1() {
		// TODO Auto-generated method stub
		System.out.println("按时计算的员工");
		super.toString1();
	    }

}
