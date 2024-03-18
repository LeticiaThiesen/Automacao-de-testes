package ElementsMap;

import org.openqa.selenium.By;

public class LoginElementsMap {

	public By txtUsername = By.id("user-name");
	public By txtPassword = By.id("password");
	public By txtPasswordCss = By.cssSelector("#password");
	public By btnLogin = By.cssSelector("#login-button");
	public By btnLoginId = By.id("login-button");
	public By btnLoginXpath = By.xpath("//*[@data-test=\"login-button\"]");

}
