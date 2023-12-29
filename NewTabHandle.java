package BaseTest;

import MavenBasics.LearnMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static MavenBasics.LearnMaven.driver;
import static MavenBasics.LearnMaven.setup;

public class NewTabHandle {

    public WebDriver handleNewTab (WebDriver driver1){
        String mainTab = driver1.getWindowHandle();
        List<String>childTabs = new ArrayList<>(driver1.getWindowHandles());
        childTabs.remove(mainTab);
        driver1.switchTo().window(childTabs.get(0));
        return driver1;

    }
    static void waitFor(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }
    @Test
    public void testTabHandle() throws InterruptedException {
        setup("https://www.letskodeit.com/practice");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        waitFor(3);
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        waitFor(3);
        System.out.println(driver.getTitle());
        handleNewTab(driver);
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();


    }
}
