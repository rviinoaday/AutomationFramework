package Assignment1;


class Add

{
	
	Add() // default constructor 
	{
		System.out.println("Calling default constructor " );
	}
	Add(int a) // parametrised constructor 
	{
		System.out.println("Calling int a" +a);	
	}
	
	Add(String b , int a)
	{
		System.out.println("Calling String "+(b+a));
	}
	Add(int a ,float c)
	{
		System.out.println("Calling int and float"+(a+c));
	}
	
	Add(int a , char e)
	{
		System.out.println("Calling int a"+(a+e));
	}
	
	void test() {
		System.out.println("User defind method");
	}
}


public class ConstrtuctorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add ad= new Add();  // calling default constructor 
	new Add(10);
	new Add("Test",11);
	new Add(10,12.33f);
	new Add(10,'a');
	
	ad.test();// calling user defined method
	
	
 
	}

}
