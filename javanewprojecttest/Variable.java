package javanewprojecttest;

public class Variable 
{
	
	//Print number
	public void Printnum() throws InterruptedException
	{
		
		int myNum=100;
		System.out.println(myNum);
	}
	
	//Print number
	public void Printaddtwonum() throws InterruptedException
	{
		
		int x=10;
		int y=20;
		
		System.out.println(x+y);
	}
	
	
	//Print String
	public void Printstring() throws InterruptedException
	{
		String FirstName="Patel";
		String SecondName="Rahi";
		String FullName=FirstName + " " + SecondName;
		System.out.println(FullName);		
	}
	

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Variable obj=new Variable();
		obj.Printnum();
		obj.Printaddtwonum();
		obj.Printstring();
	}

}
