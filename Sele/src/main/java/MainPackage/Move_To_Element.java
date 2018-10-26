package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//moveToElement method used for mouse hovering actions
public class Move_To_Element {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.istqb.in/");
		driver.manage().window().maximize();
		WebElement w= driver.findElement(By.xpath("//a[.='FOUNDATION']"));
		Actions action=new Actions(driver);
		action.moveToElement(w).perform(); 	 	
		driver.findElement(By.xpath("//a[.='ONLINE ENROLLMENT']")).click();
		
		
	}
}
