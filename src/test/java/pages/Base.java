package pages;

import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	
	 static EdgeDriver driver = new EdgeDriver();

	public static EdgeDriver getDriver() {
		return driver;
	}
	
}
