package firstweek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialisation1 {

	public WebDriver driver;
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserInitialisation1 browser = new BrowserInitialisation1();
		browser.browserInitialisation();
		browser.QuitAndClose();
		
	}*/
		
		public void browserInitialisation()
		{
		 driver = new ChromeDriver();//browser initialisation
			driver.get("https://selenium.qabible.in/index.php");
			driver.manage().window().maximize();
		}
		
		public void QuitAndClose()
		{
			driver.quit();
		}

	

}
