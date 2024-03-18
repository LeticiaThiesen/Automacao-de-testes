package Suporte;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void before() {
        ChromeBrowser.initDriver();
        driver = ChromeBrowser.getDriver();
    }

    @After
    public void after() {
        driver.close();

    }

}
