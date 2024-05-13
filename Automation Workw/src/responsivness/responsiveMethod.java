package responsivness;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import signin.Base_page;

public class responsiveMethod extends Base_page{

	public responsiveMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	   public static void testViewportSize(WebDriver driver, int width, int height) {
	        // Set browser window size
	        driver.manage().window().setSize(new Dimension(width, height));
	       

	        // Perform layout verification tests here
	        // For example, you can check the visibility and position of elements using WebDriver methods like findElement, isDisplayed, getLocation, etc.
	        // Example:
	        // WebElement element = driver.findElement(By.id("someElementId"));
	        // System.out.println("Element is displayed: " + element.isDisplayed());
	    }

}
