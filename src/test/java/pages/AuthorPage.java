package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage {
	public String AUTHOR_PAGE_URL1 = "https://www.wafilife.com/cat/books/author/";
	public By SCROLL_NEXT = By.xpath("//a[@class='next page-numbers']");
	public By CLICK_NEXT_PAGE = By.xpath("//a[contains(text(),'→')]");
	public By CLICK_FIND_AUTHOR = By.xpath("//a[@href='/cat/books/author/']");
	

}
