class Animal
{
	public void Category()
	{
		System.out.println("Animal");
	}
}

class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roar");
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
public class ManyToOneInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d =new Dog();
		d.Voice();
		d.Category();
		
		Cat c  =new Cat();
		c.Voice();
		c.Category();
		

	}

}
