package workshop4_3;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("441-0190-1203", 500000, 7.3); 
		System.out.println("계좌정보 : "+account.getAccount() +" "+account.getBalance()+"원");
		account.withdraw(600000);
		account.deposit(20000);
		System.out.println("계좌정보 : "+account.getAccount() +" "+account.getBalance()+"원");
		System.out.println("이자:"+account.calculateInterest());
	}

	

}
