package Assignment1.pack2;
//constructor assignment 
class tree{
	
	int age;
	String type;
	String category;
	
	public tree() 
	{
		
		age = 120;
		type= "palm";
		category="forest tree";
		System.out.println("Default Constructor ");
	}
	
	public tree(int age,String type,String category) 
	
	{
		this.age=age;
		this.type=type;
		this.category=category;
		System.out.println("Parametrised Constructor ");
	}
	
	public void DisplayInfo() {
		
		System.out.println("Display age of tree:: "+age);
		System.out.println("Display type of tree:: "+type);
		System.out.println("Display category of tree:: "+category);
		
	}
}
public class const1 {

	public static void main(String[] args) {
		// Create a object of main class and method is constructor 
		
		tree tr = new tree();
		tr.DisplayInfo();
		tree tr1 = new tree(10,"cocunt","local");
		tr1.DisplayInfo();
		
	}

}
