package com.automation.Desktop.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.automation.DSLLib.DSLLibDesktop;

public class BOLNewsClass {
	
	  DSLLibDesktop dsl;
  
	  @BeforeClass
	  public void beforeClass() {
		  	dsl = new DSLLibDesktop();
			//dsl.launchCubixCo();
		  	dsl.launchBOLNews();
	  }
	  
	 /* @Test
	  public void Test01_Wait_And_Close_BOL_News_Tutorial() {
		  
		  dsl.bolnewsclass.WaitAndCloseTutorial();
	  }
	  
	  @Test
	  public void Test01_Verify_BOL_News_Logo() {
		  dsl.bolnewsclass.CheckBolNewsLogo();
	  }
	  
	  @Test
	  public void Test02_Verify_BOL_News_Search_Field() {
		  dsl.bolnewsclass.CheckBolNewsSearchField();
	  }*/
	  
	  /*@Test
	  public void Test03_Verify_Google_Feeling_Lucky_Button() {
		  dsl.bolnewsclass.CheckGoogleFeelingLuckyButton();
	  }
	  
	  @Test
	  public void Test04_Verify_Google_Field() {
		  dsl.bolnewsclass.CheckGoogleField();
	  }
	  
	  @Test
	  public void Test05_Type_In_Google_Field() {
		  dsl.bolnewsclass.EnterGoogleField();
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
