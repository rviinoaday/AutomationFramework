package Assignment1;
class Motor 
{
    int year;
    String model;
    String color;

    // Default constructor
    public Motor() {
        model = "Unknown";
        color = "Silver";
        year = 1999;

        System.out.println("Default constructor called");
    }

    public Motor(int year, String model, String color) 
    // Parameterized constructor
    {
        this.year = year;
        this.model = model;
        this.color = color;

        System.out.println("Parameterized constructor called");
    }

    // Method to display object information
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

}
public class Constructor_Test {

	public static void main(String[] args) 
	{
        // Creating an object using the default constructor
		Motor car1 = new Motor();
        car1.display();

          // Creating an object using the parameterized constructor
        Motor car2 = new Motor(2023, "Tesla", "White");
        car2.display();

	}

}
