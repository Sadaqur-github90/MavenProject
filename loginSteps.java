package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class loginSteps {

    WebDriver driver = null;
    @Given("user is on login Page.")
    public void user_is_on_login_Page() {
        System.setProperty("WebDriver.gecko.driver",
                "/Users/sadaqur.rahman/IdeaProjects/MavenProject/Driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);


        System.out.println("Step-1: user is on login Page");
    }

    @When("user enters user name and password.")
    public void user_enters_user_name_and_password() {
        System.out.println("Step-2: users enters name and password");
        }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Step-3: clicks on login button");
    }

    @Then("user is navigated to the homepage.")
    public void user_is_navigated_to_the_homepage() {
        System.out.println("Step-4: user is navigated to the homepage");

    }


}
