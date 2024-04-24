package Xpaths;

import org.openqa.selenium.By;

public class Xpaths {
	
	//  login main page routes 
	By usernamefield 						 = By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/form/div[3]/div/div/div/div/div/div/div/span/input");
	By passwordField 						 = By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/form/div[3]/div/div[2]/div/div/div/div/div/span/input");
	By loginButton 							 = By.xpath("//div[@id='root']/div/div/div[2]/div[2]/div/form/div[4]/button");
	//  Quick add page routes
	By quick_add_opt 						 = By.xpath("//div[@id='section1']/div/div[2]/div[2]/div/img[7]");
	By First_Name_field						 = By.xpath("//form[@id='quickAdd']/div/div/div/div[2]/div/div/input");
	By Last_Name_Field						 = By.xpath("//form[@id='quickAdd']/div/div[2]/div/div[2]/div/div/input");
	By Email_field 							 = By.xpath("//form[@id='quickAdd']/div/div[3]/div/div[2]/div/div/input");
	By Designation_field			     	= By.xpath("//form[@id='quickAdd']/div/div[4]/div/div[2]/div/div/div/div/span/input");
	By Designation_value_field   		 	 = By.xpath("//form[@id='quickAdd']/div/div[4]/div/div[2]/div/div/div/div/span/input");
	By Designation_select_value_field= By.xpath("//form[@id='quickAdd']/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div");
	By Phone_Number_field 			 = By.xpath("//form[@id='quickAdd']/div/div[5]/div/div[2]/div/div/input");
	By add_Button					 = By.xpath("//form[@id='quickAdd']/div[2]/div/div/div/div/div/button");
	By Submitt_Button 				 = By.xpath("//span[contains(.,'Submit')]");
    
	//  Lead manager
	By Lead_Manager_opt 				 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[5]/a/p");
	By Create_lead_group_option			 = By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
	By Name_Field						 = By.xpath("//input[@id='lead manager form_name']");
	By Lead_Description_field 			 = By.xpath("//textarea[@id='lead manager form_description']");
	By Select_member_field				 = By.xpath("//form[@id='lead manager form']/div[3]/div/div[2]/div/div/div/input");
	By Select_member_opt_click      	 = By.xpath("//form[@id='lead manager form']/div[3]/div/div[2]/div/div/div/input");
	By Privacy_field   	 				 = By.cssSelector(".ant-dropdown-trigger path");
	By Public_opt				         = By.xpath("//span[contains(.,'Public')]");
	By Private_opt				 		 = By.xpath("//span[contains(.,'Private')]");
	By Create_button_field				 = By.xpath("//form[@id='lead manager form']/div[4]/div/div/div/div/div/button[2]");
	By Group_option 			 		 = By.xpath("//div[@id='section1']/div/div[2]/div/div[2]/button[3]/span");
	By All_leads_option					 = By.xpath("//div[@id='section1']/div/div[2]/div/div[2]/button[2]/span");
	By leadTabGroup						 = By.xpath("//div[@id='section1']/div/div[2]/div/div[2]/button[3]/span");
	By leadGroupBackButton				 = By.cssSelector(".anticon-left > svg");
	By leadManagerlead					 = By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]");
	By LeadManagerConvertButton			 = By.xpath("//form[@id='basic']/div[4]/div[2]/div/button/span");
	By LeadManagerGoToProject			 = By.xpath("//form[@id='basic']/div[4]/div[2]/div/button/span");
	
	// lead section
	By Create_section_opt				 = By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div/div/div/button");
	By Lead_name 						 = By.xpath("//form[@id='basic']/div/div/div/div/div[2]/div/div/span/input");
	By Lead_address 					 = By.xpath("//form[@id='basic']/div/div[2]/div/div/div[2]/div/div/span/input");
	By Lead_phone_number 				 = By.xpath("//form[@id='basic']/div[2]/div[2]/div/div/div[2]/div/div/span/input");
	By Lead_status			 		     = By.xpath("//form[@id='basic']/div[5]/div[2]/div/div[2]/div/div/div/div/span[2]/span");
	By Lead_introduction_complete	     = By.xpath("//div[2]/div/div/div/div[3]/div/span");
	By Lead_unknown				 		 = By.xpath("//div[@id='basic_interestStatus']/label/span[2]");
	By Lead_interested 			 	     = By.xpath("//div[@id='basic_interestStatus']/label[2]/span[2]");
	By Lead_not_interested			     = By.xpath("//div[@id='basic_interestStatus']/label[3]/span[2]");
	By Lead_potential					 = By.xpath("//div[6]/div/div/div/div[2]/div/div/div/div/div/span");
	By Lead_contact_established
	
	= By.xpath("//div[6]/div/div/div/div[2]/div/div/div/div[2]/div/span");
	
	By Lead_contract_send				 = By.xpath("//div[2]/div/div/div/div[4]/div/span");
	By Lead_complete					 = By.xpath("//div[2]/div/div/div/div[5]/div/span");
	By Lead_add_button					 = By.cssSelector(".ant-btn-primary > span");
	By leadSubmitButtonMoreThanOnce		 = By.cssSelector(".ant-btn-primary > span:nth-child(2)");
