package p1;
import java.util.*;
import p3.Rupees;
import p4.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Balance b1=new Balance();
		boolean k=true;
		int count=0;
		while(k) {
			System.out.println("Enter the pin Number");
			int PinNo=s.nextInt();
			if(PinNo>=1111 && PinNO<=9999>) {
				Check c1=new check();
				bolean z=c1.valid(PinNo);
				if(z) {
					System.out.println("Enter the Choice");
					System.out.println("1. Rupees \n 2. Dollar");
					
				}
			}
			
		}

	}

}
