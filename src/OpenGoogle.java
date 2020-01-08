/**
 * 
 */
//import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.DefaultSelenium;

/**
 * @author kapilnegi
 *
 */
public class OpenGoogle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox /Applications/Firefox.app/Contents/MacOS/firefox", "https://www.google.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("q", "Learn Selenium");
		selenium.stop();

	}

}
