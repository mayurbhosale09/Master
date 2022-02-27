import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class cFcRegistration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\Mayur\\MSB\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chelseafc.com/en/supporters-clubs");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/cfc-app-root/mat-drawer-container/mat-drawer-content/div/cfc-app-header/header/cfc-navigation/div/nav[2]/div/ul[2]/li[3]/cfc-navigation-item/li/span/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("Akshay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aks.k11234@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aaaa1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Aaaa1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//input[@class='mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-invalid']"))
				.sendKeys("11-1-1990");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-2']/label/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
