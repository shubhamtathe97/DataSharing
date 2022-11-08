package PicoContainer.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "classpath:feature",  
		glue     ="PicoContainer.stepdefs", 
		tags     ="",                     
		plugin   = {"pretty",             
				"html:target/html/htmlreport.html",
				"json:target/json/jsonreport.json"
	        },
		monochrome=true,
		publish   =true,
		dryRun    =false                
		)

public class TestRunner {

}
