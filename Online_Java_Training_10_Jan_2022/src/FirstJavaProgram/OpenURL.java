package FirstJavaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws InterruptedException {

		//Setting system property of chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32\\chromedriver.exe");

		//Launching chrome browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//Navigate a step back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Navigate a step forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//Fetch Current URL
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		//Fetch Title
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//Close the current browser instance
		Thread.sleep(3000);
		driver.close();
		
		//Close all browsers
		driver.quit();
		

	}

}
