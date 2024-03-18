package Steps;

import Actions.LoginActions;
import Suporte.ChromeBrowser;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ElementsMap.LoginElementsMap;
import ElementsMap.VitrineElementsMap;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends LoginActions {
	private WebDriver driver= ChromeBrowser.getDriver();
	
	LoginElementsMap loginElementsMap = new LoginElementsMap();
	VitrineElementsMap vitrineElementsMap = new VitrineElementsMap();

	
	@Given("acessar a aplicacao")
	public void acessar_a_aplicacao() {
		acessarAplicacao();

	}

	@When("preencher o campo Username com o valor: {string}")
	public void preencher_o_campo_username(String username) throws InterruptedException {
//	  driver.findElement(loginElementsMap.txtUsername).sendKeys("standard_user");
		preencherTxtUsername(username);

	}

	@When("preencher o campo Password com o valor: {string}")
	public void preencher_o_campo_password(String password) throws InterruptedException {
//		driver.findElement(loginElementsMap.txtPassword).sendKeys("secret_sauce");
		preencherTxtPassword(password);
	}

	@When("clicar no botao Login")
	public void clicar_no_botao_login() throws InterruptedException {
//		driver.findElement(loginElementsMap.btnLogin).click();
		clicarBtnLogin();
		Thread.sleep(2000);
	}

	@When("adiciono o primeiro item ao carrinho")
	public void adiciono_item_carrinho() throws InterruptedException {

		clicarBtnItem();
		Thread.sleep(2000);
	}

	@When("clico no icon do carrinho")
	public void clico_no_icon_do_carrinho() throws InterruptedException {

		clicarBtnCarrinho();
		Thread.sleep(2000);
	}

	@When("clico no botao checkout")
	public void clico_no_botao_checkout() throws InterruptedException {

		clicarBtnCheckout();
		Thread.sleep(2000);
	}

	@When("preencho o campo Firstname com: {string}")
	public void preencho_o_campo_Firstname_com(String firstname) throws InterruptedException {
		preencherTxtFirstName(firstname);
		Thread.sleep(2000);
	}

	@When("preencho o campo LastName com: {string}")
	public void preencho_o_campo_Lastname_com(String lastname) throws InterruptedException {
		preencherTxtLastName(lastname);
		Thread.sleep(2000);
	}

	@When("preencho o campo Zip Code com: {string}")
	public void preencho_o_campo_Zip_Code_com(String zipcode) throws InterruptedException {
		preencherTxtZipCode(zipcode);
		Thread.sleep(2000);
	}

	@When("clicar no botao continue")
	public void clicar_no_botao_continue() throws InterruptedException {

		clicarBtnContinue();
		Thread.sleep(2000);
	}

	@When("clicar no botao finish")
	public void clicar_no_botao_finish() throws InterruptedException {

		clicarBtnFinish();
		Thread.sleep(2000);
	}

	@Then("titulo da mensagem deve estar correto")
	public void titulo_da_mensagem_deve_estar_correto() {
		String name = driver.findElement(vitrineElementsMap.lblTitleP).getText();
		Assert.assertEquals(name, "Thank you for your order!");

	}

	@Then("subtitulo da mensagem deve estar correto")
	public void subtitulo_da_mensagem_deve_estar_correto() {
		String name = driver.findElement(vitrineElementsMap.lblSubTitle).getText();
		Assert.assertEquals(name, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");

	}

	@Then("titulo da pagina deve estar correto")
	public void titulo_da_pagina_deve_estar_correto() {
		String name = driver.findElement(vitrineElementsMap.lblTitle).getText();
		Assert.assertEquals(name, "Checkout: Complete!");

	}

//	@Then("devo acessar o site")
//	public void devo_acessar_o_site() {
//		String name = driver.findElement(vitrineElementsMap.lblTitle).getText();
//		Assert.assertEquals(name, "Products");

//	}
	

}
