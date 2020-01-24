package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatisticalAnalysisPOM {

private WebDriver driver; 
	
	public  StatisticalAnalysisPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//span[contains(text(),'Reports')]")
	private WebElement report;
	
	@FindBy(xpath="//span[contains(text(),'Statistical analysis')]")
	private WebElement statan;
	
	@FindBy(xpath="//tr[1]//td[2]//input[1]")
	private WebElement key;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void clickreport(){
		this.report.click();
	}
	public void clicksa(){
		this.statan.click();
	}
	public void clicksubmitkey(){
		this.key.click();
	}
	
}
