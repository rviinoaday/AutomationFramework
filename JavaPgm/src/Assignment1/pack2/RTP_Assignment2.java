package Assignment1.pack2;

class world  //parent class
{
	public void nature() {
		System.out.println("World is created with diffrant weathor condition ");
	}
}

class summer extends world  // Inheritance 
{
	public void nature()   // overriding using same method name 
	{
		System.out.println("Summer is very hot during the 4 months of time March to June");
	}
}
class winter extends world
{
	public void nature() 
	{
		System.out.println("Winter is very cold during the month of october to Jan");
	}
}
class rain extends world
{
	public void nature()
	{
		System.out.println("Haevy rain during the July to Sep");
	}
}
public class RTP_Assignment2 {

	public static void main(String[] args) {
		// create a object with parent class 
		world w = new summer(); // upcasting using chlid class constructor 
		w.nature();
		new winter();
	}

}
