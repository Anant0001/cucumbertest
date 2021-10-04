package stepdefinition;
import org.testng.annotations.Test;

//import pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Details;

public class stepdefinition {
	Details detail;
	@Given("user is on the google page")
	public void user_is_on_the_google_page() {
	   detail.action1();
	}

	@When("User enter the item to search and press enter")
	public void user_enter_the_item_to_search_and_press_enter() {
	   detail.action2();
	}

	
}
