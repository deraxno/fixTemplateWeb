package stepDef;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTopupaja extends env {
    @Given("I open topupaja")
    public void iOpenTopupaja() throws InterruptedException {
        driver.get("https://topupaja.id/admin/auth/login");
        Thread.sleep(2000);
    }

    @When("Input Username and password")
    public void inputUsernameAndPassword() {
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("81316260151");
        driver.findElement(By.name("password")).sendKeys("Welcome123!");
    }

    @And("Click login")
    public void clickLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@name='tombol']")).click();
        Thread.sleep(2000);
    }

    @Then("Showing admin dashboard")
    public void showingAdminDashboard() {
        driver.findElement(By.xpath("//*[contains(text(),'Login berhasil')]"));
        System.out.println("showing");
    }
}