//	By leadStatusClick  				 = By.xpath("//form[@id='basic']/div[5]/div[2]/div/div[2]/div/div/div/div/span[2]");
	// misc lead groups for testing 
	By leadgroup_dummy       			 = By.xpath("//div[@id='section1']/div/div[3]/div/div/div/img");
	// employee module 
	By Employee_nav_bar_Opt				 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div/a");
	By Employee_search_bar               = By.xpath("//div[@id='section1']/div/div[2]/div/div/div/div/span/input");
	By Employee_search_listing			 = By.xpath("//div[@id='section1']/div/div[2]/div/div[2]/div/div");
	
	// bonus module 
    By Bonus_nav_Bar					 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[6]/a/p");
    By Bonus_create_Composer             = By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By Bonus_select_Member				 = By.xpath("//form[@id='addBonus']/div/div/div/div/div/div/input");
    By Bonus_member_selection_click  	 = By.xpath("//form[@id='addBonus']/div/div/div/div/div/div[2]/span/div");
    By Bonus_ammount					 = By.xpath("//input[@id='addBonus_amount']");
    By Bonus_approver   				 = By.xpath("//form[@id='addBonus']/div[4]/div/div[2]/div/div/div/input");
    By Bonus_search						 = By.xpath("//div[@id='section1']/div/div[2]/div/div/span/input");
    By Bonus_Create_Button				 = By.xpath("//form[@id='addBonus']/div[5]/div/div/div/div/button");
    
    // complain module 
    By complain_nav_Bar					 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[8]/a/p");
    By complain_create_Composer          = By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By complain_category				 = By.xpath("//form[@id='addComplain']/div/div/div[2]/div/div/div/div/span/input");
    By complain_select_Member			 = By.xpath("//form[@id='addComplain']/div[2]/div/div[2]/div/div/div/input");
    By complain_select_approval			 = By.xpath("//form[@id='addComplain']/div[3]/div/div[2]/div/div/div/input");
    By complain_description   			 = By.xpath("//textarea[@id='addComplain_description']");
    By create_complain_submit			 = By.xpath("//form[@id='addComplain']/div[5]/div/div/div/div/button/span");
    By complain_late_coming_cata         = By.xpath("//form[@id='addComplain']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[5]/div");
    By compain_select_member_from_list   = By.xpath("//form[@id='addComplain']/div[2]/div/div[2]/div/div/div[2]/span/div/div/p");
   
    // leaves module 
    By leaves_nav_bad   				 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[11]/a/p");
    By leaves_create_option   		     = By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By leaves_leave_type_click   		 = By.xpath("//form[@id='addLeave']/div/div/div[2]/div/div/div/div/span/input");
    By leaves_leave_type_annual   		 = By.xpath("//form[@id='addLeave']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div");
    By leaves_leave_type_casual   		 = By.xpath("//form[@id='addLeave']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div");
    By leaves_leave_type_other   		 = By.xpath("//form[@id='addLeave']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div");
    By leaves_leave_type_sick   		 = By.xpath("//form[@id='addLeave']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div");
    By leaves_leave_type_temp   		 = By.xpath("=//form[@id='addLeave']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[5]/div");
    By leaves_leave_type_unpaid   		 = By.xpath("//form[@id='addLeave']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[6]/div");
    By leaves_leave_leave_for   		 = By.xpath("//form[@id='addLeave']/div[3]/div/div/label/span/span/label/span/input");
    By leaves_approval   				 = By.xpath("//form[@id='addLeave']/div[4]/div/div[2]/div/div/div/input");
    By leaves_description   			 = By.xpath("//form[@id='addLeave']/div[5]/div/div[2]/div/div/div/textarea");
    By leaves_start_date   				 = By.xpath("//form[@id='addLeave']/div[6]/div/div/div[2]/div/div/div/div/input");
    By leaves_end_date   				 = By.xpath("//form[@id='addLeave']/div[6]/div/div/div[2]/div/div/div/div[3]/input");
    By leaves_create_button   			 = By.xpath("//form[@id='addLeave']/div[8]/div/div/div/div/button");
    By leaves_count    					 = By.xpath("//form[@id='addLeave']/div[6]/div[2]");
    // loan module
    By Loan_nav_bar						 	 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[15]/a");
    By Loan_create_option					 = By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By Loan_composer_company_loan			 = By.xpath("//form[@id='createLoans']/div/div/div/div/div/div/label/span[2]");
    By Loan_composer_workwise_loan			 = By.xpath("//form[@id='createLoans']/div/div/div/div/div/div/label[2]/span/input");
    By Loan_composer_amount				 	 = By.xpath("//form[@id='createLoans']/div[2]/div/div[2]/div/div/input");
    By Loan_loan_tenure						 = By.xpath("//input[@id='createLoans_loanTenure']");
    By Loan_deduction_permonth				 = By.xpath("//div[@id='createLoans_deductionPerMonth']/input");
    By Loan_purpose							 = By.cssSelector("#createLoans_purposeId");
    By Loan_description						 = By.xpath("//textarea[@id='createLoans_description']");
    By Loan_create_loan_button				 = By.xpath("//form[@id='createLoans']/div[8]/div/div/div/div/button");
    By Loan_create_loan_purpose_vehicle  	 = By.xpath("//div[2]/div/div/div/div[3]/div");
    By Loan_composer_approver			 	 = By.xpath("//form[@id='createLoans']/div[6]/div/div[2]/div/div/div/input");
    By Loan_approver_select				 	 = By.xpath("//form[@id='createLoans']/div[6]/div/div[2]/div/div/div[2]/span/div");
    // promotion module 
    By Promotion_nav_bar 					= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[4]/a/p");
    By Promotion_create_composer_option 	= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By Promotion_select_promotion_to    	= By.xpath("//form[@id='addPromotion']/div/div/div[2]/div/div/div/input");
    By Promotion_current_grade_text 		= By.cssSelector(".mr-2");
    By Promotion_new_grade_list 			= By.cssSelector("#addPromotion_gradeId");
    By Promotion_description				= By.xpath("//textarea[@id='addPromotion_description']");
    By Promotion_create_button				= By.xpath("//form[@id='addPromotion']/div[6]/div/div/div/div/button");
    By Promotion_to_member_name_click		= By.xpath("//form[@id='addPromotion']/div/div/div[2]/div/div/div[2]/span/div");
    //grade list 
    By Promotion_mid_level					= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[7]/div");
    By Promotion_manager					= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[6]/div");
    By Promotion_junior						= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[5]/div");
    By Promotion_director					= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div");
    By Promotion_Coo						= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div");
    By Promotion_Ceo						= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div");
    By Promotion_assistant					= By.xpath("//form[@id='addPromotion']/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div");
    By Promotion_office_asst				= By.cssSelector(".ant-select-item-option-active > .ant-select-item-option-content");
    // reward module 
    By Reward_nav_bar						= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[9]/a/p");
    By Reward_create_rewards_option			= By.xpath("//span[contains(.,'Create Reward')]");
    By Reward_reward_category				= By.xpath("//form[@id='addReward']/div/div/div[2]/div/div/div/div/span/input");
    By Reward_going_extra_mile				= By.xpath("//form[@id='addReward']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div");
    By Reward_otherss						= By.xpath("//form[@id='addReward']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div");
    By Reward_Reward_name					= By.cssSelector("#addReward_name");
    By Reward_Reason_for_reward				= By.cssSelector("#addReward_reason");
    By Reward_Select_member					= By.xpath("//form[@id='addReward']/div[4]/div/div[2]/div/div/div/input");
    By Reward_description					= By.xpath("//textarea[@id='addReward_description']");
    By Reward_create_reward_button			= By.xpath("//form[@id='addReward']/div[8]/div/div/div/div/button");
    By Reward_member_selection_click		= By.xpath("//form[@id='addReward']/div[4]/div/div[2]/div/div/div[2]/span/div");
    // warning module  
    By warning_nav_bar						= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[5]/a/p");
    By warning_create_warning_option		= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By warning_warning_category				= By.xpath("//form[@id='addWarning']/div/div/div[2]/div/div/div/div/span/input");
    By warning_category_attendence			= By.xpath("//form[@id='addWarning']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div");
    By warning_Reward_behaviour				= By.xpath("//form[@id='addWarning']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div");
    By warning_category_performance			= By.xpath("//form[@id='addWarning']/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div");
    By warning_watning_to_Select_member		= By.xpath("//form[@id='addWarning']/div[2]/div/div[2]/div/div/div/input");
    By warning_description					= By.xpath("//textarea[@id='addWarning_description']");
    By warning_create_warning_button		= By.xpath("//form[@id='addWarning']/div[5]/div/div/div/div/button/span");
    By warning_member_selection_click		= By.xpath("//form[@id='addWarning']/div[2]/div/div[2]/div/div/div[2]/span/div");
    // employee
    By employee_update_button				= By.xpath("//div[@id='section1']/div/div[2]/div/div[2]/div/div/div[2]/button[2]");
    By employee_designation_box 			= By.xpath("//form[@id='basicInfo']/div[9]/div/div[2]/div/div/div");
    By employee_manager_name				= By.xpath("//form[@id='basicInfo']/div[10]/div/div[2]/div/div/div/input");
    By employee_country_name				= By.xpath("//form[@id='basicInfo']/div[12]/div/div[2]/div/div/div/div/span[2]");
    By employee_city_name			 		= By.xpath("//form[@id='basicInfo']/div[13]/div/div[2]/div/div/div/div/span[2]");
    By employee_access_role				 	= By.xpath("//form[@id='basicInfo']/div[23]/div/div[2]/div/div/div/div/div");
    // salary	
    By salary_nav_bar						= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[14]/a/p");
    By salary_nav_bar_for_konect			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[13]/a/p");
    By salary_create_salary 				= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By salary_employee_name					= By.xpath("//form[@id='addSalary']/div/div/div/table/tbody/tr/td[3]/div/div/div/div/div/div/div/input");
    By salary_emp_selected					= By.xpath("//form[@id='addSalary']/div/div/div/table/tbody/tr/td[3]/div/div/div/div/div/div/div[2]/span/div");
    By salary_grade							= By.xpath("//form[@id='addSalary']/div/div/div/table/tbody/tr/td[4]/input");
    By salary_basic_salary			 		= By.xpath("//input[@name='basicSalary']");
    By salary_create_button				 	= By.xpath("//form[@id='addSalary']/div/div[2]/div/div/div/div/div/button/span");
    By salary_description			 		= By.xpath("//textarea[@id='addSalary_description']");
    By salary_for_approval					= By.xpath("//div[@id='section1']/div/div[2]/div/div[2]/button[2]/span");
    By salary_approval_lisitng				= By.xpath("//div[3]/div/div/div[3]/div/div/div/div");
    By salary_approvers_composer			= By.xpath("//div[2]/div/div[2]/div/div/span/div");
    By salary_approvers_approve				= By.xpath("//div[2]/ul/div[2]");
    By salary_approver_ok_button			= By.cssSelector(".ant-btn-primary > span");
    By salaryemplyeename2					= By.xpath("//form[@id='addSalary']/div/div/div/table/tbody/tr[2]/td[3]/div/div/div/div/div/div/div/input");
    By salaryemployeename3					= By.xpath("//form[@id='addSalary']/div/div/div/table/tbody/tr[3]/td[3]/div/div/div/div/div/div/div/input");
    By bonus_net_salary_ammount				= By.xpath("//form[@id='addBonus']/div[2]/div/div/div/div[2]/div/div/p");
    By bonus_percentage						= By.xpath("//input[@value='2']");
    By salaryApproverMessageBox				= By.xpath("//div[7]/div/div/div/div[2]/div/div/div");
    
    // Clock In Clock Out
    By clockInOpt							= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/div[2]/img");
    By clockInButton						= By.xpath("//div[2]/div/div[2]/div/div[2]/img");
    By clockInMessage						= By.cssSelector(".ant-popover-message-title");
    By clockInyes							= By.xpath("//div[2]/button[2]/span");
    By clockInYes							= By.xpath("//div[2]/button[2]/span");
    By clockInputMessage					= By.xpath("//div[2]/input");
    
    
    // newsFeed 
    
    By newsFeedCreateComposer				= By.xpath("//div[@id='section1']/div/div[2]/div/div/div/div/div[2]");
    By newsFeedTextArea						= By.xpath("//textarea");
    By newsFeedClickMember					= By.xpath("(//input[@value=''])[3]");
    By newsFeedSelectMember					= By.xpath("//div[2]/div[2]/div/div/div/div/div[2]/span/div");
    By newsFeedCreateButton					= By.xpath("//div[4]/button[2]");
    By newsfeedComposerMember				= By.xpath("//li/div/div/div[2]");
    By newsfeedImportantTag					= By.cssSelector(".importantButton");
    // expense
    By expenseNewsfeedOpt					= By.xpath("//div[@id='section1']/div/div[2]/div[2]/div/img[6]");
    By expenseNavBarOpt						= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[13]/a");
    By expenseHeadListClick					= By.xpath("//input[@id='addExpense_headerId']");
    By expenseHeaderListEnterOpt			= By.cssSelector(".ant-select-item-option-content");
    By expenseAmountField					= By.cssSelector(".ant-input:nth-child(2)");
    By expenseDescription					= By.xpath("//textarea[@id='addExpense_description']");
    By expenseCreateButton					= By.xpath("//form[@id='addExpense']/div[10]/div/div/div/div/button");
    By expenseCreateComposer				= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By expenseExecutorfieldClick			= By.xpath("//form[@id='addExpense']/div[6]/div/div[2]/div/div/div/input");   
    By expenseExecutorNameClick				= By.xpath("//form[@id='addExpense']/div[6]/div/div[2]/div/div/div[2]/span/div");
    By expenseDateBox						= By.xpath("//form[@id='addExpense']/div[4]/div[2]/div/div[2]/div/div/div/div");
    // task 
    By taskFeedOption					= By.xpath("//div[@id='section1']/div/div[2]/div[2]/div/img[5]");
    By taskSubject						= By.xpath("//form[@id='createTask']/div/div/div[2]/div/div/input");
    By taskDescription					= By.xpath("//textarea[@id='description']");
    By taskGeneralOpt					= By.xpath("//div[@id='createTask_referenceType']/label/span[2]");
    By taskProjectOpt					= By.xpath("//div[@id='createTask_referenceType']/label[2]/span[2]");
    By taskGroupOpt						= By.xpath("//div[@id='createTask_referenceType']/label[3]/span[2]");
    By taskGroupOrProject				= By.xpath("//form[@id='createTask']/div[4]/div/div[2]/div/div/div/input");
    By taskAssignTo						= By.xpath("//form[@id='createTask']/div[5]/div/div[2]/div/div/div/input");
    By taskPrioritylow					= By.xpath("//div[@id='createTask_priority']/label/span[2]");
    By taskPriorityMedium				= By.xpath("//div[@id='createTask_priority']/label[2]/span[2]");
    By taskPriorityhigh					= By.xpath("//div[@id='createTask_priority']/label[3]/span[2]");
    By taskDatePicker					= By.xpath("//input[@id='createTask_taskDate']");
    By taskEndDate						= By.xpath("/form[@id='createTask']/div[6]/div/div[2]/div/div/div/div[3]/input");
    By taskDatePickerClose				= By.xpath("//form[@id='createTask']");
    By taskCreateButton					= By.cssSelector(".ant-btn-block > span");
    By taskGroupSelectedItem			= By.xpath("//form[@id='createTask']/div[4]/div/div[2]/div/div/div[2]/span/div");
    By taskProjectSelectedItem			= By.xpath("//form[@id='createTask']/div[4]/div/div[2]/div/div/div[2]/span/div");
    By taskNavBarOpt					= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[14]/a");
    By taskCreateOption					= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[14]/a");
    By taskSelectMemberClick			= By.xpath("//form[@id='createTask']/div[5]/div/div[2]/div/div/div[2]/span/div");
    
    // groups
    By groupNavBar						= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[12]/a/p");
    By groupCreateOption				= By.xpath("//div[@id='section1']/div/div/div[2]/div/button/span");
    By groupName						= By.xpath("//input[@id='addDepartment_name']");
    By groupDescription					= By.xpath("//textarea[@id='addDepartment_description']");
    By groupTask						= By.xpath("//form[@id='addDepartment']/div[6]/div[2]/div/div/div/div/div/button");
    By groupCreateButton				= By.xpath("//form[@id='addDepartment']/div[14]/div/div/div/div/div/button[2]/span");
    By groupNewsFeedCreate				= By.xpath("//div[@id='rc-tabs-0-panel-1']/div/div[2]/div/div/div/div/div[2]/span");
    By groupNewsFeedCreateButton		= By.cssSelector(".ant-btn-submit");
    By groupFeedTextAreaCick			= By.cssSelector(".ant-mentions-focused > .rc-textarea");

    // projects
    By projectNavBar					= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[10]/a");
    By projectName						= By.xpath("//input[@id='name']");
    By projectDescription				= By.xpath("//textarea[@id='description']");
    By projectStartEntDateClick			= By.xpath("//input[@id='startEndDate']");
    By projectEndDateClick				= By.cssSelector(".ant-picker-input-active > input");
    By projectDatePickerClose			= By.xpath("//form/div[3]/div/div[2]/div/div");
    By projectUserSelection				= By.xpath("//div[6]/div/div[2]/div/div/div/input");
    By projectmemberSelectionClick		= By.xpath("//p[contains(.,'Intern')]");
    By projectTaskButtonClick			= By.xpath("//div[8]/div[2]/div/div/div/div/div/button");
    By projectCreateButtonClick			= By.cssSelector(".ant-btn-lg > span");
    By projectNewsFeedCreate			= By.xpath("//div[@id='rc-tabs-1-panel-1']/div/div[2]/div/div/div/div/div[2]/span");
    By projectNewsFeedCreateButton		= By.xpath("//span[contains(.,'Post')]");
    By projectFeedTextAreaCick			= By.cssSelector(".ant-mentions-focused > .rc-textarea");
    
    // group task verification
    By groupSelectionClick				= By.xpath("//div[@id='section1']/div/div[3]/div/div/div/img");
    By groupTaskOption					= By.xpath("//div[3]/div/div/div/div[2]/div/span");
    By groupAssignedByMeTabTask			= By.xpath("//div[@id='rc-tabs-2-panel-5']/div/div[2]/div/div[2]/button[2]/span");
    // project task verification
    By projectSelectionClick			= By.xpath("//div[@id='section1']/div/div[3]/div/div/div/img");
    By projectTaskOption				= By.xpath("//div[@id='rc-tabs-1-tab-5']/span");
    By projectAssignedbymeTabTask		= By.xpath("//div[@id='rc-tabs-1-panel-5']/div/div[2]/div/div[2]/button[2]");

    By travelNavBarOpt				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[7]/a/p");
    By travelCreateComposer			= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By travelSubject      			= By.xpath("//input[@id='travelForm_subject']");
    By travelDescription			= By.xpath("//textarea[@id='travelForm_description']");
    By travelAgent					= By.xpath("//form[@id='travelForm']/div[4]/div/div[2]/div/div/div/input");
    By travelAgentSelectionClick	= By.xpath("//form[@id='travelForm']/div[4]/div/div[2]/div/div/div[2]/span/div/div/p");
    By travelReason					= By.xpath("//input[@id='travelDetailForm_reason']");
    By travelTo					    = By.xpath("//input[@id='travelDetailForm_departureId']");
    By travelToSelectionCLick		= By.xpath("//form[@id='travelDetailForm']/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div");
    By travelFrom					= By.xpath("//input[@id='travelDetailForm_arrivalId']");
    By travelFromSelectionCLick		= By.xpath("//form[@id='travelDetailForm']/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div");
    By travelHotelReq				= By.xpath("//form[@id='travelDetailForm']/div/div[4]/div/div[2]/div/div/div/div/div/div/div/div/div/label/span/span");
    By travelDropOffReq				= By.xpath("//input[@id='travelDetailForm_isDropOffRequired']");
    By travelAdd					= By.xpath("//form[@id='travelDetailForm']/div/div[5]/button/span");
    By travelSubmitButton			= By.xpath("//form/button/span");
    
    // Administration
    // Allowance 
    By administrationNavBarOption    = By.xpath("//a[contains(@href, '/administrator/')]");
    By administrationAllowanceOpt    = By.xpath("//a[contains(text(),'Allowances')]");
    By allowanceName 			     = By.xpath("(//input[@value=''])[2]");
    By allowanceDescription		     = By.xpath("(//input[@value=''])[2]");
    By allowanceSubmitButton	     = By.xpath("//button/span");
    // Grade Allowance 
    By gradeAllowanceOptionClick     = By.xpath("//a[contains(text(),'Grade Allowances')]");
    By gradeAllowanceGradeList	     = By.cssSelector(".ant-select-open .ant-select-selection-item");
    By gradeAllowanceSelectionClick  = By.cssSelector(".ant-select-item-option-content");
    By AllowanceType				 = By.cssSelector(".ant-select-item-option-content");
    By AllowanceTypeSelection		 = By.cssSelector(".ant-select-item-option-content");
    By allowancePercentageInputField = By.cssSelector(".ant-input-number-input");
    By allowanceDescriptionTextArea  = By.xpath("//textarea");
    By gradeallowanceSubmitButton	 = By.xpath("//button/span");
    
    //Appraisal
    By appraisalNavBar				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[2]/a/p");
    By appraisalCreateButton		= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span[2]");
    By appraisalSelectMember		= By.xpath("//input[@value='']");
    By appraisalMemberSelectionCLick= By.xpath("//div[@id='section1']/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/span/div/div/p");
    By appraisalDatePicker			= By.xpath("//form[@id='CreateForm']/div/div/div/div/div/div/div");
    By appraisalStartDateClick		= By.xpath("//td[2]/div");
    By appraisalEndDateClick		= By.xpath("//div[2]/div/div[2]/table/tbody/tr[2]/td[5]/div");
    By appraisalPromotionNo			= By.xpath("//input[@value='2']");
    By appraisalBonusNo				= By.xpath("//input[@value='2']");
    By appraisalIncrementNo			= By.xpath("(//input[@value='2'])[3]");
    By appraisalResponsiveStar		= By.xpath(".ant-rate-star-full .ant-rate-star-second path");
    By appraisalTeamPLayerStar		= By.xpath(".ant-rate-star-focused .ant-rate-star-first path");
    By appraisalLongtermStar		= By.xpath(".ant-rate-star-focused .ant-rate-star-first path");
    By  appraisalenthusiasmStar		= By.xpath(".ant-rate-star-focused .ant-rate-star-first path");
    By appraisalAmbitionStar		= By.xpath(".ant-rate-star-focused .ant-rate-star-first path");
    By appraisalAbilityToProduce	= By.xpath(".ant-rate-star-focused .ant-rate-star-first path");
    By appraisalCommentOption		= By.xpath(".ant-rate-star-focused .ant-rate-star-first path");
    By appraisalSubmitOption		= By.xpath("//div[@id='section1']/div/div/div[2]/div/button/span[2]");
    
    // auction
    By auctionNavBarOption			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[18]/a/p");
    By auctionCreateAction			= By.xpath("//div[@id='section1']/div/div/div[2]/div/button/span");
    By auctionName					= By.xpath("//form[@id='aadAuction']/div/div/div[2]/div/div/span/input");
    By auctionStartingBid			= By.xpath("//input[@id='aadAuction_startingBid']");
    By auctionIcreaseBid			= By.xpath("//input[@id='aadAuction_minIncreaseBid']");
    By auctionBuyNowAmount			= By.xpath("//input[@id='aadAuction_buyNowAmount']");
    By auctionMember				= By.xpath("//form[@id='aadAuction']/div[6]/div/div[2]/div/div/div/input");
    By auctionSelectionOfMember		= By.xpath("//form[@id='aadAuction']/div[6]/div/div[2]/div/div/div[2]/span/div/div/p");
    By auctionDatePicker			= By.xpath("//form[@id='aadAuction']/div[8]/div/div[2]/div/div/div/div");
    By auctionStartDate				= By.xpath("//tr[2]/td[5]/div");
    By auctionDatePickerOk			= By.xpath("//span[contains(.,'OK')]");
    By auctionDescription			= By.xpath("//textarea[@id='aadAuction_description']");
    By auctionSubmitButton			= By.xpath("//button[@type='submit']");
    By auctionClickOnTheBiddingPage	= By.cssSelector(".sc-jTQCzO:nth-child(1) .ant-btn:nth-child(1) > svg");
    By auctionBidFieldValue			= By.xpath("//div[@id='section1']/div/div[2]/div/div/div[2]/div[3]/div[4]/div/div/div/div[2]/div[2]/input");
    By auctionBidButton				= By.cssSelector(".ant-btn > svg");
    By auctionBidNotificationBanner = By.cssSelector(".ant-notification-notice-description");
    By auctionListViewTableView		= By.xpath("//div[@id='section1']/div/div[2]/div[2]/div/div/label[2]/div/span[2]");
    // Payroll
    By payrollNavBarOption			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[5]/a/p");
    By payrollCreateButton			= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By payrollselectpayrolldate		= By.xpath("//form[@id='addpayroll']/div/div/div/div/div[2]/div/div/div/div/input");
   // By payrollSelectdate			= By.xpath("");
    By payrollDisperseDatecalender	= By.cssSelector("#addpayroll_disperseDate");
   // By payrollSelectDisperseDate	= By.xpath("");
    By payrollCreatePayroll			= By.xpath("//button/span");
   //work Board
    By workboardNavBarOpt			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[11]/a/p");
    By workboardCreatedBoard		= By.cssSelector(".ant-card:nth-child(1) > .ant-card-body > .flex");
    By workboardcreateSection		= By.xpath("//div[@id='section1']/div/div[3]/div/div/button/span[2]");
    By workboardcreateSection2		= By.xpath("//div[@id='section1']/div/div[3]/div/div[2]/button/span[2]");
    By workboardtodo1				= By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div[2]/div/div/input");
    By workboardtodoPlusOPtion		= By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div[2]/div/button/span[2]");
    By workboardtodoDetail			= By.xpath("");
    By workboardname				= By.xpath("//input[@id='basic_name']");
    By workboarddescription			= By.xpath("//textarea[@id='basic_description']");
    By workboardCreateButton		= By.cssSelector(".ant-btn > span");
    By workboardMemberField			= By.xpath("//form[@id='basic']/div[4]/div/div[2]/div/div/div/input");
    By workboardMemberSelection		= By.xpath("//form[@id='basic']/div[4]/div/div[2]/div/div/div[2]/span/div/div/p");
    By workboardSubmitBoard			= By.xpath("//form[@id='basic']/div[5]/div/div/div/div/div/button[2]");
    By workboardSectionName			= By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div/input");
    By workboardSectionName2		= By.xpath("//div[@id='section1']/div/div[3]/div/div[2]/div/div/input");
    By workboardTodoName1			= By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div[2]/div/div/input");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//    By workboard					= By.xpath("");
