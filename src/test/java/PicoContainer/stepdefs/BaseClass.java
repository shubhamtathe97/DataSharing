package PicoContainer.stepdefs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.Scenario;

public class BaseClass {
	
	public WebDriver driver;
	public Scenario scn;
	public WebDriverWait wait;
	
	
	String maiID="tompeter@gmail.com"; // this data will get shaire among both the stef Defination file
	String Passward="tompeter@123";
	
	
	
	
	public String getMaiID() {
		return maiID;
	}
	
	public String getPassward() {
		return Passward;
	}
		
	
	public Scenario getScn() {
		return scn;
	}
	

	public WebDriverWait getWait() {
		return wait;
	}
	

	public WebDriver getDriver() {
		return driver;
	}	

}
