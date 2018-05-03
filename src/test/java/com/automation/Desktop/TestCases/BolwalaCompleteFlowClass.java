package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class BolwalaCompleteFlowClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
		  	dsl.launchBolwala();
		  	//dsl.launchGoogle();
	  }
	  
	  @Test
	  public void Test01_Verify_Bolwala_Title(){
		  dsl.bolwalacompleteflowclass.CheckBolwalaTitle();
	  }
	  
	  @Test
	  public void Test02_Click_CreateAnAccount_To_Redirect(){
		  dsl.bolwalacompleteflowclass.ClickLinkForSignup();
	  }
	  
	  @Test
	  public void Test03_Fill_The_Form(){
		  dsl.bolwalacompleteflowclass.FillTheForm();
	  }
	  
	  @Test
	  public void Test04_Submit_The_Form(){
		  dsl.bolwalacompleteflowclass.ClickSignup();
	  }
	  
	  @Test
	  public void Test05_Redirect_To_My_Account(){
		  dsl.bolwalacompleteflowclass.ClickUserName();
		  dsl.bolwalacompleteflowclass.ClickMyAccount();
	  }
	  
	  @Test
	  public void Test06_Verify_User_Pin_Code(){
		  dsl.bolwalacompleteflowclass.GetPinNumberAndVerify();
	  }
	  	  
	  @AfterClass
	  public void afterClass() {
		  dsl.closeBrowser();
	  }
}
