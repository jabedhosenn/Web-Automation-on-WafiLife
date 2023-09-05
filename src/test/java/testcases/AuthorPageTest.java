package testcases;

import org.testng.annotations.Test;

import pages.AuthorPage;
import pages.HomePage;
import utilities.DriverSetup;

public class AuthorPageTest extends DriverSetup {
	
	HomePage homePage = new HomePage();
	AuthorPage authorPage = new AuthorPage();
	
	@Test
	public void authorPage() {
		getDriver().get(authorPage.AUTHOR_PAGE_URL1);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		authorPage.takeScreenShot("Author Page");
		
		authorPage.scrollIntoElement(authorPage.SCROLL_NEXT);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		authorPage.takeScreenShot("Next Page Numbers");
		


				
	}
	
	@Test
	public void clickNext() {
		getDriver().get(authorPage.AUTHOR_PAGE_URL1);
		authorPage.clickOnElement(authorPage.CLICK_NEXT_PAGE);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	authorPage.takeScreenShot("Next Page Numbers");
	}
	
	public void findAuthor() {
		getDriver().get(authorPage.AUTHOR_PAGE_URL1);
		authorPage.clickOnElement(authorPage.CLICK_FIND_AUTHOR);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		authorPage.takeScreenShot("Find Author");
	}

}
