package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver;
	
	@Given("open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\utkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    
	}

	@Given("user is on google page")
	public void user_is_on_google_page() {
	   System.out.println("user is on google page ");
	}

	@When("enter text in search box")
	public void enter_text_in_search_box() {
		System.out.println("user is on google page ");
	}

	@When("hit enter")
	public void hit_enter() {
		System.out.println("user is on google page ");  
	}

	@Then("navigate to search page")
	public void navigate_to_search_page() {
		System.out.println("user is on google page ");
	}

}
