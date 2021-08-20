package Test;

public class Current implements BankAcc{
	@Override
	public void checkBankBalance() {
		System.out.println("Current account balance is Rs.20000");
		
	}

	@Override
	public void validateUser() {
		System.out.println("Current account user validated");
		
	}
}
