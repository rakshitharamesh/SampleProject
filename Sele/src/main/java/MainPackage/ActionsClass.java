package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Action is an interface and actions is a class 
//Actions class has parameterized constructor which is overloaded- depends on driver like chrome,gheko,ie-Actions(WebDriver driver)
//Actions class can perform drag and drop
//this class can come into actual action only when perform() method is executed at the end

//mouse hover(MoveToElement),Double Click,Context click(right click),Composite action

public class ActionsClass {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().window().maximize();
		Actions action= new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement dst=driver.findElement(By.xpath("//h1[.='Block 4']"));
		action.dragAndDrop(src,dst).perform();
		Thread.sleep(1000);
		
		
	}
	
}
