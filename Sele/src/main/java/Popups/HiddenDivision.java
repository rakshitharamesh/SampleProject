package Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	
	//hidden division pop-up
	//cant move this popup
	//it will be of different colour
	//may or may not have buttons
	//name division because while writing html code they use div tags as main tag

		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cleartrip.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("DepartDate")).click();
			driver.findElement(By.linkText("20")).click();
			Thread.sleep(1000);
		}
		
	}



