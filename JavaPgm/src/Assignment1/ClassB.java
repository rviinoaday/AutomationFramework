package Assignment1;

public class ClassB {

String a="Software";
String b="Testing";
double x=12.33;
char y= 'c';

void Name() 
{
	System.out.println(a+b);
}

void Name2(char d,double e) {

char d1=y;
double e1=x;
{
	System.out.println(d1+e1);
}	
}
void Name3() {
	int z=200;
	int y=300;
	int sum= z=y;
	System.out.println(sum);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB th= new ClassB();
		System.out.println("Printing method Name:");
		th.Name();
		System.out.println("Printing method Name2:");
		th.Name2('a', 2.33);
		System.out.println("Printing method Name:");
		th.Name3();
	}


}