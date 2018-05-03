package com.automation.mobile.app.TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.*;

import com.automation.DSLLib.DSLLibMobile;

	public class MobileAppTestClass {
		DSLLibMobile dslm;
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		dslm = new DSLLibMobile();
	}

	@Test
	public void Test01_Click_Number1() {
		dslm.mobileApp.ClickNumber1();
	}
	
	@Test
	public void Test02_Click_Add_Option() {
		dslm.mobileApp.ClickAddOption();
	}
	
	@Test
	public void Test03_Click_Number_2() {
		dslm.mobileApp.ClickNumber2();
	}
	
	@Test
	public void Test04_Click_Equal_Option() {
		dslm.mobileApp.ClickEqual();
	}
	
	@Test
	public void Test05_Verify_Text_In_Edit_Text() {
		dslm.mobileApp.CheckEditText();
	}

	@AfterClass
	public void teardown() {
		//close the app
		dslm.closeApp();
	}
}
