package javanewprojecttest;

public class OOPSCreatingMethod 
{	
	//static method
	static void mystaticclass()
	{
		System.out.println("Static method called without creating object");
	}
	
	public void mypublicclass()
	{			
		System.out.println("public method called by creating by object");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OOPSCreatingMethod obj=new OOPSCreatingMethod(); 	// Creating object of class
		obj.mypublicclass(); 	// called public method
		mystaticclass();		// called static class
	}

}
