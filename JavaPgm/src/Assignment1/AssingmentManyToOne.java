package Assignment1;

class Vegetables
{
	public void Category()
	{
		System.out.println("vegitable type");
	}
	
}

class termeric extends Vegetables
{
	public void tcolour()
	{
		System.out.println("yellow");
	}
}
class Chilli extends Vegetables
{
	public void chillicolour()
	{
		System.out.println("Green");
	}
}

class tomato extends Vegetables
{
	public void tcolour()
	{
		System.out.println("Red");
	}
}

public class AssingmentManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		termeric tr = new termeric();
		
		tr.Category();
		tr.tcolour();
		
		Chilli ch = new Chilli();
		ch.Category();
		ch.chillicolour();
		
		tomato to = new tomato();
		to.Category();
		to.tcolour();
	}

}
