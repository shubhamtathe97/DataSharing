package PicoContainer.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PicoContainer.utility.ElementAction;
import io.cucumber.java.en.Then;

public class LandingPage_2 {
	
	BaseClass base;

	public LandingPage_2(BaseClass base) {                           // object will get create at runtime
		this.base=base;

	}
	
	
	@Then("varify the user mailID as a credentials and it's must be match")
	public void varify_the_user_mail_id_as_a_credentials_and_it_s_must_be_match() throws InterruptedException {

		WebElement credentialElement=base.driver.findElement(By.xpath("//a[@id='nameofuser']"));
		
		String Actual=credentialElement.getText();
		
	//	Assert.assertTrue("Crediantial did not match", Actual.contains(base.getMaiID()));                   // by using picocontainer
		Assert.assertTrue("Crediantial did not match", Actual.contains(ElementAction.UserMailID()));        // by using common method
		
	}


}
