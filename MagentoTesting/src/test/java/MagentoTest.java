
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MagentoTest {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	

	@Test
	public void positiveCredential() {			
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l=new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePwd("Welcome@123");
		l.clickLogin();
		
		
		Main m=new Main(driver);
			m.clickOnLogout();
	}

	/*@Test(priority=1)
	public void negativeCredential() {
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();

		Login l = new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePwd("Welcome@1234");
		l.clickLogin();

		Main m = new Main(driver);
		m.clickOnLogout();

	}*/
	
	

}
