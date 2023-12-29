package StepDefinitions;

import MavenBasics.LearnMaven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class TestAmazonHomepage extends LearnMaven {
    @Given("I am at Amazon homepage")
    public void i_am_at_Amazon_homepage() {
        LearnMaven.setup("https://www.amazon.com");

    }

    @When("I click on search box")
    public void i_click_on_search_box() {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();

    }

    @When("I write {string} into search box")
    public void i_write_into_search_box(String string) {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("Handball");


    }

    @Then("I click on search")
    public void i_click_on_search() {
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

    }

}
