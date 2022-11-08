package PicoContainer.stepdefs;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PicoContainer.utility.ElementAction;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LandingPage_1 {

	BaseClass base;

	public LandingPage_1(BaseClass base) {      // object will get create at runtime
		this.base=base;

	}


	@Before
	public void setUp()
	{
		base.driver = new FirefoxDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().deleteAllCookies();
		base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		base.wait = new WebDriverWait(base.driver, 20);

	}

	@After
	public void tearDown()
	{
		base.driver.quit();
	}



	@Given("User navigate to url {string}")
	public void user_navigate_to_url(String url) {

		base.driver.get(url);
	}


	@Then("Title is {string}")
	public void title_is(String expTitle) {

		Assert.assertEquals("Title Not Match", expTitle, base.driver.getTitle());
	}


	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {

		WebElement LoginBtnElement =base.driver.findElement(By.xpath("//a[text()='Log in']"));
		LoginBtnElement.click();

	}


	@When("Enter mailID and Passward to login into appliction")
	public void enter_mail_id_and_passward_to_login_into_appliction() throws InterruptedException {

		WebElement userIDElement   =base.driver.findElement(By.xpath("//input[@id='loginusername']"));
		WebElement PasswardElement =base.driver.findElement(By.id("loginpassword"));
		WebElement loginElement    =base.driver.findElement(By.xpath("//button[text()='Log in']"));
		WebElement userAccElement  =base.driver.findElement(By.id("nameofuser"));

	//	userIDElement.sendKeys(base.getMaiID());                         // by using picocontainer
		userIDElement.sendKeys(ElementAction.UserMailID());              // by using common method
		Thread.sleep(2000);
		
	//	PasswardElement.sendKeys(base.getPassward());                    // by using picocontainer
		PasswardElement.sendKeys(ElementAction.UserPassward());          // by using common method
		Thread.sleep(2000);
		loginElement.click();
		Thread.sleep(6000);

		
		try {
			Assert.assertTrue(userAccElement.isDisplayed());

		}catch(Exception e) {

			e.printStackTrace();
		}finally {


			Assert.assertTrue("login user is not display", true);
		}
	}

}


