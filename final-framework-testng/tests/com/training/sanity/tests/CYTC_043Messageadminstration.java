package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.MemberPaymentPOM;
import com.training.pom.MessageadminstrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC_043Messageadminstration {
	private WebDriver driver;
	private String baseUrl;
	private MessageadminstrationPOM MessPOM;
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
		MessPOM = new MessageadminstrationPOM(driver); 
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
	public void Messageadm() throws InterruptedException {
		MessPOM.enterusername("Dhwani");
		MessPOM.enterpassword();
		
		
		MessPOM.clicksubmit();
		MessPOM.clickpersonal();
		MessPOM.clickmessage();
		MessPOM.clicksubmit1();
		MessPOM.entersendto();
		MessPOM.entercat();
		MessPOM.entersubject("hello");
		MessPOM.enterbody("welcome");
		//Thread.sleep(3000);
		MessPOM.clicksubmit2();
		MessPOM.alert1();
		MessPOM.clicklogout();
		MessPOM.alert2();
		MessPOM.enterusername1("admin");
		MessPOM.enterpasssword1();
		
		MessPOM.clicksubmit();
		MessPOM.clickmess();
		MessPOM.clicksubmess();
		MessPOM.clickreadmess();
		
		String actual=driver.findElement(By.xpath("//td[@class='tdHeaderTable']")).getText();
		String expected="Message details";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		
	}

}
