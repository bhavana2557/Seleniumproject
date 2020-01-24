package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ManageLoanPOM;
import com.training.pom.MemberPaymentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC_027MemberPayment {

	private WebDriver driver;
	private String baseUrl;
	private MemberPaymentPOM MemberPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		MemberPOM = new MemberPaymentPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void ManageLoan() throws InterruptedException {
		MemberPOM.sendUserName("admin");
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[1]")).click();
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[2]")).click();
		driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
		driver.findElement(By.xpath("//input[4]")).click();
		//loginPOM.sendPassword("1234");
		MemberPOM.clickLoginBtn(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MemberPOM.clickaccount();
		MemberPOM.clickmemberpayment();
		Thread.sleep(3000);
		MemberPOM.enterdetails("bhavana");
		Thread.sleep(3000);

		MemberPOM.enterdetail("bhavana");
		MemberPOM.enteramount("1000000");
		Thread.sleep(3000);
		MemberPOM.entertransction();
		MemberPOM.enterdes("system");
		Thread.sleep(3000);
		MemberPOM.clicksubmit();
		Thread.sleep(3000);
		MemberPOM.clicksubmit2();
		Thread.sleep(3000);

		String expected="Cyclos";
		String actual=driver.findElement(By.xpath("//td[@class='tdHeaderTable']")).getText();
		Assert.assertEquals(actual, expected);
		
		MemberPOM.clickback();
}
}
