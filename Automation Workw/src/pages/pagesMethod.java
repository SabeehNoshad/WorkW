package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class pagesMethod extends Base_page{
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text= new getterMethodTextFile();

	public pagesMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//----------------------------- main routing method ------------------------------------------------------
	public void pageRoute (Integer times) throws InterruptedException {
		 WebElement PagesNavBarClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesnewsFeedOpt()));
		 PagesNavBarClick.click();
		 WebElement PagesCreateButtonClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesCreateButton()));
		 PagesCreateButtonClick.click(); 
		 CreateButtonClickForm(times);
		 Thread.sleep(2000);
		 WebElement PagesCreatedPageClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesoptennewlyCreatedPages()));
		 PagesCreatedPageClick.click(); 
		 Thread.sleep(5000);
	}
	public void CreateButtonClickForm(Integer times) throws InterruptedException {
		 WebElement PagesName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesName()));
		 PagesName.sendKeys(text.getCompantMember1());; 
		 driver.findElement(xpaths.getpagesCategoryClick()).click();
//		 WebElement PagesCategoryClick1 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesCategoryClick()));
//		 PagesCategoryClick1.click(); 
		 Thread.sleep(1000);
		 driver.findElement(xpaths.getpagesCategorySelect()).click();
//		 WebElement PagesCategorySelect = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesCategorySelect()));
//		 PagesCategorySelect.click(); 
		 Thread.sleep(1000);
		 for (int i = 1 ; i <= times; i++) {
			 WebElement tags = driver.findElement(xpaths.getpagestags());
			 tags.click();
//			 tags.click();
			 Thread.sleep(3000);
			 WebElement pagesTagsText = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesTagsText()));
			 pagesTagsText.sendKeys("tags"+i);
			
			// Thread.sleep(1000);
			 pagesTagsText.sendKeys(Keys.ENTER);
 
		 }
		 WebElement PagesDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getPagesDEscription()));
		 PagesDescription.sendKeys(  times + text.getuserModuleDescription500()); 
		 WebElement PagesSubmittButtonClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpagesSubmittButton()));
		 PagesSubmittButtonClick.click(); 
		 Thread.sleep(3000);
	
		}

}
