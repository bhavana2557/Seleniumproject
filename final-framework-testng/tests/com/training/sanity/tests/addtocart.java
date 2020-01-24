package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ManageLoanPOM;
import com.training.pom.addtocartPOM;

public class addtocart {
	private WebDriver driver;
	private WebDriver driver1;
	private String baseUrl;
	private addtocartPOM addPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	 @Test
	 public void verifylogin() throws MalformedURLException{
		 DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		 capabilities.setBrowserName("chrome");
		 //capabilities.setBrowserName("firefox");
		 capabilities.setPlatform(Platform.WINDOWS);
		 
		 driver=new RemoteWebDriver(new URL("http://172.23.102.5:7490/wd/hub"), capabilities);
		 addPOM=new addtocartPOM(driver);
		 driver.get("http://demowebshop.tricentis.com/login");
		// baseUrl="http://demowebshop.tricentis.com/login";
		 addPOM.enterusername("rekhabr1@gmail.com");
		 addPOM.enterpassword("rekhab");
		 addPOM.clicklogin();
		 addPOM.clickbook();
		 addPOM.clickaddtocart();
		 addPOM.clickshoppingcart();
		
		 String actual=driver.findElement(By.xpath("//a[@class='product-name']")).getText();
		 String expected="Computing and Internet";
		 Assert.assertEquals(actual, expected);
		 
	 }
}
