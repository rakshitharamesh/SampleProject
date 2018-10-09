package testrun;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainFT {
	protected WebDriver driver;

	
		
	@Given("the user is on the fund transfer page")
	public void the_user_is_on_the_fund_transfer_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://cookbook.seleniumacademy.com/fundTransfer.html");
		throw new cucumber.api.PendingException();
	}
	
	@When("he enters \"([^\"]*)\" as payee name")
	public void he_enters_jim_as_payee_name(String name)
	{
		driver.findElement(By.id("payee")).sendKeys(name);
		throw new cucumber.api.PendingException();
	}
	
	@When("he enters \"([^\"]*)\" as amount")
	public void he_enters_as_amount(String amt) 
	{
		driver.findElement(By.id("amount")).sendKeys(amt);
		throw new cucumber.api.PendingException();
	}
	
	@When("he submits request for fund transfer")
	public void he_submits_request_for_fund_transfer()
	{
		driver.findElement(By.id("transfer")).click();
		 throw new cucumber.api.PendingException();
	}
	
	@Then("ensure that fund transfer is completed with \"([^\"]*)\" message")
	public void ensure_that_fund_transfer_is_completed_with_msg_message(String msg)
	{
		WebElement message=driver.findElement(By.id("message"));
		assertEquals(message.getText(),msg);
		driver.close();
		throw new cucumber.api.PendingException();
		
	}
	
	
	
	
	
}
