package javanewprojecttest;

public class Inheritance1 
{
	
	
	
	class Add
	{
		
		
		int a=20; int b=2; int c; int d;				
		void input()
		{			

			System.out.println("Value of a : "  + a);		
			System.out.println("Value of b : "  + b);			
			c= a+b;
			System.out.println("Add two data: " + c);
		}
		
	}
	
	class Sub extends Add
	{
		
		void display()
		{
			c = a-b;
			System.out.println("Sub two data:" +c);
		}
		
	}
	
	class Mul extends Add
	{
		
		void display()
		{
			c= a*b;
			System.out.println("Mul two data:" +c);
		}
		
	}
	
	class Div extends Add
	{
		//int d;
		void display()
		{
			c= a/b;
			System.out.println("Div two data:" +c);
		}
		
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Inheritance1 outer=new Inheritance1();
		
		Add add = outer.new Add();
		add.input();
		
		Sub sub = outer.new Sub();
		sub.display();
		
		Mul mul = outer.new Mul();
		mul.display();
		
		Div div = outer.new Div();
		div.display();
		
	}

}
