package BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


import static MavenBasics.LearnMaven.driver;
import static MavenBasics.LearnMaven.setup;

public class SeleniumBasics {
    public WebDriver handleNewTab (WebDriver driver1) {
        String mainTab = driver1.getWindowHandle();
        List<String>childTabs = new ArrayList<>(driver1.getWindowHandles());
        childTabs.remove(mainTab);
        driver1.switchTo().window(childTabs.get(0));
        return driver1;


    }
        static void waitFor(int second) throws InterruptedException {
        Thread.sleep(1000 * second);
        }
    @Test
    public void testTabToHandle() throws InterruptedException {
        setup("https://www.letskodeit.com/practice");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        waitFor(5);
        System.out.println(driver.getTitle());



        //String mainTab = driver1.getWindowHandle();
        //childTabs = {window1, window2, window3} if I want to individual window.
        List<String>childTabs = new ArrayList<>(driver.getWindowHandles());
        //childTabs.remove(mainTab);
        driver.switchTo().window(childTabs.get(2));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(childTabs.get(0));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

}
