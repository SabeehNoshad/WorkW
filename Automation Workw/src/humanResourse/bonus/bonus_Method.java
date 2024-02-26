package humanResourse.bonus;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class bonus_Method extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();
	  getterMethods bonus = new getterMethods();
	public bonus_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void bonusClickAndComposer(Integer times,String company) throws InterruptedException {
		
		driver.findElement(bonus.getBonusNavBar()).click();
	//	Thread.sleep(5000);
		for (int i = 1 ; i <= times ; i++) {
		 WebElement bonusCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(bonus.getBonusCreateComposer()));
		 bonusCreateComposer.click();
		 bonus_Creation(company);
		}

		
		
	}
	public void bonus_Creation(String company) throws InterruptedException {
		 WebElement bonusSelectMemberField = wait.until(ExpectedConditions.visibilityOfElementLocated(bonus.getBonusSelectMember()));
		 bonusSelectMemberField.click();
		 if (company == "miletap") {
			 WebElement bonusSelectMember = wait.until(ExpectedConditions.visibilityOfElementLocated(bonus.getBonusSelectMember()));
			 bonusSelectMember.sendKeys(text.getmileTapMemberName1()); 
		 }
		 else {
			 WebElement bonusSelectMember = wait.until(ExpectedConditions.visibilityOfElementLocated(bonus.getBonusSelectMember()));
			 bonusSelectMember.sendKeys(text.getCompantMember1()); 
		 }
		
		
		 WebElement bonusSelectMemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(bonus.getBonusSelectionMember()));
		 bonusSelectMemberSelection.click();
		
		
		driver.findElement(bonus.getBonusAmount()).sendKeys(text.getuserAmmount());
		//Thread.sleep(2000);
		// default approver is being placed 
		//driver.findElement(bonus.getBonusApprover()).click();
		 WebElement bonusCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(bonus.getBonusCreateButton()));
		 bonusCreateButton.click();
		 Thread.sleep(2000);
		
	}
//	public void bonuspercentageCreation(String member_name,String bonusPercentage) throws InterruptedException {
//		getterMethods bonus = new getterMethods();
//		bonusClickAndComposer();
//		driver.findElement(bonus.getBonusSelectMember()).click();
//		driver.findElement(bonus.getBonusSelectMember()).sendKeys(member_name);
//		//Thread.sleep(3000);
//		driver.findElement(bonus.getBonusSelectionMember()).click();
//		//Thread.sleep(3000);
//		String type = driver.findElement(bonus.getbonusNetSalaryAmmount()).getText();
//		//Thread.sleep(3000);
//		
//		driver.findElement(bonus.getbonusPercentageRadioButton()).click();
//		
//		driver.findElement(bonus.getBonusAmount()).sendKeys(bonusPercentage);
//		//Thread.sleep(2000);
//		driver.findElement(bonus.getBonusCreateButton()).click();
//	    //Thread.sleep(3000);
//	}

}
