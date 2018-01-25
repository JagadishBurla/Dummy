package master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {
		// Add two numbers
			// int a=2;
			// int b=3;
			// int c=a+b;
			// System.out.println("Sum of a + b = "+c);
		
		//Print some text
			//System.out.println("Festival Offer");
		
		//create a class, define a method and call it here using an object
				//WareHouse w=new WareHouse();
				//System.out.println(w.cloths());
		
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jagadish.burla");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hs1dag@Jkumarburla");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath(("//div[@id='userNavigationLabel']"))).click();
		driver.findElement(By.xpath(("//span[@class='_54nh']"))).click();*/
		
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("jagadish.burla"); // enter email
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hs1dag@Jkumarburla"); // enter password
		driver.findElement(By.cssSelector("input[value='Log In']")).click(); // click log in button
		driver.findElement(By.cssSelector("div[id='userNavigationLabel']")).click(); // click down arrow
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//ul[@role='menu']/li[12]")).click(); // to click log out
		driver.findElement(By.xpath("//*[text()= 'Log Out']")).click();
		driver.close();
		
		
		
		
		
		
		
	
		
		
		
	}

}
