package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search_item {
WebDriver driver;
	public void Search_item() {
		driver.findElement(By.xpath("//div[@ class='_3OO5Xc']//input")).click();
		
	}
}
