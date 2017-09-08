package shiyansan;

public class Account {
     private int id;
	 protected double balance;
	 private double annualInterestRate;
//	 public Account(){
//		 
//	 }
	 public Account (int id, double balance, double annualInterestRate ){
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	    
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterest(){
		return annualInterestRate/12;
	}
	public void withdraw (double amount){
		if(balance>amount){
			balance-=amount;
		    System.out.println("您的余额为"+balance);
		   // System.out.println("您的月利率为"+this.getAnnualInterestRate());
		}
		else {
			System.out.println("余额不足");
		    System.out.println("您的余额为"+balance);
		}
	}
	
	public void deposit (double amount){
		balance+=amount;
		System.out.println("您的余额为"+balance);
		System.out.println("您的月利率为"+this.getAnnualInterestRate());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account account=new Account(1122, 20000, 0.045);
	account.withdraw(30000);
	account.withdraw(2500);
	account.deposit(3000);
	}

}
