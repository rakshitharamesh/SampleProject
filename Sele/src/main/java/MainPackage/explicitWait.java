package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	}
	 
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,20);
		driver.get("https://spimail.spi.com/");
		//
		wait.until(ExpectedConditions.titleContains("Zimbra"));
		driver.manage().window().maximize();
		String expected="Zimbra Web Client Sign In";
		String actual="";
		actual=driver.getTitle();
		if(expected.equals(actual))
		{
			System.out.println("Right");
		}
		else
		{
			System.out.println("Wrong");
		}
		
		
	}
}
