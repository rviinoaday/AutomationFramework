package ForloopAssingment;

public class OddandEvennumberReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ODD Number

		// 1 3 5 7 9 11

		// 2 4 6 8 10
		System.out.println("Even number in reverse order");
		for (int i = 20; i >= 2; i = i - 2) {
			System.out.println(i);
		}

		System.out.println("ODD number in reverse order");
		for (int i = 19; i >= 1; i --) 
		{
			if(i%2==1)
			System.out.println(i);
		}

		System.out.println("Print String Value in Reverse order");
		String w="Welcome";
		w.length();
		for(int i=6;i>=0;i=i-1)
		{
			System.out.println(w.charAt(i));
		}
	}

}
