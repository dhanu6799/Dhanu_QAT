package Test;

public class Savings implements BankAcc {
	public void checkBankBalance() {
		System.out.println("Saving account balance is Rs.5000");
		
	}

	@Override
	public void validateUser() {
		System.out.println("Savings account user validated");
		
	}

}
