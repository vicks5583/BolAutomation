package com.automation.DSLLib;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.automation.Ui.Mobile.MobileAppTest_UI;
import com.automation.Ui.Mobile.PeeSpot_SignUp_UI;
import com.automation.Ui.Mobile.PeeSpots_Login_UI;

public class DSLLibMobile {
	
	public AndroidDriver driver;
	public MobileAppTest_UI mobileApp;
	public PeeSpot_SignUp_UI peespotSignUp;
	public PeeSpots_Login_UI peespotLogin;
	
	public DSLLibMobile() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//For Samsung
		/*
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "5.1.1"); 
		capabilities.setCapability("deviceName","21015340906ea24a");
		capabilities.setCapability("platformName","Android");
	    capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	    // This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
		//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
	    */
		
		//For Nexus 5
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0.1"); 
		capabilities.setCapability("deviceName","068ebe3400514f95");
		capabilities.setCapability("platformName","Android");
	    capabilities.setCapability("appPackage", "com.peespots");
	    // This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","com.peespots.SplashActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		//Create RemoteWebDriver instance and connect to the Appium server
		//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		
		
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    _initObjects();
	}
	
	private void _initObjects() {
		mobileApp = new MobileAppTest_UI(driver);
		peespotSignUp = new PeeSpot_SignUp_UI(driver);
		peespotLogin = new PeeSpots_Login_UI(driver);
	}
	
	public void closeApp() {
		try {
			driver.quit();
		} catch (Exception e) {
		}
	}
}