//  
    By customApprovalNavBar				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[6]/a/p");
    By customApprovalCreateButoon				= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button");
    By customApprovalSubject				= By.xpath("//textarea[@id='addCustomApproval_subject']");
    By customApprovalEnterCategory				= By.cssSelector(".ant-select-selector");
    By customApprovalEnterAmount				= By.xpath("//input[@id='addCustomApproval_value']");
    By customApprovalDescription				= By.xpath("//textarea[@id='addCustomApproval_description']");
    By customApprovalSubmitButton				= By.xpath("//form[@id='addCustomApproval']/div[7]/div/div/div/div/button/span");
    By customApprovalOtherCategory				= By.cssSelector(".ant-select-item-option-content");
//    By customApproval				= By.xpath("");
//    By customApproval				= By.xpath("");
//    By customApproval				= By.xpath("");
//    By customApproval				= By.xpath("");
//    By customApproval				= By.xpath("");
    // Schedule 
    By ScheduleNavbarOpt						= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[2]/a");
    By ScheduleCreateButton						= By.cssSelector(".ant-btn-square > span");
    By ScheduleSubject						= By.xpath("//form/div/div/div[2]/div/div/input");
    By ScheduleDescriptio						= By.xpath("//div[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div");
    By SchedulememberListClick						= By.xpath("//div[9]/div/div[2]/div/div/div/input");
    By ScheduleMemberSelection						= By.xpath("//span/div/div/p");
    By ScheduleSubmittButton						= By.xpath("//div[12]/div/div/div/div/button");
