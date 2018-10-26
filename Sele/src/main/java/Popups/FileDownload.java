package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class FileDownload {
	//file downlaod popup appears only in firefox not in chrome
	//cannot inspect popup
	//this popup can be moved
	//two radio buttons-open and save
	//Handled by Robot class-Robot Class can simulate Keyboard and Mouse Event
	//keyPress()-keyboard actions-takes argument like VK_TAB,VK_ENTER,VK_DOWN,
	//mousePress()-mousepressing actions
	public static WebDriver driver;
	
	public static void main(String args[]) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
//		driver.findElement(By.xpath("//td[.='Java']/../td[4]/a")).click();
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Hi");
	}
	

}
