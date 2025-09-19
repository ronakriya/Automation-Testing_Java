package javanewprojecttest;

import java.util.ArrayList;

public class Looparraylist2
{
	public void arrayString()
	{
	//Array list for String 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    	for (String i : cars)
    	{
    		System.out.println(i);
    	}
    
	}
    
  
    
  //Syntax of  for loop  for (Type variable : collection) 
	
	//For loop for Integer value of array

	public void arrayInteger()
	{
	//Array list for Integer 
 	  ArrayList<Integer> cars1 = new ArrayList<Integer>();
 	  cars1.add(10);
 	  cars1.add(30);
 	  cars1.add(10);
 	  cars1.add(50);    
	
    for (Integer j : cars1)
    {
      System.out.println(j);
    }
    
	}
    	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Looparraylist2 obj=new Looparraylist2();		
		obj.arrayString();		
		System.out.println("*************************");
		obj.arrayInteger();		
	}
		

}
