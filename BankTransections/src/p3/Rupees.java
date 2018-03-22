package p3;
import p2.Transaction;
import p4.Balance;
@SuppressWarnings("unused")
public class Rupees implements Transaction {
	Balance x;//ref variable
	public Rupees(Balance x) {
		this.x=x;
		
	}
	public void Withdraw(int amt) {
		
		if(amt>x.bal) {
			System.println("Isufficient Balance");
			
		}
		else {
			System.out .println("Amount Withdrawn="+amt);
			System.out .println("Current Balance="+(x.bal-amt));
			System.out .println("Transection Completed");
		}
	}
	public void payment(float amt) {
		if(amt>x.bal) {
			System.println("Isufficient Balance");
		}
		else {
			System.out .println("Amount Paid="+amt);
			System.out .println("Current Balance="+(x.bal-amt));
			System.out .println("Transection Completed");
		}
	}
	
	public void Deposit(int amt) {
		
			System.out .println("Amount Deposited="+amt);
			System.out .println("Current Balance="+(x.bal+amt));
			System.out .println("Transection Completed");
		
	}
	
}