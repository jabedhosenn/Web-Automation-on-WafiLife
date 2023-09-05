package testcases;

import org.testng.annotations.Test;

import pages.AuthorPage;
import pages.SelectAuthorPage;
import utilities.DriverSetup;

public class SelectAuthorPageTest extends DriverSetup {
	
	AuthorPage authorPage = new AuthorPage();
	SelectAuthorPage selectAuthorPage = new SelectAuthorPage();
	
	@Test
	public void authorPage() {
		getDriver().get(authorPage.AUTHOR_PAGE_URL1);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		authorPage.takeScreenShot("Author Page");
		selectAuthorPage.clickOnElement(selectAuthorPage.SELECT_AUTHOR);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		selectAuthorPage.takeScreenShot("Select Author");
	}
	
}
