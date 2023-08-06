package selenium_1st_Programme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		String s=driver.getTitle();
		System.out.println(s);
		
		
	}

}
