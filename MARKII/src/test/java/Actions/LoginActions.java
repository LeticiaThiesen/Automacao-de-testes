package Actions;

import ElementsMap.LoginElementsMap;
import ElementsMap.VitrineElementsMap;
import Suporte.ChromeBrowser;
import Suporte.Utils;
import org.openqa.selenium.WebDriver;

public class LoginActions extends Utils {
    public WebDriver driver = ChromeBrowser.getDriver();
    LoginElementsMap loginElementsMap = new LoginElementsMap();

    public void acessarAplicacao(){
        acessarAplicacao("https://www.saucedemo.com/");
    }
    public void preencherTxtUsername(String text) {
        preencherTxt(loginElementsMap.txtUsername,text);
    }

    public void preencherTxtPassword(String text) {
        preencherTxt(loginElementsMap.txtPassword,text);
    }

    public void clicarBtnLogin(){
        clicarBtn(loginElementsMap.btnLogin);
    }

    public void clicarBtnItem(){
        clicarBtn(VitrineElementsMap.btnItem);
    }

    public void clicarBtnCarrinho(){
        clicarBtn(VitrineElementsMap.btnCarrinho);
    }

    public void clicarBtnCheckout(){
        clicarBtn(VitrineElementsMap.btnCheckout);
    }

    public void preencherTxtFirstName(String text) {
        preencherTxt(VitrineElementsMap.txtFirstName,text);
    }

    public void preencherTxtLastName(String text) {
        preencherTxt(VitrineElementsMap.txtLastName,text);
    }

    public void preencherTxtZipCode(String text) {
        preencherTxt(VitrineElementsMap.txtZipCode,text);
    }

    public void clicarBtnContinue(){
        clicarBtn(VitrineElementsMap.btnContinue);
    }

    public void clicarBtnFinish(){
        clicarBtn(VitrineElementsMap.btnFinish);
    }
}
