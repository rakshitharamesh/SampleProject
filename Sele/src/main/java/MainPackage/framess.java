package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//for better visibility developer use embedded frames in webpages with tag name called iframe
//driver.switchTo().frame(arg) where frame(arg) is overloaded with Integer(index) or String(id or name) or WebElement
//to switch to parent frame-> driver.switchTo.defaultCont
public class framess {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\rakshitha.r\\Desktop\\page1.html");
		driver.navigate().refresh();
	
		//switch using index
		//1st child frame has index-0
		//2nd chlid frame has index-1
		//to switch to parent frame defaultContent() is used
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("index");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("index1");
		
		
		//switch using id
		//iframe id of page2 is f1
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("id");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("id1");
		
		
		//switch using name
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t2")).sendKeys("id");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("id1");
		
				
		//switch by webelement/reference
		WebElement e=driver.findElement(By.id("f1"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("ref");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("ref1");
		
	}

}
