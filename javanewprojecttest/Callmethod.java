package javanewprojecttest;

public class Callmethod 
{
	
	
	static int a=40;
	static int b=20;	
	
	static void add()
	{
			
		
		System.out.println("Addition of a and b: " +(a+b));	
	}	
	
	
	static void mul()	
	{
		
	System.out.println("Multiplication of a and b: " +(a*b));
	
	}
	
	static void sub()	
	{
		System.out.println("Subtraction of a and b: " +(a-b));	
	}
	
	
	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
		add();
		mul();
		sub();
	}

}