//    By Schedule						= By.xpath("");
//    By Schedule						= By.xpath("");
//    By Schedule						= By.xpath("");
//    By Schedule						= By.xpath("");
    By formsNavbar							= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[17]/a/p");
    By formsCreateForm							= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/a/button/span");
    By formsTitle							= By.xpath("//form[@id='CreateForm']/div/div/div/div/div[2]/div/div/div/textarea");
    By formsDescription							= By.xpath("//textarea[@id='CreateForm_description']");
    By formsQuestion							= By.xpath("//input[@id='question']");
    By formsAnswerOption							= By.cssSelector(".ant-select-selection-item");
//    By formsAnsuwerText							= By.cssSelector(".ant-select-item-option-active > .ant-select-item-option-content");
//    By formsAnswerNumber							= By.cssSelector(".ant-form-horizontal .f-head-item");
//    By formsAnswerPoll							= By.xpath("//div[2]/div/div/div/div[3]/div");
    By formsPolOption							= By.xpath("//form[@id='CreateForm']/form/div/div/div[3]/div/div/div/div/button/span[2]");
    By formsPollOption1							= By.xpath("//form[@id='CreateForm']/form/div/div/div[3]/div/div/div/div/input");
    By formsPollOptionClickAgain							= By.xpath("//form[@id='CreateForm']/form/div/div/div[4]/div/div/div/div/button");
    By formPollOption2							= By.xpath("//form[@id='CreateForm']/form/div/div/div[4]/div/div/div/div/input");
    By formAddOption							= By.xpath("//form[@id='CreateForm']/form/div/div/div[3]/div/div/div/div/button");
    By formSubmitButton							= By.cssSelector(".Formbtn > span");
    
 // Resignation
    By resignationNavbar								= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[16]/a/p");
    By resignationCreateButton								= By.xpath("//button/span");
    By resignationreasonselectionmenu								= By.xpath("//input[@id='addResignation_purposeId']");
    By resignationreasonOption								= By.xpath("//div[2]/div/div/div/div[6]/div");
    By resignationDateClick								= By.xpath("//input[@id='addResignation_resignationDate']");
    By resignationReportingTOClick								= By.xpath("//form[@id='addResignation']/div[4]/div/div[2]/div/div/div/input");
    By resignationHRClick								= By.xpath("//form[@id='addResignation']/div[5]/div/div[2]/div/div/div/input");
    By resignationAdminClick								= By.xpath("//form[@id='addResignation']/div[6]/div/div[2]/div/div/div/input");
    By resignationITClick								= By.xpath("//form[@id='addResignation']/div[7]/div/div[2]/div/div/div/input");
    By resignationFinanceClick								= By.xpath("//form[@id='addResignation']/div[8]/div/div[2]/div/div/div/input");
    By resignationExitInterview								= By.xpath("//form[@id='addResignation']/div[10]/div/div[2]/div/div/div/input");
    By resignationDescriptionClick								= By.xpath("//textarea[@id='addResignation_description']");
    By resignationSubmitButtonClick								= By.xpath("//form[@id='addResignation']/div[13]/div/div/div/div/button/span");
 // Comments
    By commentsOption = By.xpath("//div[@id='scrollableDiv']/div/div/div/div[3]/div[2]/div[2]/div[2]");
    By commentsTextArea = By.xpath("//textarea");
    By commentsleadManagerLead = By.xpath("//div[@id='section1']/div/div[3]/div/div/div/div/div/div/div/div/div/table/tbody/tr/td");
    By commentsInLeadManager = By.xpath("//textarea");
