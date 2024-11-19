package Assignment1;

public class ClassA {
	int x =10;
	double y=9.66;
	
	// creating user defined method
	void m1() 
	{
		System.out.println(x+y);
		
	}
	void m2() 
	{
		System.out.println(x*y);
	}
	void m3() 
	{
		System.out.println(x-y);
	}
	
	public static void main(String[] args) {
		// calling method by using object 
		
		// Creating object to call the method
		// ClassName ref= new Classname ();
		
		ClassA met1=new ClassA();
		//System.out.println("Method M1 display addition: " + met1.m1());
		System.out.println("M1 Method addition is:");
		met1.m1();
		System.out.println("M1 Method Multiplication  is:");
		met1.m2();
		System.out.println("M1 Method Substratction is:");
		met1.m3();
}
}