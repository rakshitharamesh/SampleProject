package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	}
	

	public static void main(String[] args) 
	{
		 WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize(); //maximize window
		String url=driver.getCurrentUrl();
		System.out.println("current url= "+url);
		String title=driver.getTitle();
		System.out.println("title= "+title);
		//String src=driver.getPageSource();
		//System.out.println("pagesource= "+src); 
		String windowHandle=driver.getWindowHandle();
		System.out.println("windowhandles="+windowHandle);
		
		
		//String tname=driver.findElement(By.xpath("//button[@class='vh79eN']")).getTagName();
		//System.out.println(tname);
		
		//driver.findElement(By.xpath("//input[@class='LM6RPg']")).clear();
		//driver.findElement(By.xpath("//input[@class='LM6RPg']/../parent::div/following-sibling::*/child::button")).click();
		
	}

}
