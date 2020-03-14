/**
 * 
 */
//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.CommandProcessor;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.webdriven.WebDriverCommandProcessor;

/**
 * @author kapilnegi
 *
 */
public class OpenGoogle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox /Applications/Firefox.app/Contents/MacOS/firefox", "https://www.google.com");
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");
		DefaultSelenium selenium = new DefaultSelenium((CommandProcessor) new WebDriverCommandProcessor("http://www.google.com",new ChromeDriver()));
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("q", "Learn Selenium");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selenium.stop();

	}

}
