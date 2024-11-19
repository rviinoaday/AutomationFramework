class Shape
{
	public void Image()
	{
		System.out.println("Circle");
	}
}


public class Basic2 {
	
	public void Booking()  //it is user define method and we can change as per requirement
	{
		System.out.println("Flight Booking");
	}
	
	public void HotelBooking()
	{
		
		System.out.println("Hotel");
	}
	
	//java define method and we cant chnage - always would be main only - it should be one only

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing");
		
		//object creation
		
		//classname ref = new Constructor();
		//ref.userdefinemethod()
		
		Basic2  a = new Basic2();
		a.Booking();
		a.HotelBooking();
		
		Shape s = new Shape();
		s.Image();
		
		
		

	}

}
