package javanewprojecttest;

public class TypeCasting 
{
		
	public static void main() throws InterruptedException
	{
	//Widening Casting
	//Widening casting is done automatically when passing a smaller size type to a larger size type	
	//Narrowing Casting
	//Narrowing casting must be done manually by placing the type in parentheses () in front of the value
			
	//Manual Casting
	double myDouble = 5.76d;
	int myInt = (int) myDouble;	
	System.out.println(myDouble);
	System.out.println(myInt);	
	}	
	
}
