package MainPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//implicit wait can be given for  certain seconds,hours,days,etc that is intended to wait for loading the webpage for the specific period.
//here it is given as 10 seconds, to prevent it from synchronization issue.
public class SampleWait {
	

static
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
}

public static void main(String args[]) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://spimail.spi.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String expected="Zimbra Web Client Sign In";
	String actual="";
	driver.manage().window().maximize();
	actual=driver.getTitle();
	if(actual.equals(expected))
	{
		System.out.println("Right");
	}
	else
	{
		System.out.println("Wrong");
	}
	Thread.sleep(500);
	driver.close();
	
}
}
