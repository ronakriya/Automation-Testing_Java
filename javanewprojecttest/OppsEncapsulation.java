package javanewprojecttest;


public class OppsEncapsulation
{
	//Getter
	private String name;
		
	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
	this.name=newName;	
	}
		
	public static void main(String[] args)
	{
		OppsEncapsulation obj=new OppsEncapsulation();
		obj.setName("ronak");
		System.out.println("Enter Name:" + obj.getName());
	}
	
	
}



