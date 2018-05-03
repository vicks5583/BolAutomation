package com.automation.Ui.Mobile;

import static org.testng.Assert.assertTrue;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.BaseClass.BaseUiMobile;

public class MobileAppTest_UI extends BaseUiMobile{
	AndroidDriver driver;

	public MobileAppTest_UI(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(id = "com.sec.android.app.popupcalculator:id/bt_02")
	private WebElement number1;
	
	@FindBy(id = "com.sec.android.app.popupcalculator:id/bt_add")
	private WebElement add;
	
	@FindBy(id = "com.sec.android.app.popupcalculator:id/bt_04")
	private WebElement number2;
	
	@FindBy(id = "com.sec.android.app.popupcalculator:id/bt_equal")
	private WebElement equal;
	
	@FindBy(id = "com.sec.android.app.popupcalculator:id/txtCalc")
	private WebElement editText;
	
	public void ClickNumber1() {
		number1.click();
		hardwait(2);
	}
	
	public void ClickAddOption() {
		add.click();
		hardwait(2);
	}
	
	public void ClickNumber2() {
		number2.click();
		hardwait(2);
	}
	
	public void ClickEqual() {
		equal.click();
		hardwait(2);
	}
	
	public void CheckEditText() {
		//locate the edit box of the calculator by using By.id()
		String actualString = editText.getText();
		//Check the calculated value on the edit box
		assertTrue(actualString.contains("6"), "String did not contain 6 as a result");
		System.out.println("Actual result after adding 2 + 4 is " +actualString);
	}
	
}
