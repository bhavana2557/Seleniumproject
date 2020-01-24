package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ManageLoanPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ManageLoansTests {

	private WebDriver driver;
	private WebDriver driver1;
	private String baseUrl;
	private ManageLoanPOM ManagePOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	//@BeforeMethod
//	public void setUp() throws Exception {
		//driver = DriverFactory.getDriver(DriverNames.CHROME);
		//ManagePOM = new ManageLoanPOM(driver); 
		//baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		//DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		 //capabilities.setBrowserName("chrome");
		
			//capabilities.setPlatform(Platform.WINDOWS);
			 
			//driver=new RemoteWebDriver(new URL("http://172.23.102.9:5647/wd/hub"), capabilities);
			/*DesiredCapabilities capabilitiesf=DesiredCapabilities.firefox();
			 capabilitiesf.setBrowserName("firefox");
			 FirefoxOptions options=new FirefoxOptions();
			options.merge(capabilitiesf);
				capabilitiesf.setPlatform(Platform.WINDOWS);
				 
				driver=new RemoteWebDriver(new URL("http://172.24.96.21:4690/wd/hub"), capabilitiesf);
			ManagePOM = new ManageLoanPOM(driver); 
			baseUrl = properties.getProperty("baseURL");*/
		// open the browser 
		//driver.get(baseUrl);
	//}
	
	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();*/
	//}
	@Test
	public void ManageLoan() throws InterruptedException, MalformedURLException {
		baseUrl = properties.getProperty("baseURL");
		DesiredCapabilities capabilitiesf=DesiredCapabilities.firefox();
		 capabilitiesf.setBrowserName("firefox");
		 FirefoxOptions options=new FirefoxOptions();
		options.merge(capabilitiesf);
			capabilitiesf.setPlatform(Platform.WINDOWS);
			 
			driver1=new RemoteWebDriver(new URL("http://172.24.96.21:4690/wd/hub"), capabilitiesf);
		ManagePOM = new ManageLoanPOM(driver1); 
		//baseUrl = properties.getProperty("baseURL");
		driver1.get(baseUrl);
		ManagePOM.sendUserName("admin");
		driver1.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[1]")).click();
		driver1.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[2]")).click();
		driver1.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
		driver1.findElement(By.xpath("//input[4]")).click();
		//loginPOM.sendPassword("1234");
		ManagePOM.clickLoginBtn(); 
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//screenShot.captureScreenShot("First");
		ManagePOM.clickaccount();
		ManagePOM.clickmanageloan();
		Thread.sleep(3000);
		ManagePOM.entermemberlogin("Dhwani");
		ManagePOM.clicksearch();
		ManagePOM.clickview();
		
		String expected="Loan details";
		String actual=driver.findElement(By.xpath("//td[contains(text(),'Loan details')]")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
		
	}
}
