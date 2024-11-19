class KFCAmerica
{
	final public void Product()
	{
		System.out.println("KFC");
	}
	
	public void Location()
	{
		System.out.println("California");
	}
}


class KFCIndia extends KFCAmerica
{
//	public void OwnLocalProduct()   // this is not allowaed as we use the upcasting
//	{
//		System.out.println("Available india Branch");
//	}
	
	
	public void Location()
	{
		System.out.println("Hyderabad");
	}
}

class KFCUK extends KFCAmerica
{
	public void Location()
	{
		System.out.println("London");
	}
}
public class MethodOverridingRealTimeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KFCAmerica k = new KFCIndia(); //Upcasting  // Create a object of parent class and use the child class as constructor this is called upcasting 
		k.Location();
		k.Product();
	//	k.OwnLocalProduct();

	}

}
