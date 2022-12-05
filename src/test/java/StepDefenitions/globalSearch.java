package StepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.globalsearchPageObj;

public class globalSearch {

	WebDriver driver = new ChromeDriver();
	globalsearchPageObj global;
	@Given("Open the browser for search")
	public void open_the_browser_for_search() {
		driver.get("https://med.nyu.edu");
	}

	@When("Load the home page URL for search")
	public void load_the_home_page_url_for_search() {
		global= new globalsearchPageObj(driver);
		global.globalsearchfromTopClick();
	}

	@And("Perform Global Search")
	public void perform_global_search() {
		global= new globalsearchPageObj(driver);
		global.globalsearchentercontent();
	}

	@Then("Search results should display")
	public void search_results_should_display() throws InterruptedException {
		global= new globalsearchPageObj(driver);
		global.globalsearchverify();
		global.globalsearchfilter();
		global.globalsearchresultsverify();
	}

}
