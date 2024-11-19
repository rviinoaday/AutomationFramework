package Assignment1;

// method overloading -- We are creating multiple  methods with same name but different parameters
class calculator
{
	void add(int a,int b)
	{
		System.out.println("Addition of two numbner is  "+(a+b));
	}
	void add(double a,int b)
	{
		System.out.println("Addition of double and int is a "+(a+b));
	}
	void add(double a,double b)
	{
		System.out.println("Addition of double and int is a "+(a+b));
	}
	
	
}
public class Overlaodpractice {

	public static void main(String[] args) {
		
		calculator calc= new calculator();
		calc.add(10, 20);
		calc.add(12.33, 100);

	}

}