//    By comments = By.xpath("");
//    By comments = By.xpath("");
//    By comments = By.xpath("");
    By languageOption 			= By.xpath("//img[@alt='userSettingToggle']");
    By landCzech				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul[2]/li[6]");
    By clickOnmessenger			 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[3]/a");
    By ClickOnMailBox			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[4]/a/p");
    By clickOnDocsAndArchive	 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[8]/a");
    By clickOnLandD				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[8]/a/p");
    By clickonJobBoard 			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[15]/a/p");
    By clickOnBusinessPolicy	 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[15]/a");
    By clickOnForms				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[17]/a");
    By ClickOnMarketPlace		 = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[18]/a/p");
    By clickOnAuction 			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[19]/a/p");
    By clickOnDiscussionBoard 	= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[20]/a/p");
    By clickOnPages				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[21]/a");
    By ClickOnAdministration 	= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[3]/a/p");
    By clickOnOrganizationChart = By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[7]/a/p");
    By clickOnMyTeam    		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[10]/a/p");
    By clickOnDepartments		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[12]/a/p");
    By clickOnCareers			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[13]/a/p");
    By clickOnResignation		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[16]/a/p");
    By ClickOnAttendance		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div/div[17]/a");
    By clickOnCHartOfAccount	= By.xpath("//a[contains(@href, '/chart-of-account')]");
    By clickOnQuotation			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[2]/a/p");
    By clickOnCreateVoucher		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[3]/a/p");
    By clickOnVoucherList		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[4]/a/p");
    By clickOnLedgerList		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[5]/a/p");
    By clickOnTrialBalance		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[6]/a/p");
    By clickOnPayroll			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[3]/div/div[2]/div/div/div[7]/a/p");
    By clickOnRequisition		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[4]/div/div[2]/div/div/div/a");
    By clickOnAssetsAllocation	= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[4]/div/div[2]/div/div/div[2]/a");
    By clickOnCreateAssets		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[4]/div/div[2]/div/div/div[3]/a/p");
    By clickOnAssetsList		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[4]/div/div[2]/div/div/div[3]/a/p");
    By clickOnRequestForItem	= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[4]/div/div[2]/div/div/div[5]/a/p");
    By clickOnCompanies			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div[5]/div/div[2]/div/div/div/a");
    By urduLanguage				= By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul[2]/li[2]/p");
    By turkishLanguage			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul[2]/li[5]/p");
    By hindiLanguage			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul[2]/li[4]");
    By arabicLanguage			= By.xpath("//div[@id='root']/div/div[2]/div[2]/div/div[2]/ul[2]/li[3]");
    
    // news feed poll options
    By newsFeedPollOption		= By.xpath("//div[@id='section1']/div/div[2]/div/div/div/div/div[3]/img[4]");
    By newsFeedPollOption1		= By.xpath("(//input[@value=''])[3]");
    By newsFeedPollOption2		= By.cssSelector(".poll-input:nth-child(3) > .ant-input");
    
    // pages 
    By pagesNewsfeedOption		= By.xpath("//div[@id='root']/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/div[20]/a/p");
    By pagesCreatePagesButton	= By.xpath("//div[@id='section1']/div/div/div[2]/div/div/button/span");
    By pagesName				= By.xpath("//form[@id='pageForm']/div/div/div[2]/div/div/input");
    By pagesCategory			= By.xpath("//form[@id='pageForm']/div[2]/div/div[2]/div/div/div/div/span/input");
    By pagesCategorySelect		= By.cssSelector(".ant-select-item-option-active > .ant-select-item-option-content");
    By pagesTags				= By.cssSelector(".ant-select-selection-overflow");
    By pagesDescriptions		= By.xpath("//textarea[@id='pageForm_description']");
    By pagesSubmittButton		= By.xpath("//form[@id='pageForm']/div[6]/div/div/div/div/div/button[2]");
    By PagesCreatedPageOpening	= By.xpath("//div[@id='section1']/div/div[2]/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td/span");
    By pagesTagText				= By.xpath("//input[@id='pageForm_tags']");
    
    // search Hr modules
    By searchfieldemp			= By.cssSelector(".ant-input");
  
    
}