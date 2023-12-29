package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;


    @Given("Browser is open")
    public void Browser_is_open() {
        System.out.println("Step-1: Browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is " + projectPath);

        System.setProperty("WebDriver.gecko.driver",
                "/Users/sadaqur.rahman/IdeaProjects/MavenProject/Driver/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @And("user on google search page")
    public void user_on_google_search_page() {
        System.out.println("user on google search page");
        driver.navigate().to("https://www.google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
        System.out.println("user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Software");
        Thread.sleep(3000);
    }

    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        System.out.println("hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user is navigated to the search results")
    public void user_is_navigated_to_the_search_results() {
        System.out.println("user is navigated to the search results");
        driver.getPageSource().contains("Online Course");
        driver.close();
        driver.quit();
    }

}
