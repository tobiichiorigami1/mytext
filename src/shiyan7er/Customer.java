package shiyan7er;


public class Customer  {
	private String firstName;
	private String lastName;
	private  Account account;
	public Customer(String firstName,String Lastname,int id,
			double balance,
		double annualInterestRate) {
		account=new Account(id, balance, annualInterestRate);
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
