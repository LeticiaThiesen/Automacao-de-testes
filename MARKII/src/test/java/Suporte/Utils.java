package Suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {
    public WebDriver driver = ChromeBrowser.getDriver();

    protected void acessarAplicacao(String url){
        driver.navigate().to(url);
    }
    protected void preencherTxt(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    protected void clicarBtn(By by){
        driver.findElement(by).click();
    }

    protected void pegaElemento(){
    }
}
