package signin;
import Xpaths.getterMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Method extends Base_page {
		
	public Login_Method (WebDriver driver) {
		super(driver);
	}

	 public void sign_in(String username,String password) throws InterruptedException {
		
		 getterMethods xpaths = new getterMethods();
	 
	     driver.findElement(xpaths.getUsernamefield()).sendKeys(username);
		 driver.findElement(xpaths.getPasswordField()).sendKeys(password);
		 driver.findElement(xpaths.getLoginButton()).click();
	 }	
		 
	 }
