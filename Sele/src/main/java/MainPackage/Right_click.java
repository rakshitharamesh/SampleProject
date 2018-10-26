package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//context click is used for right clicking on particular webelement
public class Right_click {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		WebElement w = driver.findElement(By.xpath("//input[@id='fname']"));
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.contextClick(w).perform();
		Thread.sleep(1000);
		
	}
}
