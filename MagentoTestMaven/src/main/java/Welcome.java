

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	
	WebDriver driver;
	
	public Welcome(WebDriver driver) {
		this.driver=driver;

	PageFactory.initElements(driver,this);
}
	
	@FindBy(linkText="My Account")
	WebElement myAcct;
	
	
	public void clickOnMyAccount() {
		myAcct.click();
		
	}
	
	
	
	
	

}
