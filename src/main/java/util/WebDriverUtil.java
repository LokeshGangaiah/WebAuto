package util;

import java.io.File;
//import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;

public class WebDriverUtil {

	
	DesiredCapabilities capabilities = new DesiredCapabilities();

	public static WebDriver driver;
	
	static String URL;

	public static void launchWebApp() throws MalformedURLException {

		System.out.println("whats1");
		File classpathRoot = new File (System.getProperty("user.dir"));
		System.out.println(classpathRoot);
		System.setProperty("webdriver.chrome.driver", classpathRoot+"/Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
//        
//        driver = new  ChromeDriver();    
        driver.manage().window().maximize();                        
        System.out.println("Chrome Driver Created");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.carsguide.com.au/");
	}

	public static void setup() throws MalformedURLException {
		if (driver == null)

			System.out.println("Launch the App inside utils1");
		System.out.println("=========================1");
		//AndroidMobileDr = new AndroidMobileDr();
		System.out.println("=========================12");
	}
	
	public static WebDriver getDriver() {
		return (WebDriver) driver;
	}

}

