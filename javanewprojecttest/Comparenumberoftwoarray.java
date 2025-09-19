package javanewprojecttest;

public class Comparenumberoftwoarray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int i,j;		
				int a[] = {10,20,30,40,50};
				int b[] = {10,30,60,70,80};
				int n=5;
				
				for(i=0;i<n;i++)
				{
					for(j=0;j<=i;j++)
						{
						if(a[i]==b[j])
						{
							System.out.println(+a[i]);
						}
						}
				}

	}

}
