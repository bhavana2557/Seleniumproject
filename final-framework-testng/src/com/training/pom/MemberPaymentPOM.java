package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MemberPaymentPOM {
private WebDriver driver; 


	
	public MemberPaymentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='menuText'][contains(text(),'Accounts')]")
	private WebElement Accounts; 
	
	@FindBy(xpath="//span[contains(text(),'Member Payment')]")
	private WebElement MemberPayment;
	
	@FindBy(xpath="//input[@id='memberUsername' and @class='large']")
	private WebElement loginuser;
	
	@FindBy(xpath="//input[@id='memberName']")
	private WebElement username1;
	
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement amount;
	
	@FindBy(xpath="//select[@id='type']")
	private WebElement type;
	
	@FindBy(id="description")
	private WebElement des;
	
	@FindBy(id="submitButton")
	private WebElement submit;
	
	@FindBy(xpath="//table[@class='defaultTable']//input[@class='button']")
	private WebElement submit2;
	
	 @FindBy(id="cyclosUsername")
		private WebElement userName; 
		
		@FindBy(id="cyclosPassword")
		private WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginBtn; 
		
		@FindBy(xpath="//input[@id='btn']")
		private WebElement back;
		
		
		
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
	 
	 public void clickmemberpayment(){
		 this.MemberPayment.click();
	 }
	 
	 public void enterdetail(String name2){
		 this.username1.sendKeys(name2);
	 }
	 public void enterdetails(String name){
		 this.loginuser.sendKeys(name);
	 }
   
	 public void enteramount(String amu){
		 this.amount.sendKeys(amu);
	 }
	 
	 public void entertransction(){
		 Select country = new Select(type);
			List<WebElement> list2 = country.getOptions();
			list2.get(0).click();

	 }
	 
	 public void enterdes(String des){
		 this.des.sendKeys(des);
	 }
	 
	 public void clicksubmit(){
		 this.submit.click();
	 }
	 
	 public void clicksubmit2(){
		 this.submit2.click();
	 }
	 public void clickback(){
		 this.back.click();
	 }
}
