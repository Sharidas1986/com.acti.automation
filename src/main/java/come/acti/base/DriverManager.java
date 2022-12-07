package come.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Class: DriverManager
 * Description: This class is responsible for loading the properties file and loading the application
 * Developed by: Shiju Haridas
 * Date: 24/11/2022
 * Reviewed by: Shiju Haridas
 */
public class DriverManager {

	public static WebDriver driver;
	Properties prop;

	public DriverManager() {
		try {
			File file = new File("./acticonfig/config.properties");
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			System.out.println("Unable to load the properties");
		}

	}

	public void initApplication() {
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./actibrowser/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./actibrowser/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.err.println("Browser provided in config file is invalid");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		geturl();

	}

	public void geturl() {
		String url = prop.getProperty("url");
		driver.get(url);

	}

	public void quitDriver() {
		driver.close();
	}

}
