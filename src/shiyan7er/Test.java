package shiyan7er;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Customer aCustomer=new Customer("Smith", "Jane",1000,2000,0.0123);
    aCustomer.getAccount().deposit(100);
	aCustomer.getAccount().withdraw(960);
	aCustomer.getAccount().withdraw(2000);
	System.out.println("Customer"+"["+aCustomer.getFirstName()+","
	+aCustomer.getLastName()+"]"+"has a acoount: id is"+aCustomer
	.getAccount().getId()+","+"annualInterestRate is"+aCustomer
	.getAccount().getAnnualInterestRate()+","+"balance is"+aCustomer
	.getAccount().getBalance());
	}

}
