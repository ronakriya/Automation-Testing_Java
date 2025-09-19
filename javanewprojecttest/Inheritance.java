package javanewprojecttest;

public class Inheritance 
{

	class Student
	{
		int roll, marks;
		String name;
		
		void Input()
		{
			System.out.println("Enter roll no , Name and marks:");
		}
		
	}
	
	class Ankit extends Student
	{
		void Display()
		{
			roll=1; name="Ankit"; marks=80;
			
			System.out.println(roll + " " + name + " " + marks);
		}
	}

	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Inheritance outer=new Inheritance();
		
		
		Ankit ankit = outer.new Ankit();
		ankit.Input();		
		ankit.Display();
		
	}

}
