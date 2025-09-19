package javanewprojecttest;

public class Methodoverloading2 
{
	
	static int method(int a, int b)
	{
		return a+b;
	}
	
	static double method(double j, double k)
	{
		return j+k;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int my1=method(10, 20);
		double my2=method(3.3, 5.5);
		
		System.out.println(+ my1);	
		System.out.println(+ my2);
	}

}
