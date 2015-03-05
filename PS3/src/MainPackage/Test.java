package MainPackage;

import javax.naming.InsufficientResourcesException;


public class Test extends Account {
	public Test(int id, double balance){
		super(id,balance);
	}
	
	public static void main(String[] args) throws InsufficientResourcesException{
		Test testOne = new Test(1122, 20000);
		testOne.setAnnualInterestRate(.045);
		try {
			testOne.withdraw(2500);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testOne.deposit(3000);
		
		/*System.out.println(testOne.getBalance(), testOne.getMonthlyInterestRate(), testOne.getDateCreated());*/
		System.out.println(testOne.getBalance());
		System.out.println(testOne.getMonthlyInterestRate());
		System.out.println(testOne.getDateCreated());
	}
	
}

