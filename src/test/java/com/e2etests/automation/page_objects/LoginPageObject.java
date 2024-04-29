package com.e2etests.automation.page_objects;

import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.Setup;

public class LoginPageObject {

	// Recherche des elements
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement title;

	@FindBy(how = How.XPATH, using = "//div[@class='error-message-container error']/h3")
	public static WebElement msgErreur;

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement btnmenu;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement btnlogout;
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	public static WebElement btnadd;

	public LoginPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	// Methode pour connecter au URL
	public void connectToApp() {
		Setup.getDriver().get("https://www.saucedemo.com/");
	}

	// Methode pour écrire username
	public void fillUsername1(String usr) {
		// Parmi les bonnes pratiques, il faut toujours vider case avant d'ecrire
		username.clear();
		username.sendKeys(usr);
	}

	// Methode pour écrire password
	public void fillPassword1(String pwd) {
		// Parmi les bonnes pratiques, il faut toujours vider case avant d'ecrire
		password.clear();
		password.sendKeys(pwd);
	}

	// Methode pour cliquer sur le bouton de connexion
	public void clickBtn1() {
		btnLogin.click();
	}

	public void clickBtn2() {
		btnmenu.click();
	}

	public void clickBtn3() {
		btnlogout.click();
		WebDriverWait wait=new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(btnlogout));
	}
	
	public void clickBtn4() {
		btnadd.click();
		
	}

	// Methode pour écrire username
	public void fillUsername(String usr) {
		// Parmi les bonnes pratiques, il faut toujours vider case avant d'ecrire
		username.clear();
		username.sendKeys(usr);
	}

	// Methode pour écrire password
	public void fillPassword(String pwd) {
		// Parmi les bonnes pratiques, il faut toujours vider case avant d'ecrire
		password.clear();
		password.sendKeys(pwd);
	}

	// Methode pour écrire password
	public void clickBtn() {
		
		btnLogin.click();
	}

	public static String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getBtnAddText() {
		// TODO Auto-generated method stub
		return null;
	}

}
