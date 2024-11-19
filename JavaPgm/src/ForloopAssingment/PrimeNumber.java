package ForloopAssingment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 22;
		boolean prime=true;
		
		for(int i=2;i<=num;i++)
		{
			if(num % i==0) 
			{
				prime=false;
						break;
			}
			
		}
		System.out.println("number is NOT Prime ");
		
		if(prime && num >1) 
		{
			System.out.println("number is Prime ");
		}
		
	}
	

}
