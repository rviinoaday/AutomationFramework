
public class ForLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1-10
		
		/**
		 * int i = 1 --- initalization
		 * i<=10 --- condition if condition is true - loop will continue if fail loop will break
		 * i++ -- increment -- i=i+1  i=i+2  i= i-1 === i--
		 * 
		 */
		
		for(int i = 1 ; i<=10 ; i++) // 11  11<=10  11
		{
			System.out.println(i);
		}
		
		//ODD Number
		
		//1 3 5 7 9 11
		
		// 2 4 6 8 10
		
		for(int i = 2 ; i<=20 ; i=i+2)
		{
			System.out.println(i);
		}
		
		   //       0123456
		String s = "Testing";
		
		System.out.println(s.length());
		
		
		for(int i = 0 ; i<=6 ; i++)   // 1  1<=6 1
		{
			System.out.println(s.charAt(i)); //"Testing".charat(1)
		}
		
		//10 9 8 7 

		for(int i = 10 ; i>=1  ; i--)
		{
			System.out.println(i);
		}
		
		
		//Reverse odd and even number
		
		//reverse String of Testing
		
		//Trying to print Febonicii Series
		
		//Trying to work on prime number 

	}

}
