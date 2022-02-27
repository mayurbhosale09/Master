package new_tries_java_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTableElements {

	public static void main(String[] args) throws InterruptedException {

		int a = 0, b = 0;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// Launching the chrome browser
		WebDriver driver = new ChromeDriver();

		// Hitting the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		String oldTab = driver.getWindowHandle();

		// Maximizing the window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);

		String s1 = driver.findElement(By.xpath("(//table/tbody)[2]/tr/td[3]")).getText();
		System.out.println(s1);

		List<WebElement> l1 = driver.findElements(By.xpath("(//table/tbody)[2]/tr/td"));

		// using for loop
		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i).getText().equals(s1)) {
				a++;
			}
		}
		System.out.println(+a);

		// using for-each loop
		for (WebElement webElement : l1) {

			if (webElement.getText().equalsIgnoreCase(s1)) {
				b++;
			}
		}
		System.out.println(+b);

	}

}
