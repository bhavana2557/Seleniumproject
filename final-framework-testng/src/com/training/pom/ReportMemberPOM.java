package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportMemberPOM {
private WebDriver driver; 
	
	public ReportMemberPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//span[contains(text(),'Member lists')]")
	private WebElement memberlist;
	
	@FindBy(xpath="//input[@id='selectAllButton']")
	private WebElement selectall;
	
	@FindBy(xpath="//input[@id='printReportButton']")
	private WebElement printreport;
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
	
	public void clickmember(){
		this.memberlist.click();
	}
	public void clickselectall(){
		this.selectall.click();
	}
	public void printreport(){
		this.printreport.click();
	}

}
