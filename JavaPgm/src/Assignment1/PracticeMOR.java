package Assignment1;

/*
Method overriding  examples with inheritance and Constructor 

By using inheritance we are utilize the properties of  parent class into child class 
Inheritance = We can achieve the inheritance with the "extend" Keyword 
Method overriding -- Same methods but in different class and implementation should be different that is called method overriding and we can achieve with the help of extends keyword in java
"final" Keyword is use for declare constant variable/method/class which is we can't  extend or change 
*/


class Vehicle  //parent class 
{
	 void start()   //method implementation 
	{
		System.out.println("Vehicle engine is starting");

	}
	 void stop()
	 {
		 System.out.println("Vehicle engine is stop ");
	 }
}

class scooter extends Vehicle // created a  class and extend the properties from parent class "Vehicle"
{
	void start()   // created a method with same name as a parents class with different implementation 
	{
		System.out.println("Scooter is Strating");
	}
	void stop()
	{
		 {
			 System.out.println("Scooter engine is stop ");
		 }
	}
}

class Sumo extends Vehicle   //created a  another class and extend the properties from parent class "Vehicle"
{
	void start()    // created a method with same name as a parents class with different implementation 
	{
		System.out.println("Car engine is Strating");
	}
	void stop()
	{
		 {
			 System.out.println("car engine is stop ");
		 }
	}
}

public class PracticeMOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vs= new scooter();  // created a object for the main  parent class
		vs.start(); 
		vs.stop();// this is calling "Vehicle is starting "
		
		/*// created new object for scooter class
		
		scooter sc= new scooter();
		sc.start();
	
		// created new object for car class
		
				car cr= new car();
				cr.start();
				vs.stop();*/
		
		

	}

}
