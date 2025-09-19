package javanewprojecttest;

import java.util.Scanner;


//Enter input by user with the use of scanner

public class UserInput
{

	public static void main(String[] args) throws InterruptedException
	{
		
		int a; 
		int b; 
		int c;
		
		Scanner obj=new Scanner(System.in);		
		
		System.out.println("Enter value a");
		a = obj.nextInt();
		
		System.out.println("Enter value b");
		b = obj.nextInt();
		
		c=a+b;
		System.out.println("c:" +c);
		obj.close();
		
	}

}
