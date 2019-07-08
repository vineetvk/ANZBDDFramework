package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	 WebDriver driver;

		
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 }
	 
	 //@Then("^user enters username and password$")
	 //public void user_enters_username_and_password(DataTable credentials){
	 //List<List<String>> data = credentials.raw();
	 //driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	 //driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	 //}
	
	
	 //@Then("^user clicks on login button$")
	 //public void user_clicks_on_login_button() {
	 //WebElement loginBtn =
	 //driver.findElement(By.xpath("input[@type='submit']"));
	 //JavascriptExecutor js = (JavascriptExecutor)driver;
	 //js.executeScript("arguments[0].click();", loginBtn);
	 //}
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 }
	 
	 
	 //@Then("^user moves to new deal page$")
	 //public void user_moves_to_new_contact_page() {
		//driver.switchTo().frame("mainpanel");
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("a[contains(text(),'Deals')]"))).build().perform();
		//driver.findElement(By.xpath("a[contains(text(),'New Deal')]")).click();
	//
	//}
	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData) throws InterruptedException{
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.xpath("(//label[@class='btn'])[1]")).click();
		
		 WebElement dropdown=driver.findElement(By.xpath("//select[@title='Number of dependants']"));
		 Select sel = new Select(dropdown);
		 sel.selectByVisibleText("0");
		
		 driver.findElement(By.id("expenses")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("homeloans")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("otherloans")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("credit")).sendKeys(dealValues.get(0).get(3));
		 driver.findElement(By.xpath("//span[@id='q2q1i1']/../input")).sendKeys(dealValues.get(0).get(4));
		 driver.findElement(By.xpath("//span[@id='q2q2i1']/../input")).sendKeys(dealValues.get(0).get(5));
		 driver.findElement(By.xpath("//button[.='Work out how much I could borrow']")).click();
		 Thread.sleep(10000);
	 }
	 
	 @Then("^user enters startover button$")
	 public void user_enters_startover_button() throws InterruptedException{
		 driver.findElement(By.xpath("//button[@class='start-over']")).click();
		 Thread.sleep(10000);
	 }
	 
	 @Then("^user enters only for Living expense$")
	 public void user_enters_only_for_Living_expenses(){
		 driver.findElement(By.id("expenses")).sendKeys("1");
		 driver.findElement(By.xpath("//button[.='Work out how much I could borrow']")).click();
	 
	 }
	 
	 //@Then("^Close the browser$")
	 //public void close_the_browser(){
		 //driver.quit();
	 //}
	
	
	
	

}