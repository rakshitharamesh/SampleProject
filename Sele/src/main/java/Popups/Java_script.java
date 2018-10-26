package Popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script {
	
		//to handle pop-up we use switchTo.alert() statement for control to transfer to javascript pop-up
		//getText() used to get the message on pop-up


			public static void main(String args[]) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id='content']/button")).click();
				Thread.sleep(1000);
				Alert a= driver.switchTo().alert();
				String message=a.getText(); // getting text from the pop-up 
				System.out.println(message); //displaying explicitly
				a.accept();
				Thread.sleep(2000);
				//again clicking for pop-up for dismissing it
				driver.findElement(By.xpath("//*[@id='content']/button")).click();
				a.dismiss();
				Thread.sleep(2000);
				
				
				
				
			}
		}

