package javanewprojecttest;

//import java.util.Arrays;
import java.util.ArrayList;

public class Arraylist2 
	{
	public static void main(String[] args) 
		{
		 //Add one car in array list
		    
		    ArrayList<String> cars = new ArrayList<String>();		    
		    
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
     		cars.add(3, "Mazda"); // Insert element at the beginning of the list (0)
     		
     		//***************
     		//Clear specific item of array 
     		//cars.remove(0);
     		
     		
     		//****************
     		//Clear all array list
     		//cars.clear();
     		
     		//****************
     		//Size of array
     		//System.out.println(cars.size());
		    
     		System.out.println(cars);
		    
		    
		  }

	}
		

