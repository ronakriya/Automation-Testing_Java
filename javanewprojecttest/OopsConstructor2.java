package javanewprojecttest;

public class OopsConstructor2 
{
	int modelYear;
	String modelName;
	
	//Constructor is a same name of classname
	public OopsConstructor2(int Year, String Name)
	{
		modelYear=Year;
		modelName=Name;
	}

	public static void main(String[] args) 	
	{
		// TODO Auto-generated method stub
		OopsConstructor2 cars= new OopsConstructor2(1970, "Mustang");
		System.out.println(cars.modelName + "  " + cars.modelYear);
		
		
	}

}
