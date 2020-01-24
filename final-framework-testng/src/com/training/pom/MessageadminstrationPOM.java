package com.training.pom;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MessageadminstrationPOM {
private WebDriver driver; 


	
	public MessageadminstrationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='cyclosUsername']")
	private WebElement username;

     @FindBy(xpath="//input[@id='cyclosPassword']")
     private WebElement password;
     
     @FindBy(xpath="//input[@type='submit']")
     private WebElement submit;
     
     @FindBy(xpath="//span[contains(text(),'Personal')]")
     private WebElement per;
     
     @FindBy(xpath="//span[contains(text(),'Messages')]")
     private WebElement message;

     
    @FindBy(xpath="//input[@id='newButton']")
    private WebElement submit1;

    @FindBy(xpath="//select[@id='sendToSelect']")
    private WebElement sendto;
    
    @FindBy(xpath="//select[@id='categorySelect']")
    private WebElement category;
    
    @FindBy(xpath="//input[@id='subjectText']")
    private WebElement sub;
    
    @FindBy(xpath="//iframe")
    private WebElement body;
    
    @FindBy(xpath="//table[@class='defaultTable']//input[@class='button']")
    private WebElement submit2;
    
    @FindBy(xpath="//span[contains(text(),'Logout')]")
    private WebElement logout;
    
    @FindBy(xpath="//span[@class='menuText'][contains(text(),'Messages')]")
    private WebElement message1;
    
    @FindBy(xpath="//span[@class='subMenuText'][contains(text(),'Messages')]")
    private WebElement submess;
    
    @FindBy(xpath="//a[contains(text(),'hello')]")
    private WebElement readmess;
     
    public void enterusername(String name){
    	 this.username.sendKeys(name);
     }
     public void enterpassword(){
    	
 		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
 		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click();
 		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click(); 
 		driver.findElement(By.xpath("//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click();
 		}
     public void clicksubmit(){
    	 this.submit.click();
     }
     public void clickpersonal(){
    	 this.per.click();
     }
     public void clickmessage(){
    	 this.message.click();
     }
     public void clicksubmit1(){
    	 this.submit1.click();
     }
     public void entersendto(){
    	 Select send = new Select(sendto);
			List<WebElement> list1 = send.getOptions();
			list1.get(1).click();

     }
     public void entercat(){
    	 Select cat=new Select(category);
    	 List<WebElement> list2=cat.getOptions();
    	 list2.get(3).click();
     }
    public void entersubject(String subject){
    	this.sub.sendKeys(subject);
    }
    
    public void enterbody(String name){
    	this.body.sendKeys(name);
    }
    public void clicksubmit2(){
    	this.submit2.click();
    }
   public void alert1(){
	   Alert alert1=driver.switchTo().alert();
   	alert1.accept();
   }
   public void clicklogout(){
	   this.logout.click();
   }
   public void alert2(){
	   Alert alert2=driver.switchTo().alert();
	   alert2.accept();
   }
   public void enterusername1(String name){
	   this.username.sendKeys(name);
   }
   public void enterpasssword1(){
	   driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click(); 
		driver.findElement(By.xpath("//input[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click();
   }
   public void clickmess(){
	   this.message1.click();
   }
   public void clicksubmess(){
	   this.submess.click();
   }
   public void clickreadmess(){
	   this.readmess.click();
   }









}
