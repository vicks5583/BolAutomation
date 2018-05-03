package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class ExperimentsClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
		  	dsl.launchBolwala();
		  	//dsl.launchGoogle();
	  }
	  
	  @Test
	  public void Test01_Verify_Bolwala_Title(){
		  dsl.experimentsclass.CheckBolwalaTitle();
	  }
	  
	 @Test
	 public void Test02_Get_All_The_Links() {
		 dsl.experimentsclass.getLinks();
	 }
	  	  
	  @AfterClass
	  public void afterClass() {
		  dsl.closeBrowser();
	  }
}
