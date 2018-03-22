package p1;
import java.util.*;
import p3.Rupees;
import p4.Check;
import p4.Balance;

public class Bank {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		Balance b1=new Balance();
		boolean k=true;
		int count=0;
		while(k) {
			System.out.println("Enter the pin Number");
			int PinNo=s.nextInt();
			if((PinNo>=1111) && (PinNo<=9999)) {
				Check c1=new Check();
				boolean z=c1.valid(PinNo);
				if(z) {
					System.out.println("Enter the Choice");
					System.out.println("1. Rupees \n2. Dollar");
					int choice=s.nextInt();
					switch(choice) {
					case 1://Rupees
						Rupees R1=new Rupees(b1);
						System.out.println("Enter the choices");
						System.out.println("1. Widrawal \n2. Payment\n3. Deposite ");
						int choice1=s.nextInt();
						switch(choice1) {
						case 1://Withdrawal
							System.out.println("Enter the amount =>");
							int amt1=s.nextInt();
							if(amt1<10 || amt1%100!=0) {
								System.out.println("Invalid Amount");
							}
							else {
								R1.Withdraw(amt1);
							}
							break;
						case 2://Payment
							System.out.println("Enter the amount =>");
							float amt2=s.nextFloat();
							if(amt2<=0) {
								System.out.println("Invalid Amount");
							}
							else {
								R1.Payment(amt2);
							}
							break;
						case 3://Deposite
							System.out.println("Enter the amount =>");
							int amt3=s.nextInt();
							if(amt3<0 || amt3%100!=0) {
								System.out.println("Invalid Amount");
							}
							else {
								R1.Deposite(amt3);
							}
							break;
						default:
							System.out.println("Invalid Amount");
						}//End of Inner Switch
						break;
					case 2://Dollars
						break;
					default:
						System.out.println("Invalid Amount");
					}//End of outer Switch
					System.exit(0);
				}//End of if
				else {
					count++;
				}
			}//End of if
			else {
				count++;
			}
			if(count==3) {
				System.out.println("Transaction BLOCKED");
				System.exit(0);
			}
			
		}//end of while

	}//end of Main

}//End of class
