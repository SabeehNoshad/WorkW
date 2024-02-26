package form;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class formMethod extends Base_page {
	getterMethods xpaths = new getterMethods();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	getterMethodTextFile text = new getterMethodTextFile();
	Actions actions = new Actions(driver);
	public formMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void formRun(Integer times) throws InterruptedException {
		NavbarCreatebutton();
		for (int i = 0 ; i <= times ; i ++) {
		formRouteTextAnswer();
		formRouteNumberAnswer();
		formRoutepollAnswer();
		}
		
	}
	public void NavbarCreatebutton() {
		WebElement formNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformNavBar()));
		formNavBar.click();
		
	}
	public void formRouteTextAnswer() throws InterruptedException {
		WebElement formCreateForm = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformCreateForm()));
		formCreateForm.click();
		createComposer();
		WebElement formAnswer= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswer.click();
		textAnswer();
		addQuestion();
		submittButton();
		
	}
	public void formRouteNumberAnswer() throws InterruptedException {
		WebElement formCreateForm = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformCreateForm()));
		formCreateForm.click();
		createComposer();
		WebElement formAnswer= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswer.click();
		numberAnswer();
		addQuestion();
		submittButton();
		
	}
	public void formRoutepollAnswer() throws InterruptedException {
		WebElement formCreateForm = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformCreateForm()));
		formCreateForm.click();
		createComposer();
		WebElement formAnswer= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswer.click();
		pollAnswer();
		addQuestion();
		submittButton();
		
	}
	public void createComposer() throws InterruptedException {
		WebElement formTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformTItle()));
		formTitle.sendKeys(text.getuserFirstName()+ text.getuserLastName());
		WebElement formDescription= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformDescription()));
		formDescription.sendKeys(text.getuserModuleDescription500());
		WebElement formQuestion= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getforQuestion()));
		formQuestion.sendKeys(text.getformquest1());
		
		
		
		}
	public void textAnswer() throws InterruptedException {
		//text
	//	driver.findElement(xpaths.getformAnswerOption()).click();
		WebElement formAnswer= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswer.click();
		Thread.sleep(5000);
	//formAnswer.click();
		//driver.findElement(xpaths.getformAnswerOption()).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(xpaths.getformAnswerOption()).sendKeys(Keys.ENTER);

	//driver.findElement(xpaths.getformAnswerOption()).sendKeys(Keys.ENTER);
		  
	        //actions.sendKeys(Keys.ENTER).perform();
	
	}
	public void numberAnswer() throws InterruptedException {
		//Number
		WebElement formAnswer= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswer.click();
		Thread.sleep(2000);
		formAnswer.click();
		WebElement formAnswerText= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswerText.sendKeys(Keys.ARROW_DOWN);
		WebElement formAnswerNumberSelectio= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswerNumberSelectio.sendKeys(Keys.ENTER);
		
	}
	public void pollAnswer() throws InterruptedException {
		//poll
		WebElement formAnswer= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswer.click();
		Thread.sleep(2000);
		formAnswer.click();
		WebElement formAnswerText= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswerText.sendKeys(Keys.ARROW_DOWN);
		WebElement formAnswerPoll= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswerPoll.sendKeys(Keys.ARROW_DOWN);
		WebElement formAnswerNumberSelectio= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAnswerOption()));
		formAnswerNumberSelectio.sendKeys(Keys.ENTER);
		//poll question
		WebElement formPollOption= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformPollOption1()));
		formPollOption.click();
		//poll question
		WebElement formPollOptionAns1= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAddOptionQuest()));
		formPollOptionAns1.sendKeys(text.getuserFirstName());
		// poll option 2 
		WebElement formPollOption1= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAddPollOptionAgain()));
		formPollOption1.click();
		// poll option 2 question
		WebElement formPollans2= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAddPollOption2()));
		formPollans2.sendKeys(text.getuserLastName());
	}
	public void addQuestion () throws InterruptedException {
	// add question to the form 
		Thread.sleep(5000);
		driver.findElement(xpaths.getformAddQuest()).click();
//		WebElement formAddQuestion= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformAddQuest()));
//		formAddQuestion.click();
		
		
	}
	public void submittButton() throws InterruptedException {
		
	
		// submit button
		Thread.sleep(5000);
		WebElement formSubmittButton= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getformSubmittButton()));
		formSubmittButton.click();
		Thread.sleep(2000);
		
	}
	
}
