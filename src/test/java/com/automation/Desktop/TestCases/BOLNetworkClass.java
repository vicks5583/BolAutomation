package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class BOLNetworkClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
		  	dsl.launchBOLNetwork();
	  }
	  
	  @Test
	  public void Test01_Verify_Bol_Network_Logo() {
		  dsl.bolnetworkclass.CheckBolNetworkLogo();
	  }
	  /*
	  @Test
	  public void Test02_Verify_Google_Search_Button() {
		  dsl.cubixclass.CheckGoogleSearchButton();
	  }
	  
	  @Test
	  public void Test03_Verify_Google_Feeling_Lucky_Button() {
		  dsl.cubixclass.CheckGoogleFeelingLuckyButton();
	  }
	  
	  @Test
	  public void Test04_Verify_Google_Field() {
		  dsl.cubixclass.CheckGoogleField();
	  }
	  
	  @Test
	  public void Test05_Type_In_Google_Field() {
		  dsl.cubixclass.EnterGoogleField();
	  }*/
	 /* 
	  @Test
	  public void Test06_Click_Lookup() {
		  dsl.cubixclass.ClickLookup();
	  }
	  
	  @Test
	  public void Test07_Verify_Search_results() {
		  dsl.cubixclass.CheckSearchResult();
	  }*/
	  
	  @AfterClass
	  public void afterClass() {
		  dsl.closeBrowser();
	  }
}
