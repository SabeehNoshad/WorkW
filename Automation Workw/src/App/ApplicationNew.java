package App;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JLabel;

import appraisal.appraisalTest;
import clockInClockOut.clockIn_Test;
import coments.commentTest;
import customApproval.customApprovalTest;
import expense.expenseCreateFeed_Test;
import form.formTest;
import group.groupCreateTest;
import humanResourse.bonus.bonus_Test;
import humanResourse.complain.complain_Test;
import humanResourse.leaves.leaves_Test;
import humanResourse.loan.loan_Test;
import humanResourse.promotion.promotion_Test;
import humanResourse.reward.reward_Test;
import humanResourse.warnings.warning_Test;
import leadManager.Lead_Group_leads;
import leadManager.leadManager_Test;
import newsFeed.newsFeedCreate_Test;
import project.projectCreateTest;
import quickAdd.quickadd_test;
import resignation.resignationTest;
import salary.salary_test;
import scheduleModule.scheduleTest;
import task.taskCreation_Test;
import travel.travelTest;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;
import workboard.workBoardTest;

import static java.awt.Color.red;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;

import Localization.localizationTest;
import Xpaths.getterMethods;

import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class ApplicationNew extends javax.swing.JFrame {
	getterMethod_Defaults defaults = new getterMethod_Defaults();
	// background color set 
	

	// second stage when all other panels are visible and welcome is not 
   public void showPanel2AndTabbedPane() {
        // Set the visibility of Panel 1 to false
        jTabbedPane1.setVisible(true);

        // Set the visibility of Panel 2 to true
        jPanelwellcom.setVisible(false);

        // Set the visibility of the tabbed pane to true
        jPanelResult.setVisible(true);
        
    }
   // initial state when the wellcome panel is visible and rest are not 
   public final void showPane() {
       // Set the visibility of Panel 1 to false
       jTabbedPane1.setVisible(false);

       // Set the visibility of Panel 2 to true
       jPanelwellcom.setVisible(true);
       
   }
   public void darkmode() {
	   jTabbedPane1.setBackground(new java.awt.Color(64, 64, 64));
	   jPanelwellcom.setBackground(new java.awt.Color(64, 64, 64));
	   jPanelResult.setBackground(new java.awt.Color(64, 64, 64));
	   jPanelmain.setBackground(new Color(64, 64, 64));
	   jPanelFinance.setBackground(new java.awt.Color(64, 64, 64));
	   jPanelNew.setBackground(new java.awt.Color(64, 64, 64));
	   jPanelHR.setBackground(new java.awt.Color(64, 64, 64));
	   jPanel1.setBackground(new java.awt.Color(64, 64, 64));
	   jPanelCustomCases.setBackground(new java.awt.Color(64, 64, 64));
	   
   }
   public void lightMode() {
	    jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelwellcom.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelResult.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelmain.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelFinance.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelNew.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelHR.setBackground(new java.awt.Color(255, 255, 255));
	    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
	    jPanelCustomCases.setBackground(new java.awt.Color(255, 255, 255));
	    
	}
   // logout panel display 
   public void logOutPanel(){
         jTabbedPane1.setVisible(false);

        // Set the visibility of Panel 2 to true
        jPanelwellcom.setVisible(true);

        // Set the visibility of the tabbed pane to true
        jPanelResult.setVisible(false);
   }
   //log Errors 
   public static void logError(String errorMessage) {
       System.err.println(errorMessage); // You can replace this with your preferred logging mechanism
       jTextArea1.setText(errorMessage);
   }
   // response time  
   public static void resTime(String errorMessage) {
       System.err.println(errorMessage); // You can replace this with your preferred logging mechanism
		jTextArea2.setText(errorMessage);
	   }
    /**
     * Creates new form ApplicationNew
     */
    public ApplicationNew() {
        initComponents();
        showPane();
        settiingDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelwellcom = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        jPanelmain = new javax.swing.JPanel();
        jLabelheadMain = new javax.swing.JLabel();
        jButtonClock = new javax.swing.JButton();
        jButtonPost = new javax.swing.JButton();
        jButtonPost.setToolTipText("please enter the loop count and the tag value ");
        jButtonTravel = new javax.swing.JButton();
        jButtonTravel.setToolTipText("please place the loop count ");
        jButtonExpenses = new javax.swing.JButton();
        jButtonExpenses.setToolTipText("please place the loop count ");
        jButtonGroup = new javax.swing.JButton();
        jButtonGroup.setToolTipText("please enter the loop count and aswell as the tag value for the unique name of the item ");
        jButtonWOrkBoard = new javax.swing.JButton();
        jButtonWOrkBoard.setToolTipText("Place the loop & tag value for generating a Unique name for the Item ");
        jButtonCustomAp = new javax.swing.JButton();
        jButtonCustomAp.setToolTipText("Place loop count for regression");
        jButtonTask = new javax.swing.JButton();
        jButtonTask.setToolTipText("please enter the loop count ");
        jButtonProject = new javax.swing.JButton();
        jButtonProject.setToolTipText("Please enter the loop count");
        jButtonLeadMana = new javax.swing.JButton();
        jButtonLeadMana.setToolTipText("please enter the loop and tag value for the unique name of the item ");
        jButtonLead = new javax.swing.JButton();
        jButtonLead.setToolTipText("please enter the loop count ");
        jButtonSchedule = new javax.swing.JButton();
        jButtonSchedule.setToolTipText("please enter teh loop count ");
        jButtonForms = new javax.swing.JButton();
        jButtonForms.setToolTipText("Please Enter the loop Count ");
        jPanelHR = new javax.swing.JPanel();
        jLabelHeadHr = new javax.swing.JLabel();
        jButtonQuick = new javax.swing.JButton();
        jButtonwarning = new javax.swing.JButton();
        jButtonBonus = new javax.swing.JButton();
        jButtonPromotion = new javax.swing.JButton();
        jButtonEmployee = new javax.swing.JButton();
        jButtonCareers = new javax.swing.JButton();
        jButtonLeaves = new javax.swing.JButton();
        jButtonComplain = new javax.swing.JButton();
        jButtonReward = new javax.swing.JButton();
        jButtonResignation = new javax.swing.JButton();
        jButtonSalary = new javax.swing.JButton();
        jButtonLoan = new javax.swing.JButton();
        jPanelFinance = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jPanelCustomCases = new javax.swing.JPanel();
        jLabelHeadCUstom = new javax.swing.JLabel();
        jButtonSalaryBonus = new javax.swing.JButton();
        jButtonAdminAlow = new javax.swing.JButton();
        jButtonGroupTakPost = new javax.swing.JButton();
        jButtonGroupTask = new javax.swing.JButton();
        jPanelNew = new javax.swing.JPanel();
        jLabelCOminSoon = new javax.swing.JLabel();
        jPanelResult = new JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonBack = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelWelcom = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelWelcomName = new javax.swing.JLabel();
        jLabelDateField = new javax.swing.JLabel();
        jLabelDetail = new javax.swing.JLabel();
        jLabelResult = new javax.swing.JLabel();
        jLabelProgress = new javax.swing.JLabel();
        jButtonLogOut = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jLabelLoop = new javax.swing.JLabel();
        jTextFieldLoopValue = new javax.swing.JTextField();
        jLabelTag = new javax.swing.JLabel();
        jTextFieldTagValue = new javax.swing.JTextField();
        jButtonAppraisal = new javax.swing.JButton();
        comment = new javax.swing.JButton();
        comment.setText("Comment ");
        btnTurkish = new JButton("Turkish");
        btnHindi = new JButton("Hindi");
        btnNewButton_1 = new JButton("Arabic");
        btnNewButton_2 = new JButton("Urdu");
        jButtonPoll = new javax.swing.JButton();
        jButtonPoll.setToolTipText("enter the loop count and also the tag value ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      
        jPanelwellcom.setBackground(new java.awt.Color(51, 0, 51));
        jPanelwellcom.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("sabeehnoshad@gmail.com");
       
        jCheckBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (jCheckBox2.isSelected()) {
                	jLabelWelcomName.setText("Wise Work");
                   
                } else {
                    // Checkbox is unchecked, perform another action if needed
                	jLabelWelcomName.setText("");
                }
            }
        });
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("owais@miletap.com");
        jCheckBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (jCheckBox4.isSelected()) {
                	jLabelWelcomName.setText("Owais Shaikh");
                   
                } else {
                    // Checkbox is unchecked, perform another action if needed
                	jLabelWelcomName.setText("");
                }
            }
        });

        jCheckBox5.setForeground(new java.awt.Color(242, 242, 242));
        jCheckBox5.setText("u807816@gmail.com");
        jCheckBox5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (jCheckBox5.isSelected()) {
                	jLabelWelcomName.setText("Auto Mate");
                   
                } else {
                    // Checkbox is unchecked, perform another action if needed
                	jLabelWelcomName.setText("");
                }
            }
        });
