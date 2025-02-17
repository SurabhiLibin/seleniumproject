package firstweek;

import org.openqa.selenium.WebDriver;

public class NavigationCommands extends BrowserInitialisation1 {

	public void navigation() {
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		NavigationCommands browser = new NavigationCommands();
				browser.browserInitialisation();
				browser.navigation();


	}

}
