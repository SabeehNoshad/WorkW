 package humanResourse.promotion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class promotion_Method extends Base_page {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
		getterMethods promo = new getterMethods();
		
		
	public promotion_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void createPromoComposer (Integer times,String company) throws InterruptedException {
		driver.findElement(promo.getPromotionNavBar()).click();
		for (int j=1 ; j <= times ; j++) {
		 WebElement promotionCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionCreateComposerOption()));
		 promotionCreateComposer.click();
		 createPromotion(j,company);
		}
	}
	public void createPromotion(Integer i,String company) throws InterruptedException {
		if (company == "miletap") {
			 WebElement promotionTo = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionSelectPromotionTo()));
			 promotionTo.sendKeys(text.getmileTapMemberName1());
		}
		else {
			 WebElement promotionTo = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionSelectPromotionTo()));
			 promotionTo.sendKeys(text.getCompantMember1());
		}
		
		
		
		 WebElement promotionMemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionToMemberSelectClick()));
		 promotionMemberSelection.click();
		
		 Thread.sleep(3000);
		 WebElement promotionCurrentGradeSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionCurrentGradeText()));
		 String currentGrade =  promotionCurrentGradeSelection.getText();
//		 System.out.print("your abcd fegh" + currentGrade);
//		String currentGrade = driver.findElement(promo.getPromotionCurrentGradeText()).getText();
//		Thread.sleep(3000);
		 System.out.println(currentGrade);
		String currentGradeNew = currentGrade.trim();
		Thread.sleep(3000);
    	System.out.print(currentGrade);
		driver.findElement(promo.getPromotionNewGradeList()).click();
//		 WebElement promotionMemberGradelist  = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionNewGradeList()));
//		 promotionMemberGradelist.click(); 
		//Thread.sleep(3000);
		if (" Office Assistant".equals(currentGradeNew)) {
		    driver.findElement(promo.getPromotionGradeManager()).click();
		} else if (" Manager".trim().equals(currentGradeNew)) {
		    driver.findElement(promo.getPromotionGradeDirector()).click();
		} else if (" Director".trim().equals(currentGradeNew)) {
		    driver.findElement(promo.getPromotionGradeCoo()).click();
		} else if (" COO".equals(currentGradeNew)) {
		    driver.findElement(promo.getPromotionGradeCeor()).click();
		} else if ("Assistant".equals(currentGradeNew)) {
		    driver.findElement(promo.getofficeAssistantfromAsst()).click();
		} else {
		    System.out.println("You cannot be promoted as you are " + " " + currentGrade);
		}
		driver.findElement(promo.getPromotionDescription()).sendKeys(i + text.getuserModuleDescription150());
		//Thread.sleep(5000);
		 WebElement promotionSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(promo.getPromotionCreateButton()));
		 promotionSubmittButton.click();
		Thread.sleep(3000);
	}
}

