package fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class steps {
public static WebDriver driver;
@Given("launch url")
	public void launch_url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hariprakash\\eclipse work\\fb\\src\\main\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}

@When("put {string} and {string}")
	public void put_and(String string, String string2) {
	   driver.findElement(By.id("email")).sendKeys(string);
	   driver.findElement(By.id("pass")).sendKeys(string2);
	}

@Then("I quit the browser")
	public void i_quit_the_browser() {
	    driver.quit();
	}
}
