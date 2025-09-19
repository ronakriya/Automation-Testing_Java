package javanewprojecttest;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date 
{
	
	public void DateNow()
	{
		//For Display Date
		LocalDate obj=LocalDate.now();
		System.out.println(obj);
	}
	
	public void Time()
	{
		//For Display Date/Time		
		LocalDateTime obj=LocalDateTime.now();
		System.out.println(obj);
	}
	
	public void DateTime()
	{
	//For Display Time		
	LocalTime obj=LocalTime.now();
	System.out.println(obj);	
	}
	
	public void Formatdatetime()
	{
		
		LocalDateTime myDateObj=LocalDateTime.now();		
		System.out.println("Before formatting : " + (myDateObj));		
		DateTimeFormatter myFormatObj1=DateTimeFormatter.ofPattern("MM-dd-YYYY" + "   " + "HH:MM:SS");				
		String formattedDate = myDateObj.format(myFormatObj1);
		System.out.println("After formatting : " + formattedDate);			
	}
	

	public static void main(String[] args) 
	{				
		Date obj=new Date();		
		obj.DateNow();
		//obj.Time();
		//obj.DateTime();
		obj.Formatdatetime();		
	}

}
