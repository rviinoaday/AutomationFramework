package Assignment1;
//short-- whole number-- less than integer and higher than byte
//byte-- whole number-- less range
class AdvanceOverlaoding 
{
	byte num;
	short num1;
public void AddTest (int a,short c) 
{
	System.out.println("Calling method byte and Short" +( num + num1));
}
//public void AddTest (int c,short e) 
//{
//	System.out.println("Calling method Short and Byte ");
//}

public void AddTest(int a , float b)
{
	System.out.println("calling int and double");
}
public void AddTest (int w , short c,byte e) 
{
	System.out.println("Calling method Int Short and Byte ");
}

public void AddTest(char a , int b)
{
	System.out.println("calling char and int");
}
}
public class AssingmentMethodoverloading {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		AdvanceOverlaoding ad = new AdvanceOverlaoding();
	
		ad.AddTest((byte)21, (byte)20);
		//ad.AddTest((byte)3,(short)-2541);
		//ad.AddTest((short) 1234, (byte) 1);
		//ad.AddTest(25,(short) 0, (byte)0);
		
		ad.AddTest('b', 20);
		
		
		//ascaii value 
		
	}

}
