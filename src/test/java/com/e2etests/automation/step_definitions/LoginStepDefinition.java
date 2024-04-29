package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.LoginPageObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
private LoginPageObject loginPageObject;
public LoginStepDefinition () {
	loginPageObject=new LoginPageObject();
	
}
	@Given("J accede a l application SwagLabs")
	public void jAccedeALApplicationSwagLabs() {
		loginPageObject.connectToApp();
	}
	@When("Je saisi le username {string}")
	public void jeSaisiLeUsername(String string) {
		loginPageObject.fillUsername(string);
	}
	@When("Je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String string) {
		loginPageObject.fillPassword(string);
	}
	@When("Je clique sur le bouton de connexion")
	public void jeCliqueSurLeBoutonDeConnexion() {
		loginPageObject.clickBtn();
	}
	@Then("Je me redirige vers la page d acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String msg) 
	{
	    String titlePage=LoginPageObject.title.getText();
	    Assert.assertEquals(msg, titlePage);
	}
	
	 @And("Je clique sur menu de SwagLabs")
	    public void jeCliqueSurMenuDeSwagLabs() {
	        loginPageObject.clickBtn2();
	    }
	 @Then("Je clique sur le bouton Logout")
	    public void JecliquesurleboutonLogout() {
	        loginPageObject.clickBtn3();
	    }
	 @And("Je clique sur add to carte") 
	 public void jecliquesuraddtocarte() {
		 loginPageObject.clickBtn4();
	 }
	 String btnaddpage=LoginPageObject.btnadd.getText()
	 Assert.assertEquals(1, actualResult);
	 
	 
	}