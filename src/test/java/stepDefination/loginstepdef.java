package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import junit.framework.Assert;
import pages.Base;
import pages.loginpage;
import utils.constants;


public class loginstepdef extends Base {
	
	loginpage login ;
	WebDriver driver;
	
	public loginstepdef() {
		login = new loginpage();
		driver = Base.getDriver();
	}

@Given("Navigate to FitPeo website")
public void navigate_to_fit_peo_website() {
   driver.get(constants.getWebsite());
   driver.manage().window().maximize();
}

@Then("Navigate to Revenue calculator page")
public void navigate_to_revenue_calculator_page() throws InterruptedException {
    
	login.getRevenuepage().click();
	Thread.sleep(5000);
}



@Then("Scroll page till slider is visible")
public void Adjust_the_slider() {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,350)");
}

@Then("Adjust the value of slider to (.+)$")
public void adjut_the_value_slider(String val) throws InterruptedException {
	Actions action = new Actions(driver);
	WebElement slider = login.getSlider();
	action.dragAndDropBy(slider, 100, 0).build().perform();
}



@Then("set input value as (.+)$")
public void set_input_value(String val) throws InterruptedException {
	WebElement input = login.getInput();

	Actions action = new Actions(driver);
	for(int i =0 ; i<val.length();i++) {
		input.click();
		action.keyDown(Keys.BACK_SPACE).perform();
		action.keyUp(Keys.BACK_SPACE).perform();
		
	}
	
	Thread.sleep(5000);
	input.sendKeys(val);
}


@Then("Select checkboxes$")
public void select_checkboxes() throws InterruptedException {

	List<WebElement> box = login.getBoxes();
	
	
	for(WebElement e :box) {
		WebElement s = e.findElement(By.xpath("./p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt']"));

		System.out.println(s.getText());
		
		if(s.getText().contains("CPT-99091") || s.getText().contains("CPT-99453") || s.getText().contains("CPT-99454") || s.getText().contains("CPT-99474")) {
			
			e.findElement(By.xpath(".//input[@class='PrivateSwitchBase-input css-1m9pwf3']")).click();
		}
		
	}
	
}


@Then("Validate the total recurring reimbursment amount in the header of page$")
public void adjut_the_value_slider() throws InterruptedException {
	String actualRevenueValue = login.getRevenuevalue().getText();
	
	Assert.assertEquals(actualRevenueValue, constants.getExpectedRevenueValue());
}



@Then("Close the application$")
public void Close_the_application() throws InterruptedException {
	
	driver.close();
	driver.quit();
}



}
