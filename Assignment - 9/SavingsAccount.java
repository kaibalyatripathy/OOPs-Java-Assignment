class BankAccount{
	int money=0;
	void deposit(int m){
		System.out.println("Money Deposited: "+m);
		money+=m;
	}
	void withdraw(int m){
		System.out.println("Amount withdrawn: "+m);
		money-=m;
	}
}

class SavingsAccount extends BankAccount{
	void withdraw(int m){
		if(money-m<100) System.out.println("Balance below 100");
		else super.withdraw(m);
	}
	public static void main(String[] args){
		SavingsAccount obj = new SavingsAccount();
		obj.deposit(500);
		obj.withdraw(100);
	}
}