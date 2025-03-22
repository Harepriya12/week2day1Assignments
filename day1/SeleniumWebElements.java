package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElements {

	public static void main(String[] args) {
		
		 // Launch the browser (Chrome) 
		ChromeDriver driver = new ChromeDriver();
		
		
		// Open URL
		driver.get("http://leaftaps.com/opentaps");
		
		// To maximize the windows size
		driver.manage().window().maximize();
		
		// locate the element in the DOM
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//Click on Accounts
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on create accounts
		driver.findElement(By.linkText("Create Account")).click();
		
		// enter the account name
		driver.findElement(By.id("accountName")).sendKeys("Priya");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.linkText("Create Account")).click();
		
		// get the title
		 String title = driver.getTitle();
		 System.out.println(title);

		// to close the window
		driver.close();

	}
}
