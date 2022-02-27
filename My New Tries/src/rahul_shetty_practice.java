import java.util.Set;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahul_shetty_practice {

	public static void main(String[] args) throws InterruptedException {

		// Setting property of Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// Launching the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Hitting the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		String oldTab = driver.getWindowHandle();

		// Maximizing the window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Clicking on radio button
		driver.findElement(By.xpath("//input[@value='radio1']")).isEnabled();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		Thread.sleep(1000);

		// Entering the text in country suggestion
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Australia");
		Thread.sleep(1000);

		// Selecting from dropdown
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='option1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='option2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='option3']")).click();
		Thread.sleep(1000);

		// Clicking the checkboxes
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(1000);

		// Handling switch window
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(oldTab);
		Thread.sleep(2000);

		// Handling switch tab
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(oldTab);
		Thread.sleep(2000);

		// To scroll down by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);

		// Handling alerts and confirmation tabs
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mayur");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abhusha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(3000);

		// To hide or show any web element
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='show-hide']")).sendKeys("I Love You Abhusha");

	}
}
