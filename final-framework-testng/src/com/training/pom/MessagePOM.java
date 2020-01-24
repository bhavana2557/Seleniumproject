package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessagePOM {
	
private WebDriver driver; 
	
	public MessagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//span[@class='menuText'][contains(text(),'Messages')]")
	private WebElement message;
	
	@FindBy(xpath="//span[@class='subMenuText'][contains(text(),'Messages')]")
	private WebElement messagelink;
	
	@FindBy(xpath="//select[@id='messageBoxSelect']")
	private WebElement type;
	
	@FindBy(xpath="//input[@id='newButton']")
	private WebElement submit;
	
	@FindBy(xpath="//select[@id='sendToSelect']")
	private WebElement sendto;
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement member;
	
	@FindBy(xpath="//input[@id='memberName']")
	private WebElement membername;
	
	@FindBy(xpath="//input[@id='subjectText']")
	private WebElement subject;
	
	@FindBy(xpath="//iframe")
	private WebElement body;
	
	@FindBy(xpath="//table[@class='defaultTable']//input[@class='button']")
	private WebElement submit1;
	
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
	
	public void clickmessage(){
		this.message.click();
	}
	public void clickmessagelink(){
		this.messagelink.click();
	}
	public void selecttype(){
		 Select country = new Select(type);
			List<WebElement> list2 = country.getOptions();
			list2.get(0).click();

	}
	public void clicksubmit(){
		this.submit.click();
	}
	public void sendto(){
		 Select country = new Select(type);
			List<WebElement> list2 = country.getOptions();
			list2.get(1).click();

	}
	public void entermemberlogin(String name){
		this.member.sendKeys(name);
	}
	public void entermembername(String name1){
		this.membername.sendKeys(name1);
	}
	public void entersubject(String sub){
		this.subject.sendKeys(sub);
	}
	public void entertext(String text){
		this.body.sendKeys(text);
	}
    public void clicksub(){
    	this.submit1.click();
    }
    
    public void alert(){
    	 Alert alert1=driver.switchTo().alert();
    	alert1.accept();
    }
    
}
