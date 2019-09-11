package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdmin_CategoriesPOM {
	private WebDriver driver; 
	private Actions action;
	
	public LoginAdmin_CategoriesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-username")
	private WebElement userName;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//i[@class='fa fa-key']")
	private WebElement clickSubmit;
	
/*	@FindBy(css="li[id='menu-catalog']>a")
	private WebElement moveToCatalog;
	
	@FindBy(xpath="//*[@id = 'menu-catalog' and @class='active open']/ul/li[1]/a")
	private WebElement catagories;
*/
	
	@FindBy(css="li#menu-catalog>a>i")
	private WebElement menuCatalog;
	
	@FindBy(css="li#menu-catalog>ul>li>a")
	private WebElement Categories;
	
	
	public void sendUserName(String username){
		this.userName.sendKeys(username);
	}
	
	public void sendPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickSubmitBtn(){
		this.clickSubmit.click();
	}
	
	public void moveToCategories() {
		action = new Actions(driver);
		action.moveToElement(this.menuCatalog).click(this.Categories).build().perform();
	}
}
