package Assignment1;

class TCSIndia {
	final public void logo() {
		System.out.println("TCS");

	}

	final public void iCard() {
		System.out.println("TCSIcard");

	}

	public void Location() {
		System.out.println("Pune");
	}

	public void Sal() {
		System.out.println("inr");
	}

	public void Holiday()

	{
		System.out.println("As per INDIA Holidaylist");
	}

	public void Dresscode() {
		System.out.println("Casual");
	}

}

class TCSUK extends TCSIndia {
	public void Location() {
		System.out.println("London");
	}

	public void Sal() {
		System.out.println("GBP");
	}

	public void Holiday()

	{
		System.out.println("As per UK Holidaylist");
	}
	
	public void Dresscode()
	{
		System.out.println("Fomal");
	}
	

}

class TCSCanada extends TCSIndia {
	public void Location() {
		System.out.println("Torato");
	}

	public void Sal() {
		System.out.println("CAD");
	}
	
	public void Holiday()

	{
		System.out.println("As per Canda Holidaylist");
	}

	public void Dresscode() {
		System.out.println("Casual");
	}

}

public class AssingmentMethodoveriding {

	public static void main(String[] args) {

		TCSUK uk = new TCSUK();
		uk.logo();
		uk.iCard();
		uk.Location();
		uk.Holiday();
		uk.Dresscode();

		TCSCanada cd = new TCSCanada();
		cd.logo();
		cd.iCard();
		cd.Location();
		cd.Sal();
		cd.Dresscode();

	}

}
