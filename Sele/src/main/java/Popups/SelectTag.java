package Popups;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//select class is used to handle drop down menus
//it has parameterized constructor that takes WebElement as argument
public class SelectTag {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rakshitha.r/Desktop/selectTag.html");
		WebElement w=driver.findElement(By.id("Bowling"));
		Select s=new Select(w);
		s.selectByIndex(1);
		s.selectByVisibleText("Umesh");
		
		List<WebElement> l= s.getAllSelectedOptions();
		System.out.println("no of elements selected(size())="+l.size());
		
		
		WebElement w1= s.getFirstSelectedOption();
		System.out.println("First selected element's text="+w1.getText());
		
		
		List<WebElement> l1=s.getOptions();
		System.out.println("getOptions size="+l1.size());
		
		boolean n=s.isMultiple();
		System.out.println("isMultiple="+n);
		
		if(s.isMultiple())
		{
			//s.deselectByIndex(2);
			//s.deselectByVisibleText("Umesh");
			s.deselectAll();
		}

		
		
	}
}
