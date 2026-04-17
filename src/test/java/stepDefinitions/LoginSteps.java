package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
WebDriver driver;
@Given("user launches browser")
public void user_launches_browser() {
	driver =new ChromeDriver();
	driver.manage().window().maximize();
}
@When("user open login page")
public void user_open_login_page() {
driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&dsh=S1127579676%3A1776442872070102&ec=futura_exp_og_so_72776762_e&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AT1y2_UTIbNqd5_tWb3mruBUf8i6Tr4BDsmswTVuvhAV2MOY9y6HLHLz4j4_7gSjO3u1FM3_IS2f");	
}
@When("enter username and password")
public void enter_username_and_password() throws InterruptedException {
driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("test.keychain42@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();
Thread.sleep(7000);
driver.findElement(By.xpath("//input[@name=\"Passwd\"]")).sendKeys("test/a17");

}
@When("clicks login button")
public void clicks_login_button() {
	driver.findElement(By.xpath("//span[text()='Next']")).click();	
}
@Then("user should login successfully")
public void user_should_login_successfully() {
System.out.println("Login Passed");
driver.quit();
}
}
