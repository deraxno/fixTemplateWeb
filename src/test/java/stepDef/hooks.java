package stepDef;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import org.openqa.selenium.chrome.ChromeDriver;

public class hooks extends env {
    @Before
    public void before(){
    System.setProperty("webdriver.chrome.driver","C:/Users/IMBA PC/IdeaProjects/AutomateWeb/driver/chromedriver.exe");
    driver = new ChromeDriver();
    }
    @After
    public void after(){
    driver.close();
    }
}
