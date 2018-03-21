package p4;

public class Check {
	boolean z= false;
	public boolean valid(int PinNo) {
		switch(PinNo){
			case 1111: z=true;break;
			case 2222: z=true;break;
			case 3333: z=true;break;
		}//End of Switch
			return (z);
		}
	}
