

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
	WebDriver driver;
	public Main(WebDriver driver) {
		this.driver=driver;
	}
	
	By logout=By.linkText("Log Out");//has
	
	public void clickOnLogout(){
		driver.findElement(logout).click();
	}
	
	
	
	

}
