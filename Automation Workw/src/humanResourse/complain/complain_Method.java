package humanResourse.complain;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class complain_Method extends Base_page{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();
	  getterMethods xpaths = new getterMethods();
	public complain_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void complainCreate(Integer times,String company) throws InterruptedException {
		driver.findElement(xpaths.getComplainNavBar()).click();
		for (int i = 1 ; i <= times ; i++) {
		 WebElement complainCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainCreateComposer()));
		 complainCreateComposer.click();
		 complainCreation(company); 
		}
	}
	public void complainCreation(String company) throws InterruptedException {
		
		driver.findElement(xpaths.getComplainCategory()).click();
//		 WebElement complainCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainCategory()));
//		 complainCategory.click();
		
	    // late coming category 
		 WebElement complainCategoryLateComing = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainLateComingCata()));
		 complainCategoryLateComing.click();
		
		 
		driver.findElement(xpaths.getComplainSelectMember()).click();
		//Thread.sleep(1000);
		if (company == "miletap") {
			 WebElement complainOfMember = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainSelectMember()));
			 complainOfMember.sendKeys(text.getmileTapMemberName1());
			
		}
		else {
			 WebElement complainOfMember = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainSelectMember()));
			 complainOfMember.sendKeys(text.getCompantMember1());
			
		}
		
		 WebElement complainOfMemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainOffMemberSelection()));
		 complainOfMemberSelection.click();
		
		 WebElement complainDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getComplainDescription()));
		 complainDescription.click();

		driver.findElement(xpaths.getComplainDescription()).sendKeys(text.getuserModuleDescription500());
		//Thread.sleep(2000);
		 WebElement complainSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCreateComplainSubmit()));
		 complainSubmittButton.click();
		 Thread.sleep(2000);


	}

}
