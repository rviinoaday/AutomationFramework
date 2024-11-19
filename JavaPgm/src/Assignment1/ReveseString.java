package Assignment1;

public class ReveseString {
	public static void main (String[]args) {
		
		String str= "Rahoul"; //declare a string 
		String rev = " "; // store a reveserved
		int len=str.length();// store teh lenght of string 
		
		for(int i=len-1;i>=-0;i--) // for loop 
		{
			rev=rev + str.charAt(i);
		}
		System.out.println("Revese string is ::"+rev);
		
		
		
		// Using string buffer;
		StringBuffer sb= new StringBuffer("1234");
		System.out.println("Revese is ::"+sb.reverse());
		
		
	}
	
	

}
