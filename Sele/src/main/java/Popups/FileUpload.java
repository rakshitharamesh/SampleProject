package Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	//cant inspect file upload popup
	//can move the popup
	//title of popup will be file upload- will have open and close
		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://my.naukri.com/account/register/basicdetails");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\rakshitha.r\\Downloads\\RAKSHITHA_(updated_resume)");

			
		
		}
		

	}

