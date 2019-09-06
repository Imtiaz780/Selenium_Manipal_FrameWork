package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement moveToLogIn;
	
	@FindBy(xpath="//i[@class='fa fa-sign-in']")
	private WebElement clickLogIn;	
	
	@FindBy(id="input-email")
	private WebElement userName;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement clickSubmit;
	
	
	public void moveToLogIn() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToLogIn).build().perform();
	}
	
	public void clickLoginBtn(){
		clickLogIn.click();
	}
	
	public void sendUserName(String username){
		this.userName.sendKeys(username);
	}
	
	public void sendPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickSubmitBtn(){
		clickSubmit.click();
	}
}
