package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLoanPOM {
private WebDriver driver; 


	
	public ManageLoanPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='menuText'][contains(text(),'Accounts')]")
		private WebElement Accounts; 
	 @FindBy(xpath="//span[contains(text(),'Manage Loans')]")
	 private WebElement manageloans;
	 @FindBy(xpath="//input[@id='memberUsername']")
	 private WebElement memberlogin;
	 @FindBy(xpath="//input[@class='button']")
	 private WebElement search;
	 @FindBy(xpath="//img[@class='details view']")
	 private WebElement view;
	 
	 @FindBy(id="cyclosUsername")
		private WebElement userName; 
		
		@FindBy(id="cyclosPassword")
		private WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginBtn; 
		
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
	 
	 public void clickaccount(){
		// this.Accounts.clear();
		 this.Accounts.click();
	 }
	 
	 public void clickmanageloan(){
		// this.manageloans.clear();
		 this.manageloans.click();
	 }
	
	 public void entermemberlogin(String enterlogin){
		// this.memberlogin.clear();
		 this.memberlogin.sendKeys(enterlogin);
	 }
	 
	 public void clicksearch(){
		// this.search.clear();
		 this.search.click();
	 }
     
	 public void clickview(){
		 //this.view.clear();
		 this.view.click();
	 }
}
