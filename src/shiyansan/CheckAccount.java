package shiyansan;

public class CheckAccount extends Account{
    int overdraft;
	public CheckAccount(int id, double balance, double annualInterestRate,int overdraft){
		super(id, balance, annualInterestRate);
		this.overdraft=overdraft;
		}
	public void withdraw (double amount){
		if(balance>amount){
			balance-=amount;
		    System.out.println("您的余额为"+balance);
		    System.out.println("您的可透支余额"+overdraft);
		}
		else {
			double a=amount-balance;
		 if(a<overdraft){
		    balance=0;
		    overdraft-=a;
		 System.out.println("你的账户余额"+balance);
		 System.out.println("您的可透支余额"+overdraft);
		 }
		 else {
			System.out.println("超过透支余额");
			System.out.println("你的账户余额"+balance);
			 System.out.println("您的可透支余额"+overdraft);
		 }
		 }
	}
	
	public static void main(String[] args) {
		CheckAccount checkAccount=new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
	    checkAccount.withdraw(18000);
	    checkAccount.withdraw(3000);
	}

}
