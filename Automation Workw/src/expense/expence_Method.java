package expense;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class expence_Method extends Base_page {
getterMethods xpaths = new getterMethods();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
getterMethodTextFile text = new getterMethodTextFile();
	public expence_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void createExpenseFromFeed(Integer times) throws InterruptedException {
		for (int i = 1 ; i <= times ; i++) {
		WebElement expenseFeedOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseFeedOption()));
		expenseFeedOption.click();
		creationOfExpense(i + text.getuserAmmount() , "2023-07-"+i ,i+text.getuserModuleDescription150());
	}
	} 
	public void createExpenseNavBarOption (String amount,String expenseDate,String expenseDescription) throws InterruptedException {
		driver.findElement(xpaths.getexpenseNavBarOption()).click();
		//Thread.sleep(5000);
		driver.findElement(xpaths.getexpenseCreateComposer()).click();
		//Thread.sleep(5000);
		creationOfExpense(amount , expenseDate ,expenseDescription);
	}
	
	public void creationOfExpense (String expenseAmount ,String expenseDate ,String expenseDescription) throws InterruptedException {
		WebElement expenseHeaderListClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseHeaderListClick()));
		expenseHeaderListClick.click();
		
		//driver.findElement(xpaths.getexpenseHeaderListClick()).click();
		WebElement expenseHeaderValue = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseHeaderListClick()));
		expenseHeaderValue.sendKeys("Entertainment");
		
		WebElement expenseHeaderValueClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseHeaderListEntertainment()));
		expenseHeaderValueClick.click();
		
		
		WebElement expenseAmountField = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseHeaderListEntertainment()));
		expenseAmountField.sendKeys(expenseAmount);
		
		
		
//		driver.findElement(xpaths.getexpenseDateBox()).click();
//		//Thread.sleep(3000);
//		driver.findElement(xpaths.getexpenseDateBox()).sendKeys(expenseDate);
		
		WebElement expenseExecutor = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseExecutorfieldClick()));
		expenseExecutor.click();
		expenseExecutor.sendKeys(text.getmileTapMemberName1());
		WebElement expenseExecutorClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseExecutorNameClick()));
		expenseExecutorClick.click();
		
		driver.findElement(xpaths.getexpenseDescription()).click();
		//Thread.sleep(2000);
		WebElement expenseDescriptionValue = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseDescription()));
		expenseDescriptionValue.sendKeys(expenseDescription);
		
		WebElement expenseButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getexpenseCreateButton()));
		expenseButton.click();
		
		Thread.sleep(3000);
		
		
	}

}
