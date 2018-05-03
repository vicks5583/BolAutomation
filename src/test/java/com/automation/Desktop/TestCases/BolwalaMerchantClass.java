package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class BolwalaMerchantClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
		  	//dsl.launchBolwala();
		  	//dsl.launchGoogle();
		  	dsl.launchBolwalaMerchant();
	  }
	  
	  @Test
	 /* public void Test01_Verify_Bolwala_Logo() {
		  dsl.bolwalaclass.CheckBolwalaLogo();
	  }*/
	  
	  public void Test02_Verify_Bolwala_Title(){
		  dsl.bolwalaclass.CheckBolwalaTitle();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  dsl.closeBrowser();
	  }
}
