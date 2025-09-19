package javanewprojecttest;

public class Abstractclass 
{
	abstract class Programing
	{	
		//when we dont have any information at that time we use abstract. Ex.here in programing which language we rae talking.		
		//When we have incomplete information at that time we use abstract method.
		//If the method is abstract then in class we also use word abstract word in class.
		
	public abstract void Developer();	
	
	}		
	

	class HTML extends Programing
	{
		
		//@Override
		public void Developer()
		{
			System.out.println("Tim BernerLee");
		}
	}
	
	class Java extends Programing
	{
		
		//@Override
		public void Developer()
		{
			System.out.println("Games Goosling");
		}
	}
	
	class C extends Programing
	{
		
		@Override
		public void Developer()
		{
			System.out.println("Dennis M. Ritchie");
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abstractclass outerclass = new Abstractclass();
		
	    Programing html = outerclass.new HTML();
	    html.Developer();
	    
	    Programing java = outerclass.new Java();
	    java.Developer();
	    
        Programing c = outerclass.new C();
	    c.Developer();
	}

}
