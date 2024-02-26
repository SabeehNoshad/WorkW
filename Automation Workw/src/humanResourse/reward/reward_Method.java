package humanResourse.reward;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class reward_Method extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  getterMethods reward = new getterMethods();
	public reward_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void rewardComposer(Integer times,String company) throws InterruptedException {
		driver.findElement(reward.getRewardNavBaroption()).click();
		
		for (int i = 1 ; i <= times ; i ++) {
		 WebElement rewardComposerCreate = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getCreateRewardsOption()));
		 rewardComposerCreate.click();
		createRewards(i,company);
		}
	}
	
	public void createRewards(Integer i,String company) throws InterruptedException {
		
	//	Thread.sleep(2000);
	//	Thread.sleep(2000);
		driver.findElement(reward.getRewardCategory()).click();
//		 WebElement rewardCategoryField = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getRewardCategory()));
//		 rewardCategoryField.click();
		
		
		
		// driver.findElement(reward.getRewardCategory()).click();
		
		 WebElement rewardSelectionOfCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getGoingExtraMile()));
		 rewardSelectionOfCategory.click();
		
		 WebElement rewardName = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getRewardName()));
		 rewardName.click();
		 rewardName.sendKeys(i + text.getuserFirstName());
		
		 WebElement rewardReason = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getReasonForReward()));
		 rewardReason.click();
		 rewardReason.sendKeys(text.getreaconCharacterLimit());
		driver.findElement(reward.getRewardsSelectMember()).click();
		if (company == "miletap") {
		driver.findElement(reward.getRewardsSelectMember()).sendKeys(text.getuserselectmember());
	//	Thread.sleep(2000);
		}
		else {
			 WebElement rewardMemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getRewardsSelectMember()));
			 rewardMemberSelection.sendKeys(text.getComoanyMemberSelect());
		}
			
		 WebElement rewardSelectionMemeber = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getRewardMemberSelectionClick()));
		 rewardSelectionMemeber.click();
		driver.findElement(reward.getrewardsDescription()).sendKeys(i + text.getuserModuleDescription150());
	//	Thread.sleep(5000);
		WebElement rewardSumbitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(reward.getCreateRewardButton()));
		rewardSumbitButton.click();
		
		Thread.sleep(20000);
		
		
	}
}
