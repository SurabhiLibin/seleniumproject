package firstweek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();//browser initialisation
		Driver.get("https://selenium.qabible.in/index.php;");
		Driver.manage().window().maximize();
		Driver.close();
		//Driver.quit();

	}

}
