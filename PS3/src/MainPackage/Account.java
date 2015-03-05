package MainPackage;

import java.util.Date;


public class Account {
	private int id = 0;
	private double balance= 0.00;
	private double annualInterestRate = 0.00;
	private Date dateCreated;
	
	public Account(){
		this(0,0);
		}
	
	public Account(int id, double balance){
		this.id=id;
		this.balance = balance;
	}
	
	/**private double withdraw(double amount){
		return (balance += amount);
	}
	**/
	public void deposit(double amount){
		balance += amount;
	}
	
	/**
	    * Withdraw funds from instance's account number.  If there are not enough funds, build and throw the custom exception
	    * @param amount
	    * @throws InsufficientFundsException
	    */
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
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

	public Date getDateCreated() {
		return dateCreated;
	}
	
}
