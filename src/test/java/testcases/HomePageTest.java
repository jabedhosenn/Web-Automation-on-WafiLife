package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.DriverSetup;

public class HomePageTest extends DriverSetup {
	
	HomePage homePage = new HomePage();
	
	@Test
	public void testAuthor() throws InterruptedException {
		getDriver().get(homePage.HOME_PAGE_URL);
		homePage.clickOnElement(homePage.CLICK_AUTHOR);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		homePage.takeScreenShot("Home Page");
	}

}
