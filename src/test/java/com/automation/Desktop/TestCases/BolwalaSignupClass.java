package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class BolwalaSignupClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
		  	dsl.launchBolwala();
		  	//dsl.launchGoogle();
	  }
	  
	  @Test
	  public void Test01_Verify_Bolwala_Title(){
		  dsl.bolwalasignupclass.CheckBolwalaTitle();
	  }
	  
	  @Test
	  public void Test02_Click_CreateAnAccount_To_Redirect(){
		  dsl.bolwalasignupclass.ClickLinkForSignup();
	  }
	  
	  @Test
	  public void Test03_Fill_The_Form(){
		  dsl.bolwalasignupclass.FillTheForm();
	  }
	  
	  @Test
	  public void Test04_Submit_The_Form(){
		  dsl.bolwalasignupclass.ClickSignup();
	  }
	  
	 /* @Test
	  public void Test05_Verify_Signup(){
		  dsl.bolwalasignupclass.VerifySignup();
	  }*/
	  	  
	  @AfterClass
	  public void afterClass() {
		  dsl.closeBrowser();
	  }
}
