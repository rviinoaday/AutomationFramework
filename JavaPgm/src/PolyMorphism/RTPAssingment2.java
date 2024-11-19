package PolyMorphism;

class payment // parent class
{
	
	public void paymentprocess() // method
	{
		System.out.println("Default paymnet process method ");
		
	}
}

class creditCardpayment extends payment // RTP created class and extend properties from parent class
{
	
	public void paymentprocess() 
	{
		System.out.println("Credit card payment process  ");
		
	}
}
class paypalPayment extends payment // RTP created class and extend properties from parent class
{
	public void paymentprocess() 
	{
		System.out.println("Paypal payment process to bank ");
		
	}
}
class BanktransferPayment extends payment // RTP created class and extend properties from parent class
{
	public void paymentprocess() 
	{
		System.out.println("Bank Transfer paymnet process method ");
		
	}
}
public class RTPAssingment2 {  // Main Class and Method 

	public static void main(String[] args) {
		//create object with parents but call the child constructor this is example of real time polymorphism
		
		payment py = new creditCardpayment();
		py.paymentprocess();
		payment py1 = new BanktransferPayment();
		py1.paymentprocess();
		payment py2 = new paypalPayment(); // calling the contrtuctor 
		py2.paymentprocess();

	}

}
