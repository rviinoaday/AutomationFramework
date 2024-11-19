package Assignment1;


class constructDemo //  constructor class 


{
	int x=100;
	float y=3.15f;
	long z=200l;

constructDemo() //Default constructor
{
	System.out.println("Calling Defalut demo");
}

constructDemo(int a, int b)  // Parameterized constructor
{
	System.out.println("Calling int and String :: "+(a*b));
}

constructDemo(float a,String b)
{
	System.out.println("Calling float and String :: "+(a+b));
}

constructDemo(float a,String b,char c)
{
	System.out.println("Calling float and String :: "+(a+b+c));
}
constructDemo(char c,float a,String b) // Parameterized order change
{
	System.out.println("Calling Char float and String :: ");
}
constructDemo(char c,double a,boolean b) // Parameterized order change
{
	System.out.println("Calling char and double and boolean :: "+c+" " +a+" "+ b);
	
}

constructDemo(int a,float b,long c) // Parameterized order change
{
	 x=a;
	 y=b;
	 z=c;
	
}

  public void sum() // user defined method
 {
	  System.out.println("Addition of  int , float and Long :: "+(x+y+z));
         }
public void test()
{
	int x=12;
	int y = 12;
	int z= x+y;
	System.out.println("Additionm of x and y " + z);
	
	}
public void test(String a) 
{
	System.out.println(a);
}
}
public class AssingmentConstructor {

	public static void main(String[] args) {
		
		constructDemo cs=new constructDemo(); // calling default constructor 
		new constructDemo(10,20);
		new constructDemo(10.99f,"Testfloat");
		new constructDemo('a',12.22,true);
		new constructDemo('a',12.22f,"ABC");
		new constructDemo(10,12.3f,100l);
		cs.test();
		cs.test("Automation");
		cs.sum();
		
	
	}
}

