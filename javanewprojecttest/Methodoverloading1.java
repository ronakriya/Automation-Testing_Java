package javanewprojecttest;

public class Methodoverloading1 
{
	static int plusmethodInt(int a, int b)
	{
		return a + b;
	}

	static double plusmethodDouble(double a, double b)
	{
		return a + b;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		
		int myNum1=plusmethodInt(10,20);		
		double myNum2=plusmethodDouble(30.40, 20.1);		
		System.out.println(myNum1);
		System.out.println(myNum2);
		
	}
		
		
}


