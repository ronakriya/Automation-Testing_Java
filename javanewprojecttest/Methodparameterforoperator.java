package javanewprojecttest;

public class Methodparameterforoperator
{
	int c;
	static void add(int a , int b)
	{
	
		int c=a+b;
		System.out.println("Addition of two number:" +c);
		
	}
	static void mul(int a , int b)
	{
	
		int c=a*b;
		System.out.println("Multiplication of two number:" +c);
		
	}
	
	static void sub(int a , int b)
	{
	
		int c=a-b;
		System.out.println("Subtraction of two number:" +c);
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add(10,20);
		mul(20,10);
		sub(40,30);
	}

}
