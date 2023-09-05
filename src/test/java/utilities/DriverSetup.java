package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	private static String browserName = System.getProperty("browser", "chrome");
	private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver) {
		DriverSetup.LOCAL_DRIVER.set(driver);
	}
	
	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();
	}
	
		public static WebDriver getBrowser (String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			return new ChromeDriver(chromeOptions);
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		default:
			throw new RuntimeException("Browser not found! using given name "+browserName);
		}
		
	}
	
	@BeforeMethod
	public static synchronized void setBrowser() {
		WebDriver webDriver = getBrowser(browserName);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}
	
	@AfterMethod
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}

}
