package javanewprojecttest;

import java.util.ArrayList;

public class LoopOfarraylist
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		for(int i=0;i<cars.size();i++)
		{
		System.out.println(cars.get(i));	
		}
		
	}

}
