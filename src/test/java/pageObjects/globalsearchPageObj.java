package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class globalsearchPageObj {

	WebDriver driver;
	String resultfinal;

By globalsearchfromTop=By.xpath("//button[@class='nyuuninav--search-bar__loupe']");
By globalSearchID=By.id("nyuuninav--search-bar__input");
By globalsearchSubmitt = By.id("nyuuninav--search-bar__search-button");
By globalsearchfaclist1 = By.xpath("//a[contains(text(),'Gregory')]");
By globalsearchfaclist2 = By.xpath("//span[contains(text(),'Marian')]");
By globalsearchfilter1= By.xpath("//a[normalize-space()='Education (15)']");
By globalsearchfiltercount = By.xpath("//div[@class='l-search-results-summary l-search-results-summary--unbordered desktop-show']//div[@class='search-bar__count-of-results']");

public globalsearchPageObj(WebDriver driver){
	
	this.driver=driver;
	
}


public void globalsearchfromTopClick()
{
	
	driver.findElement(globalsearchfromTop).click();
	
}

public void globalsearchentercontent()
{
	driver.findElement(globalSearchID).sendKeys("David");
	driver.findElement(globalsearchSubmitt).click();
}

public void globalsearchverify()
{
	String Faculty1GlobalSearch=driver.findElement(globalsearchfaclist1).getText();
	Assert.assertEquals(Faculty1GlobalSearch, "Gregory David, PhD");
	String Faculty2GlobalSearch=driver.findElement(globalsearchfaclist2).getText();
	Assert.assertEquals(Faculty2GlobalSearch, "Marian David, MD");
}

public void globalsearchfilter() throws InterruptedException
{
	String GlobalSearch=driver.findElement(globalsearchfilter1).getText();
	String myArray[] = GlobalSearch.split(" ");
	String word = myArray[1];
	resultfinal = word.substring(1, word.length()-1);
	driver.findElement(globalsearchfilter1).click();
	Thread.sleep(1000);
	
	
	
}

public void globalsearchresultsverify()
{
	String filterserachcount=driver.findElement(globalsearchfiltercount).getText();
	String myArray2[] = filterserachcount.split(" ");
	String word2 = myArray2[0];
	Assert.assertEquals(resultfinal, word2);
	
}

}
