package javanewprojecttest;

public class Datatype 
{

	//Primitive data type
		//byte, short, int, long, float, double, boolean and char are called "primitive datatype"
		//Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
		//The byte data type can store whole numbers from -128 to 127.
		//The short data type can store whole numbers from -32768 to 32767
		//The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial,
		//The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807
		//You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.	
		//Very often in programming, you will need a data type that can only have one of two values, like:
		//YES / NO / ON / OFF / TRUE / FALSE
		//....Stored in stack memory
	
	//Non Primitive data type
		//String, Array, Class, Interface, Object, List, Map, Set. 
		//.....Stored in heap Memory
	    
	
	
		  public static void main(String[] args) 
		  {
		    // Create variables of different data types
		    int items = 50;
		    float costPerItem = 9.99f;
		    float totalCost = items * costPerItem;
		    char currency = '$';

		    // Print variables
		    System.out.println("Number of items: " + items);
		    System.out.println("Cost per item: " + costPerItem + currency);
		    System.out.println("Total cost = " + totalCost + currency);
		  }
		}

