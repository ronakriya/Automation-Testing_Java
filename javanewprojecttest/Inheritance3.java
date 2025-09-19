package javanewprojecttest;

public class Inheritance3
{
	
	class Animal
	{
		public void animalsound()
		{
			System.out.println("The Animal make a sound");		
		}			
	}
	
	
	class Pig extends Animal
	{
		public void animalsound()
		{
			System.out.println("The pig say wee wee");		
		}
		
	}
	
	class Dog extends Pig
	{
		public void animalsound1()
		{
			System.out.println("The dog say bow wow");		
		}
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Inheritance3 outer=new Inheritance3();
		
		Pig obj = outer.new Pig();
		obj.animalsound();
		
		Dog obj1 = outer.new Dog();
		obj1.animalsound1();	
	}

}
