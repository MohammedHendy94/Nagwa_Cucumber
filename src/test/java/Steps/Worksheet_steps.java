package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Worksheet_steps {
	static WebDriver driver ;

	
	@Given("User opens Nagwa website")
	public void user_opens_nagwa_website() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nagwa.com");
	}
	@When("User selects english language")
	public void user_selects_english_language() 
	{
		driver.findElement(By.xpath("/html/body/div/div/main/div[2]/ul/li[1]/a")).click();
	}

	@When("Search for a lesson as {string}")
	public void search_for_a_lesson(String searchtext) 
	{
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/button/i")).click();
		driver.findElement(By.id("txt_search_query")).sendKeys(searchtext);
		driver.findElement(By.id("txt_search_query")).sendKeys(Keys.ENTER);


	}

	@When("Choose the second lesson from the results")
	public void choose_the_second_lesson_from_the_results() 
	{
		driver.findElements(By.xpath("//div//ul[@class='list']//li//a")).get(1).click();

	}

	@When("Click on the lesson worksheet")
	public void click_on_the_lesson_worksheet()
	{
		driver.findElement(By.xpath("//*[@class='question-preview']")).click();
	}

	@Then("User should navigate to the worksheetpage")
	public void user_should_navigate_to_the_worksheetpage()
	{
		
	}

	@Then("Count the number of displayed questions")
	public void count_the_number_of_displayed_questions() 
	{
		List <WebElement> Numberofquestions = driver.findElements( By.xpath("//div[@class='instances']/div"));
		int numberofquestion = Numberofquestions.size();
		System.out.println("Number of displayed questions "+ numberofquestion);

	}


}
