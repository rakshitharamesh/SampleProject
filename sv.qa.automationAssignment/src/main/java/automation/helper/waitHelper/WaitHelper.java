package automation.helper.waitHelper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitHelper {

	private WebDriver driver;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This is ImplicitWait method
	 * 
	 * @param long timeout
	 * @param TimeUnit unit
	 */
	public void setImplicitWait(long timeout, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(timeout, unit);
	}
}
