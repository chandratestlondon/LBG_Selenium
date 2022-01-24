package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.LBG.base.TestBaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination extends TestBaseClass {
		
	public stepDefination()
	{
		super();	 
		Initilization();
	
	}

	@Given("User landing on login page")
	public void user_landing_on_login_page() {
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	 @When("^User enters (.+) and (.+)$")
	public void user_enters_and(String string1, String string2) {
		driver.findElement(By.id("txtUsername")).sendKeys(string1);
		driver.findElement(By.id("txtPassword")).sendKeys(string2);
	}
	
	@And("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
		String ele = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")).getText();
		System.out.println(ele);
		System.out.println("Bhirud");
		driver.close();

		}
	
	@And("Dashboard is displayed")
    public void dashboard_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
		String ele = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")).getText();
		System.out.println(ele);
		driver.close();
    }

	
	
	
}
