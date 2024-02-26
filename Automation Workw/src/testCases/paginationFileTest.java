//package testCases;
//
//import org.testng.annotations.Test;
//
//import expense.expence_Method;
//import humanResourse.bonus.bonus_Method;
//import humanResourse.leaves.leaves_Method;
//import humanResourse.loan.loan_Method;
//import humanResourse.reward.reward_Method;
//import humanResourse.warnings.warning_Method;
//import newsFeed.newsFeedMethod;
//import quickAdd.quick_Method;
//import signin.Login_Method;
//import signin.TestBase;
//import travel.travelMethod;
//import user.urls.testArguments.getterMethodTextFile;
//import user.urls.testArguments.getterMethod_Defaults;
//
//public class paginationFileTest extends TestBase {
//	// add multiple employee for pagination check 
//	//while for quick add employee the quick add composer can append only 10 users 
//	Integer times= 5;
//	Integer tagAmmount = 6;
//	@Test (priority = 1)
//	public void quickAddEmployee() throws InterruptedException {
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
////		Thread.sleep(2000);
//		Login_Method login = new Login_Method(driver);
//		//login.sign_in(defaults.getrmployeeEmail(),defaults.getemployeepassword());
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//	//	Thread.sleep(7000);
//		quick_Method quick =new quick_Method(driver);
//		quick.Add_employee(times);
//		tearDown();
//	} 
//	// create multiple feeds for pagination check 
//	@Test (priority = 2)
//	public void newsFeedCreateTest() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		
//		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
//		Login_Method login = new Login_Method(driver);
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//		//login.sign_in(defaults.getadminEmail(), defaults.getadminpassword());
//		Thread.sleep(7000);
//		newsFeedMethod news = new newsFeedMethod(driver);
//		news.createPost(times,tagAmmount);
//		tearDown();
//	}
//	// creating multiple expense for pagination check 
//	@Test (priority = 3)
//	public void expenseCreateTest() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
//		//Thread.sleep(2000);
//		Login_Method login = new Login_Method(driver);
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//
//		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//		//Thread.sleep(7000);
//		expence_Method expense = new expence_Method(driver);
//		getterMethodTextFile text = new getterMethodTextFile();
//		expense.createExpenseFromFeed(times);
//		tearDown();
//	}
//	
//	// creating multiple bonus for pagination check 
//	@Test (priority = 4)
//	public void BonusCreation() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
//		//Thread.sleep(3000);
//		
//		Login_Method login = new Login_Method(driver);
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//		//Thread.sleep(5000);
//		bonus_Method bonusmethod = new bonus_Method(driver);
//		getterMethodTextFile text = new getterMethodTextFile();
//		//String result = text.getemployeeFirstName().concat(" ").concat(text.getemployeeLastName());
//		bonusmethod.bonusClickAndComposer(times);
//		//Thread.sleep(5000);
//		tearDown();
//	}
//	
//	// creating multiple leaves 
//	@Test (priority = 5)
//	public void LeaveCreation() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
//		//Thread.sleep(5000);
//		Login_Method login = new Login_Method(driver);
//		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//		//Thread.sleep(5000);
//		leaves_Method leavemeth = new leaves_Method(driver);
//		leavemeth.leaveCreate(times);
//		tearDown();
//}
//	@Test (priority = 6)
//	// creating loan for multiple pagination 
//	public void loanCreate() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
//		//Thread.sleep(5000);
//		Login_Method login = new Login_Method(driver);
//		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//		//Thread.sleep(7000);
//		loan_Method loanmeth = new loan_Method(driver);
//	
//		loanmeth.loanCreateComposer(times);
//		//Thread.sleep(5000);
//		tearDown();
//	}
//	@Test (priority = 7) 
//	public void createWarning() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
//	//	Thread.sleep(5000);
//		Login_Method login = new Login_Method(driver);
//		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//	//	Thread.sleep(5000);
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//		warning_Method warmeth = new warning_Method(driver);
//		warmeth.warning(times);
//	//	Thread.sleep(5000);
//		tearDown();		
//	}
//	@Test (priority = 8 )
//	public void createRewardTest() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
//		//Thread.sleep(5000);
//		Login_Method login = new Login_Method(driver);
//		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//		//Thread.sleep(7000);
//		reward_Method reward = new reward_Method(driver);
//		
//		reward.rewardComposer(times);
//		//Thread.sleep(5000);
//		tearDown();
//				}
//	@Test (priority = 9)
//	public void travelCreateTest() throws InterruptedException {
//		setUp();
//		getterMethod_Defaults defaults = new getterMethod_Defaults();
//		driver.get(defaults.getwebUrl());
////		Thread.sleep(2000);
//		Login_Method login = new Login_Method(driver);
//	//login.sign_in(defaults.getrmployeeEmail(),defaults.getemployeepassword());
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
//	//	Thread.sleep(7000);
//		travelMethod trav =new travelMethod(driver);
//		trav.createComposer(times);
//		tearDown();
//	} 
//
//}
