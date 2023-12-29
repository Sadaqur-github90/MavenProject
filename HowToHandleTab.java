package BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static MavenBasics.LearnMaven.driver;
import static MavenBasics.LearnMaven.setup;

public class HowToHandleTab {
    public WebDriver handleTab (WebDriver driver1){
        String mainTab = driver1.getWindowHandle();
        List<String>ChildTabs = new ArrayList<>(driver1.getWindowHandles());
        ChildTabs.remove(mainTab);
        driver1.switchTo().window(ChildTabs.get(0));
        return driver1;
    }

    @Test
    public  void testHandle() throws InterruptedException {
        setup("https://www.letskodeit.com/practice");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        handleTab(driver);
        driver.close();
        driver.quit();


    }

    }

