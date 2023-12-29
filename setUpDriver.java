package interviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setUpDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "/Users/sadaqur.rahman/IdeaProjects/MavenProject/Driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//div[@id='navbar']")).click();
        driver.close();
    }
}
