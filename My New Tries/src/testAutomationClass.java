import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAutomationClass {

	public static void main(String[] args) throws InterruptedException {

		// Setting system property of chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// Launching chrome browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String s1 = driver.getTitle();
		System.out.println(s1);

		driver.findElement(By.xpath("//input[@id='email']"));
		Boolean B1 = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		System.out.println(B1);
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.id("pass")).sendKeys("xyz@123");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
