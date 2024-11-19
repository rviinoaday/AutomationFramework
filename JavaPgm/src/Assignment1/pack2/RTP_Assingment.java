package Assignment1.pack2;


/* Create a Run time ploymorphism assignment
 * Description  - Create a programme with overriding , inheritance ,and upcasting 
 * overriding  is process where we are creating parent class and diffrent child class with differn implemtation and externd the parent calss 
 * properties by using inheritance concept "extend"e 
 * 
 * 
 * 
 * 
 * 
 */

class shape  // parent class 
{  
	
	public void draw()
	{
		System.out.println("draw the shape ");
	}
}

class circle extends shape
{
	public void draw()
	{
		System.out.println("draw the Circle ");
	}
}

class triangle extends shape 
{
	public void draw()
	{
		System.out.println("draw the Traingle ");
	}
	
}
class squre extends shape{
	
	public void draw ()
	{
		System.out.println("Draw the squre");
	}
}
public class RTP_Assingment {

	public static void main(String[] args) {
		// creating object with parnet and child class
		shape s= new circle();  // upcasting >> use the child constructor so it will call the "cirecle" Implementation
			s.draw();
	}

}
