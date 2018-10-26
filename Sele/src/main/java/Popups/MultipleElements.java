package Popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("C:\\Users\\rakshitha.r\\Desktop\\sample.html");
			driver.manage().window().maximize();
			List<WebElement> l= driver.findElements(By.tagName("a"));
			int count =l.size();
			System.out.println("no of links= "+count);
			WebElement link= l.get(1);
			link.click();
			Thread.sleep(1000);
			
		
	
	}

}
