package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_product extends PageFactory {
  
	@FindBy(xpath="//div[@ class='xtXmba']")
	WebElement mobile;
	
	@FindBy(xpath="//div[@ class='_1bEAQy _2iN8uD']//img[@ class='kJjFO0 _3DIhEh']")
	WebElement direct;
	
	public void search_kro() {
		mobile.click();
		direct.click();
	}
	
	
	
}
