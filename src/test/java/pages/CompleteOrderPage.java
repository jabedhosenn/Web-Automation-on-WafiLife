package pages;

import org.openqa.selenium.By;

public class CompleteOrderPage extends BasePage {
	public String COMPLETE_ORDER_PAGE_URL = "https://www.wafilife.com/checkout/";
	public By DISTRICT_BUTTON = By.xpath("//span[@class='select2-selection select2-selection--single']");
	public By NAME_FIELD = By.xpath("//input[@id='billing_first_name']");
	public By PHONE_NO = By.xpath("//input[@id='billing_phone']");
	public By PHONE_NO_2 = By.xpath("//input[@id='billing_alternative_phone']");
	public By EMAIL_FIELD = By.xpath("//input[@id='billing_email']");
	public By AREA_FIELD = By.xpath("//select[@id='billing_area']");
	public By ADDRESS_FIELD = By.xpath("//textarea[@id='billing_address_1']");
	
public void doFillupForm(String name, int value ) {
		writeText(NAME_FIELD, name);
		writeText(PHONE_NO, name);
		writeText(PHONE_NO_2, name);
		writeText(EMAIL_FIELD, name);
		
		
		writeText(ADDRESS_FIELD, name);
		
	}


}
