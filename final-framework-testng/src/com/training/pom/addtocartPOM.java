package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartPOM {
private WebDriver driver; 

public addtocartPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

@FindBy(id="Email")
private WebElement username;
@FindBy(name="Password")
private WebElement password;
@FindBy(xpath="//input[@class='button-1 login-button']")
private WebElement login;
@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Books')]")
private WebElement books;
@FindBy(xpath="//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
private WebElement addtocart;
@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
private WebElement shoppingcart;

public void enterusername(String name){
	this.username.sendKeys(name);
}
	public void enterpassword(String pass){
		this.password.sendKeys(pass);
		
	}
	public void clicklogin(){
		this.login.click();
	}
	public void clickbook(){
		this.books.click();
		
	}
	public void clickaddtocart(){
		this.addtocart.click();
	}
	public void clickshoppingcart(){
		this.shoppingcart.click();
	}
}
