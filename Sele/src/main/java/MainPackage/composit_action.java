package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
//we can perform keyboard operation like ctrl+alt+click some link simultaneously by sendKeys(Keys.CONTROL) statement
//ctrl+left click on a link wil open that link in a new window
//these action are know as composite actions
public class composit_action {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,900)");
		WebElement w= driver.findElement(By.linkText("Sitemap"));
		Actions a=new Actions(driver);
		a.sendKeys(Keys.CONTROL).click(w).perform();
		Thread.sleep(1000);

	}
}
