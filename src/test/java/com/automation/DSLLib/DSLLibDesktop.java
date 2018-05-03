package com.automation.DSLLib;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.automation.Ui.Desktop.BOLNetworkClass_UI;
import com.automation.Ui.Desktop.BOLNewsClass_UI;
import com.automation.Ui.Desktop.BolwalaClass_UI;
import com.automation.Ui.Desktop.BolwalaCompleteFlowClass_UI;
import com.automation.Ui.Desktop.BolwalaMerchantClass_UI;
import com.automation.Ui.Desktop.BolwalaSignupClass_UI;
import com.automation.Ui.Desktop.ExperimentsClass_UI;
import com.automation.Ui.Desktop.WebTestClass_UI;
import com.automation.util.YamlReader;

public class DSLLibDesktop {

	public static String URL1 = "";
	public WebDriver driver;
	public static String browser = null;
	public static String user = null;
	protected static String setting;
	protected static String tier;
	protected static String accessCodeSheet;
	protected static HashMap<String, String> server;
	protected static DesiredCapabilities capabilities;
	public boolean baseURL = true;
	
	public WebTestClass_UI cubixclass;
	public ExperimentsClass_UI experimentsclass;
	public BOLNewsClass_UI bolnewsclass;
	public BOLNetworkClass_UI bolnetworkclass;
	public BolwalaClass_UI bolwalaclass;
	public BolwalaSignupClass_UI bolwalasignupclass;
	public BolwalaCompleteFlowClass_UI bolwalacompleteflowclass;
	public BolwalaMerchantClass_UI bolwalamerchantclass;
	
	public DSLLibDesktop() {
		_initObjects();
		setting = System.getProperty("server");
		Reporter.log("setting value is" + setting);
		browser = YamlReader.getYamlValue("browser");
		Reporter.log("=================================================================");
		Reporter.log("=================================================================");
		Reporter.log("[INFO]: test browser is ".toUpperCase() + " "
				+ browser.toUpperCase());
		Reporter.log("=================================================================");
		Reporter.log("=================================================================");
		if (setting == null) {
			setting = YamlReader.getYamlValue("CurrentServer");
		}
		capabilities = new DesiredCapabilities();
		startBrowser();
	}

	/**
	 * function to start the browser
	 * 
	 * @throws MalformedURLException
	 */

	@SuppressWarnings("static-access")
	public void startBrowser() {
		if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"ChromeDriverServer/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("firefox")
				|| browser.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("host is="
					+ YamlReader.getYamlValue("seleniumserverhost"));

			if (YamlReader.getYamlValue("seleniumserver").contains("local")) {
				System.setProperty("webdriver.chrome.driver",
						"ChromeDriverServer/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-extensions");
				options.addArguments("test-type");
				options.addArguments("start-maximized");
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(capabilities);
			}
			if (YamlReader.getYamlValue("seleniumserver").contains("remote")) {
				System.out.println("value is="
						+ YamlReader.getYamlValue("seleniumserverhost"));
				try {
					driver = new RemoteWebDriver(new URL(
							YamlReader.getYamlValue("seleniumserverhost")),
							capabilities.chrome());
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		}
		driver.manage()
				.timeouts()
				.implicitlyWait(
						Integer.parseInt(YamlReader.getData("timeOut")),
						TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		_initObjects();
	}

	@SuppressWarnings("unused")
	private WebDriver setRemoteDriver(Map<String, String> selConfig) {
		DesiredCapabilities cap = null;
		browser = "chrome";
		if (browser.equalsIgnoreCase("firefox")) {
			cap = DesiredCapabilities.firefox();
		} else if (browser.equalsIgnoreCase("chrome")) {
			cap = DesiredCapabilities.chrome();
		} else if (browser.equalsIgnoreCase("Safari")) {
			cap = DesiredCapabilities.safari();
		} else if ((browser.equalsIgnoreCase("ie"))
				|| (browser.equalsIgnoreCase("internetexplorer"))
				|| (browser.equalsIgnoreCase("internet explorer"))) {
			cap = DesiredCapabilities.internetExplorer();
		}
		String seleniuhubaddress = "http://10.161.129.122:4444/wd/hub";
		URL selserverhost = null;
		try {
			selserverhost = new URL(seleniuhubaddress);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		cap.setJavascriptEnabled(true);
		return new RemoteWebDriver(selserverhost, cap);
	}
	
	/**
	 * base url launchers
	 */
	public void launchCubixCo() {
		driver.get(YamlReader.getData("cubixUrl"));
	}
	
	public void launchGoogle() {
		driver.get(YamlReader.getData("googleUrl"));
	}
	
	public void launchBOLNews() {
		driver.get(YamlReader.getData("BOLNewsUrl"));
	}
	
	public void launchBOLNetwork() {
		driver.get(YamlReader.getData("BOLNetworkUrl"));
	}
	
	public void launchBolwala() {
		driver.get(YamlReader.getData("BolwalaUrl"));
	}
	
	public void launchBolwalaMerchant() {
		driver.get(YamlReader.getData("BolwalaMerchantUrl"));
	}
	
	/**
	 * function to initialize object
	 */
	private void _initObjects() {
		cubixclass = new WebTestClass_UI(driver);
		experimentsclass = new ExperimentsClass_UI(driver);
		bolnewsclass = new BOLNewsClass_UI(driver);
		bolnetworkclass = new BOLNetworkClass_UI(driver);
		bolwalaclass = new BolwalaClass_UI(driver);
		bolwalasignupclass = new BolwalaSignupClass_UI(driver);
		bolwalamerchantclass = new BolwalaMerchantClass_UI(driver);
		bolwalacompleteflowclass = new BolwalaCompleteFlowClass_UI(driver);
	}

	/**
	 * function to close the browser
	 */
	public void closeBrowser() {
		try {
			//driver.quit();
			driver.close();
		} catch (Exception e) {
		}
	}

	/**
	 * function to close the browser
	 */
	public void closeBrowserAgain() {
		driver.close();
	}

	public void launchSpecficUrl(String url) {
		driver.get(url);
	}
}
