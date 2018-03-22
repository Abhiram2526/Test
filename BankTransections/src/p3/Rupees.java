package p3;
import p2.Transaction;
import p4.Balance;
public class Rupees implements Transaction {
	Balance x;//ref variable
	public Rupees(Balance x) {
		this.x=x;
		
	}
	public void Withdraw(int amt) {
		
		if(amt>x.bal) {
			System.out.println("Isufficient Balance");
			
		}
		else {
			System.out .println("Amount Withdrawn="+amt);
			System.out .println("Current Balance="+(x.bal-amt));
			System.out .println("Transection Completed");
		}
	}
	
	@Override
	public void Payment(float amt) {
		// TODO Auto-generated method stub
		if(amt>x.bal) {
			System.out.println("Isufficient Balance");
		}
		else {
			System.out .println("Amount Paid="+amt);
			System.out .println("Current Balance="+(x.bal-amt));
			System.out .println("Transection Completed");
		}
		
	}
	@Override
	public void Deposite(int amt) {
		// TODO Auto-generated method stub
		System.out .println("Amount Deposited="+amt);
		System.out .println("Current Balance="+(x.bal+amt));
		System.out .println("Transection Completed");
		
	}
	
}