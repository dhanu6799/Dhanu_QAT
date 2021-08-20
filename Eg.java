package Test;

public class Eg {
	public static void main(String[] args) {
		Current ca= new Current();
		Savings sa = new Savings();
		ca.checkBankBalance();
		ca.validateUser();
		sa.checkBankBalance();
		sa.validateUser();

	}

}
