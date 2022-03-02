package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import com.LBG.base.TestBaseClass;
import com.LBG.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations extends TestBaseClass {
	
	public LoginPage LP;
		
	public stepDefinations()
	{
		super();	 
		Initilization();
		LP = new LoginPage();
			}

	@Given("User landing on login page")
	public void user_landing_on_login_page() {
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     System.out.println("New branch pull request");
	     System.out.println("New branch pull request by Minakshi from another laptop");     
	   
	}

	 @When("^User enters (.+) and (.+)$")
	public void user_enters_and(String string1, String string2) {
		LP.login(string1, string2);
	}
	
	@And("Click on login button")
	public void click_on_login_button() {
		LP.clickLogin();
		System.out.println("Login button1 is clicked..");
	     
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() throws InterruptedException {
		Thread.sleep(3000);
		String ele = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")).getText();
		System.out.println(ele);
		System.out.println("CI/CD1");
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
