package Vtiger.Vtiger.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Vtiger.Vtiger.utilities.Utilities;

public class LoginPage {
	// public Utilities driver;
	 public WebDriver Driver;
	public LoginPage(Utilities obj) {
		Driver= obj;
		PageFactory.initElements(Driver, this);
	}
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement loginBT;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutBT;
	
	
	public void enterUsername(String Udata) {
		username.sendKeys(Udata);
	}
	public void enterPassword(String Pdata) {
		password.sendKeys(Pdata);
	}
	public void clickOnLoginBT() {
		loginBT.click();
	}
	public void validLogin(String Udata,String Pdata) {
		 enterUsername(Udata);
		 enterPassword(Pdata);
		 clickOnLoginBT();
	}
	public void signOut() {
		signOutBT.click();
		
	}

}
