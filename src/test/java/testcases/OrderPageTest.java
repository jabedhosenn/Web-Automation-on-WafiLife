package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.BookDetailsPage;
import pages.CompleteOrderPage;
import pages.OrderPage;
import utilities.DriverSetup;


public class OrderPageTest extends DriverSetup {
	
	BookDetailsPage bookDetailsPage = new BookDetailsPage();
	OrderPage orderPage = new OrderPage();
	CompleteOrderPage completeOrderPage = new CompleteOrderPage();
	
	@Test
	public void orderTest() {
		getDriver().get(bookDetailsPage.BOOK_DETAILS_PAGE_URL);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		bookDetailsPage.takeScreenShot("Book Detail Page");
		
		bookDetailsPage.clickOnElement(bookDetailsPage.CLICK_BOOK);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		bookDetailsPage.takeScreenShot("Book Detail");
		
		orderPage.clickOnElement(orderPage.CLICK_ORDER_BUTTON);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		orderPage.takeScreenShot("Click Order");
		
		orderPage.clickOnElement(orderPage.COMPLETE_ORDER_BUTTON);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		orderPage.takeScreenShot("Complete Click Order");
		
		completeOrderPage.writeText(completeOrderPage.NAME_FIELD, "Jabed Hosen");
		completeOrderPage.writeText(completeOrderPage.PHONE_NO, "01512345678");
		completeOrderPage.writeText(completeOrderPage.PHONE_NO_2, "01512345678");
		completeOrderPage.writeText(completeOrderPage.EMAIL_FIELD, "abc@gmail.com");
		completeOrderPage.selectElementWithText(completeOrderPage.DISTRICT_BUTTON, "Tangail");
		Select select = new Select(getDriver().findElement(By.xpath("(//select[@id='billing_area'])[1]")));
		select.selectByVisibleText("গোপালপুর");
		completeOrderPage.writeText(completeOrderPage.ADDRESS_FIELD, "Bangladesh");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		completeOrderPage.takeScreenShot("Complete Fillup Form");
	}
	
}
