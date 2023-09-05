package pages;

import org.openqa.selenium.By;

public class OrderPage extends BasePage {
	
	public String BOOK_DETAILS_PAGE_URL = "https://www.wafilife.com/cat/books/author/dr-abu-ameenah-bilal-philips/";
	public By CLICK_ORDER_BUTTON = By.xpath("(//button[@class='single_add_to_cart_button button alt '])[1]");
	public By COMPLETE_ORDER_BUTTON = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");

}
