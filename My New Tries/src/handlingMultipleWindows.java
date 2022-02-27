import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class handlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		// Setting property of chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// Launching the chrome browser
		WebDriver driver = new ChromeDriver();

		// Hitting the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String B = driver.getWindowHandle();
		System.out.println(B);
		Thread.sleep(2000);

		// Handling switch window and closing it
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(500);
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			System.out.println(childWindow);

			if (!B.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
			}

		}

		for (String A : driver.getWindowHandles()) {
			driver.switchTo().window(A);

		}
		driver.close();

		Thread.sleep(2000);
		driver.switchTo().window(B);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

	}
}