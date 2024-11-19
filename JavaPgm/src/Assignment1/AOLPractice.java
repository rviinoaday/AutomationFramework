package Assignment1;


class addTest
{
void test(int a, float b) 
	{
	System.out.println("Calling int and float ");

	}

void test(char a , short b) 
	{
System.out.println("calling char ans short");	
	}

}
public class AOLPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	addTest add = new addTest();
	//add.test(10,20.33f);
	add.test('a', (byte)10);  // how to call char and short

}
}