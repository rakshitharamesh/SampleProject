package MainPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//javascriptexecutor is a interface that has methods executeScript and executeAsyncScript
//executescript used to scroll down the web page
public class SrciptExecutor {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		JavascriptExecutor j =(JavascriptExecutor) driver;
		//scroll 50px down
		for(int i=1;i<=5;i++)
		{
				j.executeScript("window.scrollBy(0,50)");
				Thread.sleep(1000);
		}
		//scroll 50px down
		for(int i=1;i<=5;i++)
		{
			j.executeScript("window.scrollBy(0,50)");
			Thread.sleep(1000);
		}
		
		//scroll up by 50px
		for(int i=1;i<=5;i++)
		{
			j.executeScript("window.scrollBy(0,-50)");
			Thread.sleep(1000);
		}
		
		//scroll 50px right
		for(int i=1;i<=5;i++)
		{
			j.executeScript("window.scrollBy(50,0)");
			Thread.sleep(1000);
		}
		//scroll 50px left
		for(int i=1;i<=5;i++)
		{
			j.executeScript("window.scrollBy(-50,0)");
			Thread.sleep(1000);
		}
	}
	

}
