package Assignment1;

// Create a program for currency and output should be whenever you are creating any object of any country that currency 


class Country
{
	public void CurrencyCountry()
	{
		System.out.println("Depends on UN ");
	}
}
class India extends Country // declare the currency INR/USD/GBP
{
	public void Currecny()
 {
	 System.out.println("Currancy is INR ");
 }

}

class UK extends Country
{
	public void Currecny()
	{
		System.out.println("currency is pound");
	}
}


public class AssingmentInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UK k = new UK();
		k.Currecny();
		k.CurrencyCountry();
		
		India i = new India();
		i.Currecny();
		i.CurrencyCountry();
	}

}
