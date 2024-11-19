package PolyMorphism;


/*Runtime Polymorphism is a  combination of  Method Over riding , inheritance and upcasting
//Runtime polymorphism is a more secure were we can achive the default options we need to use for child method 
 E.g. Any brand name can not change in other location and this we can achive with upcasting RTP  by using below 
//upcasting  means  create a object with parent class and with Child class constructor
 * eg. here is Parent is Animal and child is a Dog, tiger,cat . 
 * Animal a = new tiger(); this is upcasting -- calling child constructor 


*/
class Animal
{
	public void Voice()
	{
		System.out.println("Animal voice");
	}
}

class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roaring");
	}
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("Bark");
		
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}

public class RTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Tiger();  //Upcasting
		a.Voice();
		
		//Webdriver driver = new EdgeDriver() //RTp

	}

}
