package StepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.globalsearchPageObj;

public class homePage {
	
	WebDriver driver = new ChromeDriver();
	
	//WebDriver driver = null;

	@Given("Open the browser")
	public void open_the_browser() {
		//System.getProperty("webdriver.chrome.driver","SOMSmokeTestcasess/chromedriver.exe");
		driver.get("https://med.nyu.edu");
		
	}

	@When("Load the home page URL")
	public void load_the_home_page_url() {
		
		String homepageSOMTitle = driver.getTitle();
		System.out.println("Title is" +homepageSOMTitle);
		
	}

	@Then("Home page should loaded sucessfully")
	public void home_page_should_loaded_sucessfully() {
		
		
		globalsearchPageObj home= new globalsearchPageObj(driver);
		String homepageSOMTitle = driver.getTitle();
		org.testng.Assert.assertEquals(homepageSOMTitle, "Education & Research at NYU Langone Health | NYU Langone Health");
		home.globalsearchfromTopClick();
		//driver.close();
	}

}