//*************************************************************************** Wellcome Panel  J panel *******************************************************************************************************
        javax.swing.GroupLayout jPanelwellcomLayout = new javax.swing.GroupLayout(jPanelwellcom);
        jPanelwellcomLayout.setHorizontalGroup(
        	jPanelwellcomLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanelwellcomLayout.createSequentialGroup()
        			.addContainerGap(499, Short.MAX_VALUE)
        			.addComponent(jButtonSubmit)
        			.addGap(327))
        		.addGroup(Alignment.LEADING, jPanelwellcomLayout.createSequentialGroup()
        			.addGap(206)
        			.addGroup(jPanelwellcomLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jCheckBox4, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jCheckBox5, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jCheckBox2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(358, Short.MAX_VALUE))
        );
        jPanelwellcomLayout.setVerticalGroup(
        	jPanelwellcomLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelwellcomLayout.createSequentialGroup()
        			.addGap(74)
        			.addComponent(jCheckBox2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jCheckBox4)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jCheckBox5)
        			.addGap(42)
        			.addComponent(jButtonSubmit)
        			.addContainerGap(372, Short.MAX_VALUE))
        );
        jPanelwellcom.setLayout(jPanelwellcomLayout);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32767, 2147483647));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanelmain.setBackground(new java.awt.Color(255, 255, 255));

        jLabelheadMain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelheadMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        // ****************************************************************************** Background Set *******************************************************************************************************
       
        
        // *******************************************************************************set text **************************************************************************************************************
        jLabelheadMain.setText("Main Menu ");

        jButtonClock.setText("Clock");

        jButtonPost.setText("Post");

        jButtonTravel.setText("Travel");

        jButtonExpenses.setText("Expense");

        jButtonGroup.setText("Group");

        jButtonWOrkBoard.setText(" WorkBoa");
        
        jButtonCustomAp.setText("CustomA");

        jButtonTask.setText("Task");

        jButtonProject.setText("Project");

        jButtonLeadMana.setText("LeadM");

        jButtonLead.setText("Leads");

        jButtonSchedule.setText("Sched");

        jButtonForms.setText("Forms");
        
        jButtonPoll.setText("Poll");
       //****************************************************************************************************************************************************************************************************
        
        //Comments
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                commentTest testClass2 = new commentTest();
                getterMethodTextFile text = new getterMethodTextFile();
                testResult tst = new testResult();
             // Break the string into multiple lines using newline character
                String[] lines = text.getcommenttestingdesc().split("\\*\\*\\*");

                // Create a new string with line breaks
                String formattedTravelDetails = String.join("\n", lines);
                jTextArea2.setText(formattedTravelDetails);
                try {
                	
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	
    				//Boolean result = testClass2.travelCreateTest(inputValue1);
                	   if (jLabelWelcomName.getText().equals("abc")) {
                           // If yes, pass additional parameters
                           boolean result = testClass2.commentsTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                           if (result) {
       		                // Test passed, change the button color to green
                        	   comment.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	comment.setBackground(Color.RED);
       		            }
                       } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass2.commentsTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   comment.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	comment.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
    				
    		            // Get the relevant information from ITestResult and update the JTextArea
    			    
   
    			     jTextArea2.setText(tst.getuserTestDetails());
    				//updateResultLabel(result);
    				

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });
                                     
        // FORMS
        jButtonForms.addActionListener(new java.awt.event.ActionListener() {
            @Override

      	  public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here

            	formTest testClass1 = new formTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
                 // Break the string into multiple lines using newline character
                    String[] lines = text.getuserModuleDescription150().split("\\*\\*\\*");

                    // Create a new string with line breaks
                    String formattedTravelDetails = String.join("\n", lines);
                    jTextArea2.setText(formattedTravelDetails);
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	 	// boolean result = testClass1.newsFeedCreateTest(inputValue1,inputValue2);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                        // If yes, pass additional parameters
                        boolean result = testClass1.form1Test(inputValue1, defaults.getrmployeeEmail(),defaults.getemployeepassword());
                        if (result) {
     		                // Test passed, change the button color to green
                        	jButtonForms.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonForms.setBackground(Color.RED);
     		            }
                       
                  	   updateResultLabel(result);
                    } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                  	  
                  	  boolean result = testClass1.form1Test( inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                        if (result) {
     		                // Test passed, change the button color to green
                        	jButtonForms.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonForms.setBackground(Color.RED);
     		            	 updateResultLabel(result);
                    }
                    }
                	 
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
               
              
             
            }
      });
      //schedule 
        jButtonSchedule.addActionListener(new java.awt.event.ActionListener() {
            @Override

      	  public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here

            	scheduleTest testClass1 = new scheduleTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
                 // Break the string into multiple lines using newline character
                
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	 	// boolean result = testClass1.newsFeedCreateTest(inputValue1,inputValue2);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                        // If yes, pass additional parameters
                        boolean result = testClass1.scheduleCreateTest(inputValue1, defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                        if (result) {
     		                // Test passed, change the button color to green
                        	jButtonSchedule.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonSchedule.setBackground(Color.RED);
     		            }
                  	   updateResultLabel(result);
                    } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                  	  
                  	  boolean result = testClass1.scheduleCreateTest( inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                        if (result) {
     		                // Test passed, change the button color to green
                        	jButtonSchedule.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonSchedule.setBackground(Color.RED);
     		            	 updateResultLabel(result);
                    }
                    }
                	 
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
               
              
             
            }
      });
        //Clockin / out 
        jButtonClock.addActionListener(new java.awt.event.ActionListener() {
            @Override

      	  public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here

            	clockIn_Test testClass1 = new clockIn_Test();
            	 getterMethodTextFile text = new getterMethodTextFile();
//                 // Break the string into multiple lines using newline character
//                    String[] lines = text.getuserModuleDescription150().split("\\*\\*\\*");

                    // Create a new string with line breaks
//                    String formattedTravelDetails = String.join("\n", lines);
//                    jTextArea2.setText(formattedTravelDetails);
                try {
                	
                	 	// boolean result = testClass1.newsFeedCreateTest(inputValue1,inputValue2);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                        // If yes, pass additional parameters
                        boolean result = testClass1.clockInMessageTest( defaults.getrmployeeEmail(),defaults.getemployeepassword());
                        if (result) {
     		                // Test passed, change the button color to green
                        	jButtonClock.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonClock.setBackground(Color.RED);
     		            }
                  	   updateResultLabel(result);
                    } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                  	  
                  	  boolean result = testClass1.clockInMessageTest(  defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                        if (result) {
     		                // Test passed, change the button color to green
                        	jButtonClock.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonClock.setBackground(Color.RED);
     		            	 updateResultLabel(result);
                    }
                    }
                	 
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
               
              
             
            }
      });
        
        // News Feed 
        jButtonPost.addActionListener(new java.awt.event.ActionListener() {
            @Override

        	  public void actionPerformed(ActionEvent e) {
              	jTextArea1.setText("");
              	// Call your test case methods here

              	newsFeedCreate_Test testClass1 = new newsFeedCreate_Test();
              	 getterMethodTextFile text = new getterMethodTextFile();
             
                  try {
                  	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                  	 int inputValue2 = Integer.parseInt(jTextFieldTagValue.getText());
                  	 	// boolean result = testClass1.newsFeedCreateTest(inputValue1,inputValue2);
                  	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.newsFeedCreateTest(inputValue1, inputValue2, defaults.getrmployeeEmail(),defaults.getemployeepassword(),"wise Word");
                          if (result) {
       		                // Test passed, change the button color to green
                    		 jButtonPost.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonPost.setBackground(Color.RED);
       		            }
                    	   updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                    	  
                    	  boolean result = testClass1.newsFeedCreateTest(inputValue1, inputValue2, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                          if (result) {
       		                // Test passed, change the button color to green
                    		 jButtonPost.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonPost.setBackground(Color.RED);
       		             updateResultLabel(result);
                      }
                      }
                  	 
      			} catch (InterruptedException e1) {
      				// TODO Auto-generated catch block
      				e1.printStackTrace();
      			}
                 
                
               
              }
        });

        // Poll News Feed
        jButtonPoll.addActionListener(new java.awt.event.ActionListener() {
            @Override

        	  public void actionPerformed(ActionEvent e) {
              	jTextArea1.setText("");
              	// Call your test case methods here

              	newsFeedCreate_Test testClass1 = new newsFeedCreate_Test();
              	 getterMethodTextFile text = new getterMethodTextFile();
             
                  try {
                  	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                  	 int inputValue2 = Integer.parseInt(jTextFieldTagValue.getText());
                  	 	// boolean result = testClass1.newsFeedCreateTest(inputValue1,inputValue2);
                  	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.newsFeedPoll(inputValue1, inputValue2, defaults.getrmployeeEmail(),defaults.getemployeepassword(),"wise Word");
                          if (result) {
       		                // Test passed, change the button color to green
                        	  jButtonPoll.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonPoll.setBackground(Color.RED);
       		            }
                    	   updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                    	  
                    	  boolean result = testClass1.newsFeedPoll(inputValue1, inputValue2, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                          if (result) {
       		                // Test passed, change the button color to green
                        	  jButtonPoll.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonPoll.setBackground(Color.RED);
       		             updateResultLabel(result);
                      }
                      }
                  	 
      			} catch (InterruptedException e1) {
      				// TODO Auto-generated catch block
      				e1.printStackTrace();
      			}
                 
                
               
              }
        });

       //travel
        jButtonTravel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                travelTest testClass2 = new travelTest();
                getterMethodTextFile text = new getterMethodTextFile();
                testResult tst = new testResult();
          
                try {
                	
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	
    				//Boolean result = testClass2.travelCreateTest(inputValue1);
                	   if (jLabelWelcomName.getText().equals("abc")) {
                           // If yes, pass additional parameters
                           boolean result = testClass2.travelCreateTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                           if (result) {
       		                // Test passed, change the button color to green
       			    	 jButtonTravel.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonTravel.setBackground(Color.RED);
       		            }
                       } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass2.travelCreateTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonTravel.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonTravel.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
    				
    		            // Get the relevant information from ITestResult and update the JTextArea
    			    
       				

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });
              
       // expense
        jButtonExpenses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                expenseCreateFeed_Test testClass1 = new expenseCreateFeed_Test();
                getterMethodTextFile text = new getterMethodTextFile();
            
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
    				//Boolean result =testClass1.expenseCreateTest(inputValue1);
                	   if (jLabelWelcomName.getText().equals("Wise Work")) {
                           // If yes, pass additional parameters
                           boolean result = testClass1.expenseCreateTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                           if (result) {
       		                // Test passed, change the button color to green
                        	   jButtonExpenses.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonExpenses.setBackground(Color.RED);
       		            }
                           updateResultLabel(result);
                       } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                      	  
                      	  boolean result = testClass1.expenseCreateTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                            if (result) {
         		                // Test passed, change the button color to green
                            	jButtonExpenses.setBackground(Color.GREEN);
         		            } else {
         		                // Test failed, change the button color to red (or any other color)
         		            	jButtonExpenses.setBackground(Color.RED);
         		            	 updateResultLabel(result);
                        }
                        }
    				
                	   
    				
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
               
            }
        });
          
        //WorkBOard  
        jButtonWOrkBoard.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
             	jTextArea1.setText("");
             	// Call your test case methods here
             	workBoardTest testClass1 = new workBoardTest();
             	 getterMethodTextFile text = new getterMethodTextFile();
              
                 try {
                 	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                  	 int inputValue2 = Integer.parseInt(jTextFieldTagValue.getText());
                 	// boolean result =testClass1.workBoardCreateAndSectionAndTodos(inputValue1);
                 	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.workBoardCreateAndSectionAndTodos(inputValue1,inputValue2,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                          if (result) {
      		                // Test passed, change the button color to green
                        	  jButtonWOrkBoard.setBackground(Color.GREEN);
      		            } else {
      		                // Test failed, change the button color to red (or any other color)
      		            	jButtonWOrkBoard.setBackground(Color.RED);
      		            }
                          updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                      	  
                      	  boolean result = testClass1.workBoardCreateAndSectionAndTodos(inputValue1,inputValue2, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                            if (result) {
         		                // Test passed, change the button color to green
                            	jButtonWOrkBoard.setBackground(Color.GREEN);
         		            } else {
         		                // Test failed, change the button color to red (or any other color)
         		            	jButtonWOrkBoard.setBackground(Color.RED);
         		            	 updateResultLabel(result);
         		            }
                        }
                 	
     			} catch (InterruptedException e1) {
     				// TODO Auto-generated catch block
     				e1.printStackTrace();
     			}
                
             }
            });

      
        //group
        jButtonGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                groupCreateTest testClass1 = new groupCreateTest();
                getterMethodTextFile text = new getterMethodTextFile();
              
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	 int inputValue2 = Integer.parseInt(jTextFieldTagValue.getText());
                	// boolean result =testClass1.groupCreate(inputValue1);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.groupCreate(inputValue1,inputValue2,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                          if (result) {
      		                // Test passed, change the button color to green
                        	  jButtonGroup.setBackground(Color.GREEN);
      		            } else {
      		                // Test failed, change the button color to red (or any other color)
      		            	jButtonGroup.setBackground(Color.RED);
      		            }
                          updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                      	  
                      	  boolean result = testClass1.groupCreate(inputValue1,inputValue2, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                            if (result) {
         		                // Test passed, change the button color to green
                            	jButtonGroup.setBackground(Color.GREEN);
         		            } else {
         		                // Test failed, change the button color to red (or any other color)
         		            	jButtonGroup.setBackground(Color.RED);
         		            	 updateResultLabel(result);
                        }
                        }
                
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });

        //project
        jButtonProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                projectCreateTest testClass1 = new projectCreateTest();
                getterMethodTextFile text = new getterMethodTextFile();
              
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	 int inputValue2 = Integer.parseInt(jTextFieldTagValue.getText());

                	// boolean result =testClass1.projectCreate(inputValue1);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.projectCreate(inputValue1,inputValue2,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                          if (result) {
      		                // Test passed, change the button color to green
                        	  jButtonProject.setBackground(Color.GREEN);
      		            } else {
      		                // Test failed, change the button color to red (or any other color)
      		            	jButtonProject.setBackground(Color.RED);
      		            }
                          updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                      	  
                      	  boolean result = testClass1.projectCreate(inputValue1,inputValue2, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                            if (result) {
         		                // Test passed, change the button color to green
                            	jButtonProject.setBackground(Color.GREEN);
         		            } else {
         		                // Test failed, change the button color to red (or any other color)
         		            	jButtonProject.setBackground(Color.RED);
         		            	 updateResultLabel(result);
                        }
                        }
                 
                	
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });

        //Lead Manager
        jButtonLeadMana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                leadManager_Test testClass1 = new leadManager_Test();
                getterMethodTextFile text = new getterMethodTextFile();
               
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	 int inputValue2 = Integer.parseInt(jTextFieldTagValue.getText());

                	// boolean result =testClass1.leadManagerCreate(inputValue1);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.leadManagerCreate(inputValue1,inputValue2,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                          if (result) {
      		                // Test passed, change the button color to green
                        	  jButtonLeadMana.setBackground(Color.GREEN);
      		            } else {
      		                // Test failed, change the button color to red (or any other color)
      		            	jButtonLeadMana.setBackground(Color.RED);
      		            }
                          updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                      	  
                      	  boolean result = testClass1.leadManagerCreate(inputValue1,inputValue2, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                            if (result) {
         		                // Test passed, change the button color to green
                            	jButtonLeadMana.setBackground(Color.GREEN);
         		            } else {
         		                // Test failed, change the button color to red (or any other color)
         		            	jButtonLeadMana.setBackground(Color.RED);
                        }
                        }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });
        //Custom Approval
        jButtonCustomAp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
            	customApprovalTest testClass1 = new customApprovalTest();
                getterMethodTextFile text = new getterMethodTextFile();
               
               
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	// boolean result =testClass1.leadManagerCreate(inputValue1);
                	  if (jLabelWelcomName.getText().equals("Wise Work")) {
                          // If yes, pass additional parameters
                          boolean result = testClass1.CustomApprovalCreateTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                          if (result) {
      		                // Test passed, change the button color to green
                        	  jButtonCustomAp.setBackground(Color.GREEN);
      		            } else {
      		                // Test failed, change the button color to red (or any other color)
      		            	jButtonCustomAp.setBackground(Color.RED);
      		            }
                          updateResultLabel(result);
                      } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                      	  
                      	  boolean result = testClass1.CustomApprovalCreateTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                            if (result) {
         		                // Test passed, change the button color to green
                            	jButtonCustomAp.setBackground(Color.GREEN);
         		            } else {
         		                // Test failed, change the button color to red (or any other color)
         		            	jButtonCustomAp.setBackground(Color.RED);
         		            	 updateResultLabel(result);
                        }
                        }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });
        // leads
        jButtonLead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
            	Lead_Group_leads testClass1 = new Lead_Group_leads();
            	 getterMethodTextFile text = new getterMethodTextFile();
              
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.LeadCreateTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonLead.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonLead.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.LeadCreateTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonLead.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonLead.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
             
            }
           });
        // Task
        jButtonTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
            	taskCreation_Test testClass1 = new taskCreation_Test();
            	 getterMethodTextFile text = new getterMethodTextFile();
               
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.testCreateTestCond1(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonTask.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonTask.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.testCreateTestCond1(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonTask.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonTask.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            	 
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
             
            }
           });
        // comment on lead under lead manager 
        JButton JButtonLeadComent = new JButton("Lead Coment");
        JButtonLeadComent.setToolTipText("please enter teh loop count ");
        JButtonLeadComent.addActionListener(new ActionListener() {
            @Override

        	public void actionPerformed(ActionEvent e) {
        	jTextArea1.setText("");
        	// Call your test case methods here
        	commentTest testClass1 = new commentTest();
        	 getterMethodTextFile text = new getterMethodTextFile();
           
            try {
            	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
            	// boolean result =testClass1.LeadCreateTest(inputValue1);  
            	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                     // If yes, pass additional parameters
                     boolean result = testClass1.commentLeadManagerTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                     if (result) {
 		                // Test passed, change the button color to green
                    	 JButtonLeadComent.setBackground(Color.GREEN);
 		            } else {
 		                // Test failed, change the button color to red (or any other color)
 		            	JButtonLeadComent.setBackground(Color.RED);
 		            }
                     updateResultLabel(result);
                 } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                 	  
                 	  boolean result = testClass1.commentLeadManagerTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                       if (result) {
    		                // Test passed, change the button color to green
                    	   JButtonLeadComent.setBackground(Color.GREEN);
    		            } else {
    		                // Test failed, change the button color to red (or any other color)
    		            	JButtonLeadComent.setBackground(Color.RED);
    		            	 updateResultLabel(result);
    		            	 
                   }
                   }
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         
        	}
        });
        // Czech republic language
        JButtonCzeck = new JButton("Czech Lang");
        JButtonCzeck.addActionListener(new ActionListener() {
            @Override

        	public void actionPerformed(ActionEvent e) {
        		jTextArea1.setText("");
            	// Call your test case methods here
        		localizationTest testClass1 = new localizationTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
            	 getterMethods xpaths = new getterMethods();
                
                try {
                	
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.localicationlangTest(xpaths.getlangCzech(),defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 JButtonCzeck.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	JButtonCzeck.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.localicationlangTest(xpaths.getlangCzech(), defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   JButtonCzeck.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	JButtonCzeck.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            	 
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        	}
        });
        
       
        // urdu language 
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override

        	public void actionPerformed(ActionEvent e) {
        		jTextArea1.setText("");
            	// Call your test case methods here
        		localizationTest testClass1 = new localizationTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
         		getterMethods xpaths = new getterMethods();

                try {
                	
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.localicationlangTest(xpaths.geturduLanguage(),defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 btnNewButton_2.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	btnNewButton_2.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.localicationlangTest(xpaths.geturduLanguage(), defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   btnNewButton_2.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	btnNewButton_2.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            	 
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        	}
        });
        // hindi language 
        btnHindi.addActionListener(new ActionListener() {
            @Override

        	public void actionPerformed(ActionEvent e) {
        		jTextArea1.setText("");
            	// Call your test case methods here
        		localizationTest testClass1 = new localizationTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
         		getterMethods xpaths = new getterMethods();

                try {
                	
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.localicationlangTest(xpaths.gethindiLanguage(),defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 btnHindi.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	btnHindi.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.localicationlangTest(xpaths.gethindiLanguage(), defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   btnHindi.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	btnHindi.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            	 
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        	}
        });
        // turkish language
        btnTurkish.addActionListener(new ActionListener() {
            @Override

        	public void actionPerformed(ActionEvent e) {
        		jTextArea1.setText("");
            	// Call your test case methods here
        		localizationTest testClass1 = new localizationTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
         		getterMethods xpaths = new getterMethods();

            
                try {
                	
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.localicationlangTest(xpaths.getturkishLanguage(),defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 btnTurkish.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	btnTurkish.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.localicationlangTest(xpaths.getturkishLanguage(), defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   btnTurkish.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	btnTurkish.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            	 
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        	}
        });
        // arabic language 
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override

        	public void actionPerformed(ActionEvent e) {
        		jTextArea1.setText("");
            	// Call your test case methods here
        		localizationTest testClass1 = new localizationTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
         		getterMethods xpaths = new getterMethods();

                try {
                	
                	// boolean result =testClass1.LeadCreateTest(inputValue1);  
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.localicationlangTest(xpaths.getarabicLanguage(),defaults.getrmployeeEmail(),defaults.getemployeepassword());
                         if (result) {
     		                // Test passed, change the button color to green
                        	 btnNewButton_1.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	btnNewButton_1.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.localicationlangTest(xpaths.getarabicLanguage(), defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                           if (result) {
        		                // Test passed, change the button color to green
                        	   btnNewButton_1.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	btnNewButton_1.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            	 
                       }
                       }
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
        	}
        });
        
        JLabel lblNewLabel = new JLabel("Localization");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        
        JLabel lblNewLabel_1 = new JLabel("Comments");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        
       //*********************************************************************************** main panel screen Set ****************************************************************************************

        javax.swing.GroupLayout jPanelmainLayout = new javax.swing.GroupLayout(jPanelmain);
        jPanelmainLayout.setHorizontalGroup(
        	jPanelmainLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelmainLayout.createSequentialGroup()
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanelmainLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabelheadMain, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        				.addGroup(jPanelmainLayout.createSequentialGroup()
        					.addGap(17)
        					.addGroup(jPanelmainLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanelmainLayout.createSequentialGroup()
        							.addGroup(jPanelmainLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jButtonCustomAp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButtonProject, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        								.addComponent(jButtonClock, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        								.addComponent(jButtonForms, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        							)
        							.addGroup(jPanelmainLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanelmainLayout.createSequentialGroup()
        									.addGap(11)
        									.addGroup(jPanelmainLayout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jButtonWOrkBoard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(jButtonExpenses, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        										.addComponent(jButtonPoll))
        									.addGap(12)
        									.addGroup(jPanelmainLayout.createParallelGroup(Alignment.LEADING)
        										.addGroup(jPanelmainLayout.createSequentialGroup()
        											.addComponent(jButtonTravel)
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addComponent(jButtonPost))
        										.addGroup(jPanelmainLayout.createSequentialGroup()
        											.addComponent(jButtonGroup)
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addComponent(jButtonTask))))
        								.addGroup(jPanelmainLayout.createSequentialGroup()
        									.addGap(12)
        									.addComponent(jButtonLeadMana)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jButtonLead)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jButtonSchedule)))
        							.addGap(96))
        						.addGroup(jPanelmainLayout.createSequentialGroup()
        							.addComponent(btnTurkish)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(btnHindi)
        							
        							.addPreferredGap(ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
        							.addComponent(comment))
        						
        						.addGroup(jPanelmainLayout.createSequentialGroup()
        							.addGroup(jPanelmainLayout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addGroup(jPanelmainLayout.createSequentialGroup()
        									.addComponent(btnNewButton_1)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(btnNewButton_2))
        								.addComponent(JButtonCzeck))
        							.addPreferredGap(ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
        							.addGroup(jPanelmainLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(JButtonLeadComent, Alignment.TRAILING)
        								.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap())
        );
        jPanelmainLayout.setVerticalGroup(
        	jPanelmainLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelmainLayout.createSequentialGroup()
        			.addGap(15)
        			.addComponent(jLabelheadMain)
        			.addGap(48)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonClock)
        				.addComponent(jButtonTravel)
        				.addComponent(jButtonExpenses)
        				.addComponent(jButtonPost))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonGroup)
        				.addComponent(jButtonWOrkBoard)
        				.addComponent(jButtonCustomAp)
        				.addComponent(jButtonTask))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonProject)
        				.addComponent(jButtonLeadMana)
        				.addComponent(jButtonLead)
        				.addComponent(jButtonSchedule))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonForms)
        				.addComponent(jButtonPoll))
        			.addGap(52)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(lblNewLabel_1))
        			.addGap(18)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton_1)
        				.addComponent(btnNewButton_2)
        				.addComponent(JButtonLeadComent))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanelmainLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnTurkish)
        				.addComponent(btnHindi)
        				.addComponent(comment, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(JButtonCzeck)
        			.addContainerGap(180, Short.MAX_VALUE))
        );
        jPanelmain.setLayout(jPanelmainLayout);

        jTabbedPane1.addTab("Main", jPanelmain);

        jPanelHR.setBackground(new java.awt.Color(255, 255, 255));

        jLabelHeadHr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHeadHr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //*************************************************************************************************************************************************************************************************************
        
        //************************************************************************** HR Menu Lay-Out *****************************************************************************************************************
        jLabelHeadHr.setText("HR Menu");

        jButtonQuick.setText("Quick");

        jButtonwarning.setText("Warning");

        jButtonPromotion.setText("Promotion");

        jButtonEmployee.setText("Employee");
        
        jButtonCareers.setText("Careers");

        jButtonLeaves.setText("Leaves");

        jButtonComplain.setText("Complain");

        jButtonReward.setText("Reward");

        jButtonResignation.setText(" Resignation");

        jButtonSalary.setText("Salary");

        jButtonLoan.setText("Loans");
        
        jButtonBonus.setText("Bonus");
        
        jButtonAppraisal.setText("Appraisal");
        // ******************************************************************************************************************************************************************************************************
       
      //Quick Add 
        jButtonQuick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jTextArea1.setText("");
            	// Call your test case methods here
                quickadd_test testClass1 = new quickadd_test();
                getterMethodTextFile text = new getterMethodTextFile();
              
                try {
                	 int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	 //boolean result =testClass1.quickAddEmployee(inputValue1);
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.quickAddEmployee(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Word");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonQuick.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonQuick.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.quickAddEmployee(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonQuick.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonQuick.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
                	 
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });
       
        //Appraisal
        jButtonAppraisal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call your test case methods here
            	jTextArea1.setText("");

            	appraisalTest testClass1 = new appraisalTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
                             try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
    				//boolean result =testClass1.createPromotionTest(inputValue1);
    				 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.appraisalCreate(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonAppraisal.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonAppraisal.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.appraisalCreate(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"Mile Tap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonAppraisal.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonAppraisal.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
    				

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}

            }
        });
        
        // Promotion
        jButtonPromotion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call your test case methods here
            	jTextArea1.setText("");

            	promotion_Test testClass1 = new promotion_Test();
            	 getterMethodTextFile text = new getterMethodTextFile();
              
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
    				//boolean result =testClass1.createPromotionTest(inputValue1);
    				 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.createPromotionTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonPromotion.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonPromotion.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.createPromotionTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonPromotion.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonPromotion.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
    				

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}

            }
        });
       
        // warning 
        jButtonwarning.addActionListener(new ActionListener() {
     	   @Override
             public void actionPerformed(ActionEvent e) {
                 // Call your test case methods here
     		   jTextArea1.setText("");
             	warning_Test testClass1 = new warning_Test();
             	 getterMethodTextFile text = new getterMethodTextFile();
                
                 try {
                 	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
 					//boolean result = testClass1.createWarning(inputValue1);
 					 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.createWarning(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Word");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonwarning.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonwarning.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.createWarning(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonwarning.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonwarning.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
 				
 				} catch (InterruptedException e1) {
 					// TODO Auto-generated catch block
 					e1.printStackTrace();
 				
 				}
             }
         });
        
        // Bonus
        jButtonBonus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call your test case methods here
            	jTextArea1.setText("");
                bonus_Test testClass1 = new bonus_Test();
                getterMethodTextFile text = new getterMethodTextFile();
             
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
    			//boolean result =	testClass1.BonusCreation(inputValue1);
    			 if (jLabelWelcomName.getText().equals("Wise Work")) {
                     // If yes, pass additional parameters
                     boolean result = testClass1.BonusCreation(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                     if (result) {
 		                // Test passed, change the button color to green
                    	 jButtonBonus.setBackground(Color.GREEN);
 		            } else {
 		                // Test failed, change the button color to red (or any other color)
 		            	jButtonBonus.setBackground(Color.RED);
 		            }
                     updateResultLabel(result);
                 } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                 	  
                 	  boolean result = testClass1.BonusCreation(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                       if (result) {
    		                // Test passed, change the button color to green
                    	   jButtonBonus.setBackground(Color.GREEN);
    		            } else {
    		                // Test failed, change the button color to red (or any other color)
    		            	jButtonBonus.setBackground(Color.RED);
    		            	 updateResultLabel(result);
                   }
                   }
    			
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
                      }
        });
        
        // Complain
        jButtonComplain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call your test case methods here
            	jTextArea1.setText("");

                complain_Test testClass1 = new complain_Test();
                getterMethodTextFile text = new getterMethodTextFile();
            
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	//boolean result=testClass1.CreateComplainOff(inputValue1);
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.CreateComplainOff(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonComplain.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonComplain.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.CreateComplainOff(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonComplain.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonComplain.setBackground(Color.RED);
        		            	 updateResultLabel(result);
        		            }
                       }
                	

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });

        // Reward
        jButtonReward.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call your test case methods here
            	jTextArea1.setText("");
            	reward_Test testClass1 = new reward_Test();
            	 getterMethodTextFile text = new getterMethodTextFile();
              
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	//boolean result =testClass1.createRewardTest(inputValue1);
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.createRewardTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonReward.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonReward.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.createRewardTest(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonReward.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonReward.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
                	
    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            }
        });
        
        // leaves
        jButtonLeaves.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call your test case methods here
            	jTextArea1.setText("");

            	leaves_Test testClass1 = new leaves_Test();
            	 getterMethodTextFile text = new getterMethodTextFile();
               
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	//boolean result=testClass1.LeaveCreationcasual(inputValue1);
                	 if (jLabelWelcomName.getText().equals("Wise Work")) {
                         // If yes, pass additional parameters
                         boolean result = testClass1.LeaveCreationcasual(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                         if (result) {
     		                // Test passed, change the button color to green
                        	 jButtonLeaves.setBackground(Color.GREEN);
     		            } else {
     		                // Test failed, change the button color to red (or any other color)
     		            	jButtonLeaves.setBackground(Color.RED);
     		            }
                         updateResultLabel(result);
                     } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                     	  
                     	  boolean result = testClass1.LeaveCreationcasual(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                           if (result) {
        		                // Test passed, change the button color to green
                        	   jButtonLeaves.setBackground(Color.GREEN);
        		            } else {
        		                // Test failed, change the button color to red (or any other color)
        		            	jButtonLeaves.setBackground(Color.RED);
        		            	 updateResultLabel(result);
                       }
                       }
                	

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
            
            }
        });

        // Careers
        
        //Salary 
        jButtonSalary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Call your test case methods here
            	jTextArea1.setText("");

            	salary_test testClass1 = new salary_test();
            	 getterMethodTextFile text = new getterMethodTextFile();
               
                try {
                	
                	//boolean result=testClass1.loanCreate(inputValue1);
                	if (jLabelWelcomName.getText().equals("Wise Work")) {
                        // If yes, pass additional parameters
                        boolean result = testClass1.createSalaryTest(defaults.getrmployeeEmail(),defaults.getemployeepassword(),"Wise Work");
                        if (result) {
    		                // Test passed, change the button color to green
                        	jButtonSalary.setBackground(Color.GREEN);
    		            } else {
    		                // Test failed, change the button color to red (or any other color)
    		            	jButtonSalary.setBackground(Color.RED);
    		            }
                        updateResultLabel(result);
                    } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                    	  
                    	  boolean result = testClass1.createSalaryTest( defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword(),"miletap");
                          if (result) {
       		                // Test passed, change the button color to green
                        	  jButtonSalary.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonSalary.setBackground(Color.RED);
       		             updateResultLabel(result);
                      }
                      }
                	

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });
        
        //loan
        jButtonLoan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Call your test case methods here
            	jTextArea1.setText("");

            	loan_Test testClass1 = new loan_Test();
            	 getterMethodTextFile text = new getterMethodTextFile();
             
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	//boolean result=testClass1.loanCreate(inputValue1);
                	if (jLabelWelcomName.getText().equals("Wise Work")) {
                        // If yes, pass additional parameters
                        boolean result = testClass1.loanCreate(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                        if (result) {
    		                // Test passed, change the button color to green
                        	jButtonLoan.setBackground(Color.GREEN);
    		            } else {
    		                // Test failed, change the button color to red (or any other color)
    		            	jButtonLoan.setBackground(Color.RED);
    		            }
                        updateResultLabel(result);
                    } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                    	  
                    	  boolean result = testClass1.loanCreate(inputValue1, defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                          if (result) {
       		                // Test passed, change the button color to green
                        	  jButtonLoan.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonLoan.setBackground(Color.RED);
       		             updateResultLabel(result);
                      }
                      }
                	

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });

        // resignation
        jButtonResignation.addActionListener(new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Call your test case methods here
            	jTextArea1.setText("");

            	resignationTest testClass1 = new resignationTest();
            	 getterMethodTextFile text = new getterMethodTextFile();
               
                try {
                	int inputValue1 = Integer.parseInt(jTextFieldLoopValue.getText());
                	//boolean result=testClass1.loanCreate(inputValue1);
                	if (jLabelWelcomName.getText().equals("Wise Work")) {
                        // If yes, pass additional parameters
                        boolean result = testClass1.createResignationTest(inputValue1,defaults.getrmployeeEmail(),defaults.getemployeepassword());
                        if (result) {
    		                // Test passed, change the button color to green
                        	jButtonResignation.setBackground(Color.GREEN);
    		            } else {
    		                // Test failed, change the button color to red (or any other color)
    		            	jButtonResignation.setBackground(Color.RED);
    		            }
                        updateResultLabel(result);
                    } else if (jLabelWelcomName.getText().equals("Owais Shaikh")) {
                    	  
                    	  boolean result = testClass1.createResignationTest( inputValue1,defaults.getapproverWorkWiseEmail(),defaults.getapproverWorkWisePassword());
                          if (result) {
       		                // Test passed, change the button color to green
                        	  jButtonResignation.setBackground(Color.GREEN);
       		            } else {
       		                // Test failed, change the button color to red (or any other color)
       		            	jButtonResignation.setBackground(Color.RED);
       		             updateResultLabel(result);
                      }
                      }
                	

    			} catch (InterruptedException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			}
              
            }
        });
        

        javax.swing.GroupLayout jPanelHRLayout = new javax.swing.GroupLayout(jPanelHR);
        jPanelHR.setLayout(jPanelHRLayout);
        jPanelHRLayout.setHorizontalGroup(
            jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHeadHr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelHRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHRLayout.createSequentialGroup()
                        .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButtonQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelHRLayout.createSequentialGroup()
                                .addComponent(jButtonEmployee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPromotion))
                            .addGroup(jPanelHRLayout.createSequentialGroup()
                                .addComponent(jButtonReward, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCareers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanelHRLayout.createSequentialGroup()
                        .addComponent(jButtonSalary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonResignation, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonwarning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jButtonBonus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jButtonAppraisal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)

                        .addComponent(jButtonLeaves, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanelHRLayout.setVerticalGroup(
            jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHRLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelHeadHr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuick)
                    .addComponent(jButtonPromotion)
                    .addComponent(jButtonEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComplain)
                    .addComponent(jButtonReward)
                    .addComponent(jButtonCareers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalary)
                    .addComponent(jButtonLoan)
                    .addComponent(jButtonResignation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLeaves)
               // .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonwarning)
                .addComponent(jButtonBonus)
                .addComponent(jButtonAppraisal)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HR ", jPanelHR);

        jPanelFinance.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Finance Menu");

        jButton46.setText("Salary");

        jButton47.setText("PayRoll");

        jButton48.setText("Quotation");

        jButton49.setText("ChartOfAcc");

        jButton50.setText("Voucher");

        jButton51.setText("LedgerRe");

        javax.swing.GroupLayout jPanelFinanceLayout = new javax.swing.GroupLayout(jPanelFinance);
        jPanelFinance.setLayout(jPanelFinanceLayout);
        jPanelFinanceLayout.setHorizontalGroup(
            jPanelFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinanceLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelFinanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFinanceLayout.createSequentialGroup()
                        .addComponent(jButton46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton48)
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(jPanelFinanceLayout.createSequentialGroup()
                        .addGroup(jPanelFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelFinanceLayout.setVerticalGroup(
            jPanelFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFinanceLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanelFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton46)
                    .addComponent(jButton50)
                    .addComponent(jButton47)
                    .addComponent(jButton48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton49)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Finance", jPanelFinance);

        jPanelCustomCases.setBackground(new java.awt.Color(255, 255, 255));

        jLabelHeadCUstom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHeadCUstom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeadCUstom.setText("Custom Test Cases");

        jButtonSalaryBonus.setText("Salary-Bonus-Payroll");

        jButtonAdminAlow.setText("Admins-Allow-Salary");

        jButtonGroupTakPost.setText("Group-Task-Post");

        jButtonGroupTask.setText("Group-task");

        javax.swing.GroupLayout jPanelCustomCasesLayout = new javax.swing.GroupLayout(jPanelCustomCases);
        jPanelCustomCases.setLayout(jPanelCustomCasesLayout);
        jPanelCustomCasesLayout.setHorizontalGroup(
            jPanelCustomCasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHeadCUstom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCustomCasesLayout.createSequentialGroup()
                .addGroup(jPanelCustomCasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCustomCasesLayout.createSequentialGroup()
                        .addComponent(jButtonSalaryBonus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdminAlow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGroupTakPost))
                    .addComponent(jButtonGroupTask))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelCustomCasesLayout.setVerticalGroup(
            jPanelCustomCasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomCasesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelHeadCUstom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCustomCasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalaryBonus)
                    .addComponent(jButtonAdminAlow)
                    .addComponent(jButtonGroupTakPost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGroupTask)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Custom", jPanelCustomCases);

        jPanelNew.setBackground(new java.awt.Color(102, 102, 0));

        jLabelCOminSoon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCOminSoon.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCOminSoon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCOminSoon.setText("Coming Soon ");

        javax.swing.GroupLayout jPanelNewLayout = new javax.swing.GroupLayout(jPanelNew);
        jPanelNew.setLayout(jPanelNewLayout);
        jPanelNewLayout.setHorizontalGroup(
            jPanelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCOminSoon, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNewLayout.setVerticalGroup(
            jPanelNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelCOminSoon)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comi...", jPanelNew);

        jPanelResult.setBackground(new java.awt.Color(255, 255, 255));
        jPanelResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelResult.setMaximumSize(new java.awt.Dimension(32767, 2147483647));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        // -------------------------------------------------------------------------------------- Run All -------------------------------------------------------------------------------------
        jCheckBox1.setText("RunAll");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelWelcom.setText("Wellcome");

        jLabelDate.setText("Date");
              
        jLabelWelcomName.setText(" ");

        jLabelDetail.setText("Details");

        jLabelResult.setText("Result");

        jLabelProgress.setText("Progress");

        jButtonLogOut.setText("LogOut");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save");

        jLabelLoop.setText("Loop");

        jLabelTag.setText("Tags");
        // -----------------------------------------------------------------------------------------------dark / light mode ---------------------------------------------------------------
        JToggleButton mode = new JToggleButton("DarkMode");
        mode.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		   if (mode.isSelected()) {
                       // Button is toggled (selected)
                       
                    	   darkmode();
                         
                      
                      
                       
                   } else {
                       // Button is not toggled (not selected)
                       // You can perform additional actions if needed
                	   lightMode();
                   }
        	}
        });
        jTextArea2 = new javax.swing.JTextArea();
        
                jTextArea2.setColumns(20);
                jTextArea2.setRows(5);

        javax.swing.GroupLayout jPanelResultLayout = new javax.swing.GroupLayout(jPanelResult);
        jPanelResultLayout.setHorizontalGroup(
        	jPanelResultLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanelResultLayout.createSequentialGroup()
        			.addContainerGap(344, Short.MAX_VALUE)
        			.addComponent(jButtonSave)
        			.addGap(62))
        		.addGroup(jPanelResultLayout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
        					.addComponent(jButtonLogOut)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButtonBack))
        				.addComponent(jLabelProgress, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addComponent(jLabelDate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jLabelDateField, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addGroup(jPanelResultLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabelResult, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanelResultLayout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jTextArea2, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addComponent(jLabelWelcom, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabelWelcomName, GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addGroup(jPanelResultLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanelResultLayout.createSequentialGroup()
        							.addComponent(jLabelLoop, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jTextFieldLoopValue, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabelDetail, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
        					.addGroup(jPanelResultLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(mode, 0, 0, Short.MAX_VALUE)
        						.addComponent(jCheckBox1, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addComponent(jLabelTag, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldTagValue, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 299, Short.MAX_VALUE)))
        			.addGap(26))
        );
        jPanelResultLayout.setVerticalGroup(
        	jPanelResultLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanelResultLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelWelcom)
        				.addComponent(jLabelWelcomName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelDate)
        				.addComponent(jLabelDateField, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jCheckBox1)
        				.addComponent(jLabelLoop)
        				.addComponent(jTextFieldLoopValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addGroup(jPanelResultLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabelTag)
        						.addComponent(jTextFieldTagValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(19)
        					.addComponent(jLabelDetail))
        				.addComponent(mode))
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanelResultLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextArea2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanelResultLayout.createSequentialGroup()
        					.addGap(90)
        					.addComponent(jLabelResult, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabelProgress)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButtonSave)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanelResultLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonBack)
        				.addComponent(jButtonLogOut))
        			.addGap(14))
        );
        jPanelResult.setLayout(jPanelResultLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanelwellcom, GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
        			.addComponent(jPanelResult, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanelwellcom, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        		.addComponent(jPanelResult, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        
        jPanel1 = new JPanel();
        jPanel1.setBackground(Color.WHITE);
        jTabbedPane1.addTab("New tab", null, jPanel1, null);
        
        jLabel2 = new JLabel();
        jLabel2.setText("Work-Wise Modules");
        jLabel2.setFont(new Font("Segoe UI", Font.BOLD, 14));
        
        jButtonCustomCase = new JButton();
        jButtonCustomCase.setText("Custom Cases");
        
        jButtonComingSoon = new JButton();
        jButtonComingSoon.setText("Coming Soon");
        
        jButtonMainMenu = new JButton();
        jButtonMainMenu.setText("Main Menu");
        
        jButtonHrMenu = new JButton();
        jButtonHrMenu.setText("HR Menu");
        
        jButtonFinance = new JButton();
        jButtonFinance.setText("Finance Menu");
        GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
        gl_jPanel1.setHorizontalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 402, Short.MAX_VALUE)
        		.addGap(0, 402, Short.MAX_VALUE)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonCustomCase)
        				.addComponent(jButtonComingSoon)
        				.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(jButtonMainMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jButtonHrMenu, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jButtonFinance, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap(243, Short.MAX_VALUE))
        );
        gl_jPanel1.setVerticalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 538, Short.MAX_VALUE)
        		.addGap(0, 538, Short.MAX_VALUE)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addGap(97)
        			.addComponent(jLabel2)
        			.addGap(18)
        			.addComponent(jButtonMainMenu)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonHrMenu)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonFinance)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonCustomCase)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonComingSoon)
        			.addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel1.setLayout(gl_jPanel1);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
            showPanel2AndTabbedPane(); // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSubmitActionPerformed

   
	           
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
       jTabbedPane1.setSelectedIndex(0);
       jTextFieldLoopValue.setText("");
       jTextFieldTagValue.setText("");
       jTextArea1.setText("");
       jTextArea2.setText("");
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
           logOutPanel(); 
           jTextFieldLoopValue.setText("");
           jTextFieldTagValue.setText("");
           jTextArea1.setText("");
           jTextArea2.setText("");
           
           
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
      
       // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApplicationNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ApplicationNew().setVisible(true);
        });
    }
    public  void updateResultLabel(boolean result) {
    	
        if (result) {
        //	jTextArea1.setText("Pass");
        	 updateProgressBar(80);
        	 
        } else {
       // 	jTextArea1.setText("Fail");
        }
    }
    public void updateProgressBar(int value) {
    	value = Math.min(100, Math.max(10, value));

        // Set the progress value
        jProgressBar1.setValue(value);
    }
    public void settiingDate() {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format the date and time as a string
        String formattedDateTime = currentDateTime.toString();

        // Set the formatted date and time to the JLabel
        jLabelDateField.setText(formattedDateTime);
    }
    // error log handling
 
