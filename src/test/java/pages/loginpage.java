package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage extends Base{
	
	WebDriver driver;
	public loginpage() {
		driver = Base.getDriver();
	}

	
	public  WebElement getRevenuepage() {
		return  driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[6]/a/div"));
		
	}

	public WebElement getSlider() {
		return  driver.findElement(By.xpath("//*[@class=\"MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh\"]"));	}

	public WebElement getInput() {
		return  driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));	}

	public List<WebElement> getBoxes() {
		return  driver.findElements(By.xpath("//*[@class=\"MuiBox-root css-1eynrej\"]"));	}
	
	public WebElement getRevenuevalue() {
		return driver.findElement(By.xpath("//*[@class='MuiBox-root css-m1khva']/p[2]"));
	}
}
