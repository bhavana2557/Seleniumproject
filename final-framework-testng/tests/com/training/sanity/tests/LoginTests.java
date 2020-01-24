package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private static WebDriver driver;
	private String baseUrl;
	private String nodeurl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		 
	}

//	@BeforeMethod
	//public void setUp() throws Exception {
		
		
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//loginPOM = new LoginPOM(driver); 
	//	baseUrl = properties.getProperty("baseURL");
	//	nodeurl=" http://172.24.96.21:4690/wd/hub";
		//			loginPOM = new LoginPOM(driver); 
		//	screenShot = new ScreenShot(driver); 
		//	driver.get(baseUrl);
		 
	//}
	
	//@AfterMethod
//	public void tearDown() throws Exception {
		//Thread.sleep(1000);
	//	driver.quit();
	//}
	@Test
	public void validLoginTest() throws MalformedURLException  {

		
		//DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		// capabilities.setBrowserName("chrome");
		
			//capabilities.setPlatform(Platform.WINDOWS);
			 
			//driver=new RemoteWebDriver(new URL(nodeurl), capabilities);
		baseUrl = properties.getProperty("baseURL");
		nodeurl=" http://172.24.96.21:4690/wd/hub";
			DesiredCapabilities capabilities=DesiredCapabilities.chrome();
			 capabilities.setBrowserName("chrome");
			// FirefoxOptions options=new FirefoxOptions();
			//options.merge(capabilitiesf);
				capabilities.setPlatform(Platform.WINDOWS);
				 
				driver=new RemoteWebDriver(new URL(nodeurl), capabilities);
		
			//driver.get(baseUrl);
				//baseUrl = properties.getProperty("baseURL");
				//nodeurl=" http://172.24.96.21:4690/wd/hub";
							loginPOM = new LoginPOM(driver); 
					screenShot = new ScreenShot(driver); 
					//driver.get(baseUrl);
		driver.get(baseUrl);
		loginPOM.sendUserName("admin");
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[1]")).click();
		driver.findElement(By.xpath("//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal virtualKeyboardButtonHover']")).click();
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
		driver.findElement(By.xpath("//input[4]")).click();
		//loginPOM.sendPassword("1234");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
}