// 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButtonAdminAlow;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCareers;
    private javax.swing.JButton jButtonClock;
    private javax.swing.JButton jButtonComplain;
    private javax.swing.JButton jButtonCustomAp;
    private javax.swing.JButton jButtonEmployee;
    private javax.swing.JButton jButtonExpenses;
    private javax.swing.JButton jButtonForms;
    private javax.swing.JButton jButtonGroup;
    private javax.swing.JButton jButtonGroupTakPost;
    private javax.swing.JButton jButtonGroupTask;
    private javax.swing.JButton jButtonLead;
    private javax.swing.JButton jButtonLeadMana;
    private javax.swing.JButton jButtonLeaves;
    private javax.swing.JButton jButtonLoan;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonPost;
    private javax.swing.JButton jButtonProject;
    private javax.swing.JButton jButtonPromotion;
    private javax.swing.JButton jButtonQuick;
    private javax.swing.JButton jButtonResignation;
    private javax.swing.JButton jButtonReward;
    private javax.swing.JButton jButtonSalary;
    private javax.swing.JButton jButtonSalaryBonus;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSchedule;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonTask;
    private javax.swing.JButton jButtonTravel;
    private javax.swing.JButton jButtonWOrkBoard;
    private javax.swing.JButton jButtonwarning;
    private javax.swing.JButton jButtonBonus;
    private javax.swing.JButton jButtonAppraisal;

    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCOminSoon;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDateField;
    private javax.swing.JLabel jLabelDetail;
    private javax.swing.JLabel jLabelHeadCUstom;
    private javax.swing.JLabel jLabelHeadHr;
    private javax.swing.JLabel jLabelLoop;
    private javax.swing.JLabel jLabelProgress;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelTag;
    private javax.swing.JLabel jLabelWelcom;
    private javax.swing.JLabel jLabelWelcomName;
    private javax.swing.JLabel jLabelheadMain;
    private javax.swing.JPanel jPanelCustomCases;
    private javax.swing.JPanel jPanelFinance;
    private javax.swing.JPanel jPanelHR;
    private javax.swing.JPanel jPanelNew;
    private JLayeredPane jPanelResult;
    private javax.swing.JPanel jPanelmain;
    private javax.swing.JPanel jPanelwellcom;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldLoopValue;
    private javax.swing.JTextField jTextFieldTagValue;
    private JButton comment;
    private JButton JButtonCzeck;
    private JButton btnTurkish;
    private JButton btnHindi;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JPanel jPanel1;
    private JLabel jLabel2;
    private JButton jButtonCustomCase;
    private JButton jButtonComingSoon;
    private JButton jButtonMainMenu;
    private JButton jButtonHrMenu;
    private JButton jButtonFinance;
    private JButton jButtonPoll;
}
