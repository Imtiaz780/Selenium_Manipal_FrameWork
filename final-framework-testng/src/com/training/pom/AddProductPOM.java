package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductPOM {
private WebDriver driver; 
	
	public AddProductPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	private WebElement moveToLogIn;
	
	@FindBy(xpath="")
	private WebElement clickLogIn;	
	
	@FindBy(id="input-email")
	private WebElement userName;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="")
	private WebElement clickSubmit;
	
	
	public void moveToLogIn() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToLogIn).build().perform();
	}
	
	public void moveToLogIn2() {
		Actions action = new Actions(driver);
		action.moveToElement(moveToLogIn).build().perform();
	}
	

}
