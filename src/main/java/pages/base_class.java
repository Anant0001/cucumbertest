package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class base_class extends PageFactory {
	WebDriver driver;
	@FindBy(xpath="//input[@ class='_2IX_2- VJZDxU']")
	WebElement username;
	
	@FindBy(xpath="//input[@ type='password']")
	WebElement password;
	
	@FindBy(xpath="//div//button[@ class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement button;
	

	public void google_open() {
		System.setProperty("webdriver.chrome","src/test/resources/driver/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("flipkart"+Keys.ENTER);
		driver.navigate().to("https://www.flipkart.com");
		
	}
	
	public void enter_credentials(String user, String pass) {
	username.sendKeys(user);
	password.sendKeys(pass);
	button.click();
	}
	

}
