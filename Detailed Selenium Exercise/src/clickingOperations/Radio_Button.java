package clickingOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		Thread.sleep(2000);

		// Creating a List of WebElement Interface and storing all Radio Buttons into it
		List<WebElement> Rad = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		Thread.sleep(1000);

		// Defining which is the expected radio button to be clicked
		String ExpectedResult = "Male";

		// Finding size or the number of radio buttons on the page
		for (int i = 0; i < Rad.size(); i++) {

			// Checking all radio buttons one by one and selecting the one which is needed
			if (Rad.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				Rad.get(i).click();
				System.out.println(ExpectedResult);

				// Breaking the loop when the expected result is achieved
				break;

			}

		}

	}

}
