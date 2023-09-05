package testcases;

import org.testng.annotations.Test;

import pages.BookDetailsPage;
import utilities.DriverSetup;

public class BookDetailsPageTest extends DriverSetup {
	
	BookDetailsPage bookDetailsPage = new BookDetailsPage();
	
	@Test
	public void bookDetail() {
		getDriver().get(bookDetailsPage.BOOK_DETAILS_PAGE_URL);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		bookDetailsPage.clickOnElement(bookDetailsPage.CLICK_BOOK);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		bookDetailsPage.takeScreenShot("Book Details");
	}
	
//	@Test
//	public void viewBookDEtail() {
//		getDriver().get(bookDetailsPage.BOOK_DETAILS_PAGE_URL);
//		bookDetailsPage.clickOnElement(bookDetailsPage.CLICK_BOOK);
//		try {
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}

}
