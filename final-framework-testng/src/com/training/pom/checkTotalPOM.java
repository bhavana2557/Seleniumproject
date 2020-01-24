package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkTotalPOM {
	private WebDriver driver; 

	public checkTotalPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shop;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private 
     

}
