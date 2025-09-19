package TestNGReport;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Emailsend
{

	public static void main(String[] args) throws EmailException
	{
		// TODO Auto-generated method stub
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("rp6038272@gmail.com", "Set@123"));
		email.setSSLOnConnect(true);
		email.setFrom("rp6038272@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("rp6038272@gmail.com");
		email.send();
	}

}
