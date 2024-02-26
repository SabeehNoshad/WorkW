package humanResourse.loan;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class loan_Method extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  getterMethods loan = new getterMethods();
	  
	public loan_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void loanCreateComposer(Integer times) throws InterruptedException {
		driver.findElement(loan.getLoanNavBar()).click();
		for (int i = 1 ; i<= times; i++) {
			 WebElement loanCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(loan.getLoanCreateOption()));
			 loanCreateComposer.click();
			loanCreation("company", i);
		}
	}
	public void loanCreation(String options , Integer i ) throws InterruptedException {
		
		
		if (options == "company") {
			driver.findElement(loan.getLoanComposerCompanyLoan()).click();
		}
		else {
			driver.findElement(loan.getLoanComposerWorkwiseLoan()).click();
		}
        driver.findElement(loan.getLoanComposerAmount()).click();
        driver.findElement(loan.getLoanComposerAmount()).sendKeys(text.getuserAmmount());
        driver.findElement(loan.getLoanLoanTenure()).sendKeys(String.valueOf(text.getloanTenure()));
        //Thread.sleep(3000);
   
        driver.findElement(loan.getLoanPurpose()).click();
       // WebElement loanPurpose  = wait.until(ExpectedConditions.visibilityOfElementLocated(loan.getLoanPurpose()));
        // loanPurpose.click();
       
        WebElement loanPurposeVehical   = wait.until(ExpectedConditions.visibilityOfElementLocated(loan.getLoanComposerPurposeVehical()));
        loanPurposeVehical .click();
	  
	  
	    driver.findElement(loan.getLoanDescription()).sendKeys(i + text.getuserModuleDescription150());
	    
	    WebElement loanSubmitButton   = wait.until(ExpectedConditions.visibilityOfElementLocated(loan.getLoanCreateLoanButton()));
	    loanSubmitButton .click();
	   
	}
		// adding multiple approvers
	public void loanCreationMultipleApprovers(String options , Double loan_amount , Integer loan_tenure ,String loan_approver , String loan_description) throws InterruptedException {
		getterMethods loan = new getterMethods();
		driver.findElement(loan.getLoanNavBar()).click();
		//Thread.sleep(3000);
		driver.findElement(loan.getLoanCreateOption()).click();
		//Thread.sleep(2000);
		 if (options == "company") {
			driver.findElement(loan.getLoanComposerCompanyLoan()).click();
		}
		else {
			driver.findElement(loan.getLoanComposerWorkwiseLoan()).click();
		}
        driver.findElement(loan.getLoanComposerAmount()).click();
        driver.findElement(loan.getLoanComposerAmount()).sendKeys(String.valueOf(loan_amount));
        driver.findElement(loan.getLoanLoanTenure()).sendKeys(String.valueOf(loan_tenure));
       // Thread.sleep(3000);
       String deduction = driver.findElement(loan.getLoanDeductionPerMonth()).getText();
   
        
      
       
	    double actual_deduction = loan_amount / loan_tenure ;
	    System.out.println("expected "+ actual_deduction);
	    System.out.println("found "+ deduction);
	    driver.findElement(loan.getLoanPurpose()).click();
	    //Thread.sleep(3000);
	    driver.findElement(loan.getLoanComposerPurposeVehical()).click();
	    //Thread.sleep(7000);
	    driver.findElement(loan.getLoanComposerApprover()).click();
	    driver.findElement(loan.getLoanComposerApprover()).sendKeys(loan_approver);
	    //Thread.sleep(3000);
	    driver.findElement(loan.getLoanComposerSelectApprover()).click();
	    //Thread.sleep(2000);
	    driver.findElement(loan.getLoanDescription()).sendKeys(loan_description);
	    driver.findElement(loan.getLoanCreateLoanButton()).click();
	    //Thread.sleep(3000);
	}
}
