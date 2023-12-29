package MavenBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnMaven {

    public static WebDriver driver;
    static  String [] searchKeywords= {"Shoe", "Gadget", "Accessories", "Bag"};
    static  String [] searchKeywords1= {"Mens Cloth", "Mens Perfume", "Mens Razor"};
    static  String [] searchKeywords2= {"Ball", "Iphone", "Computer"};
    static  String [] searchKeywords3= {"Laptop", "Women Towel", "Mobile Accessories"};
    static  String [] searchKeywords4= {"Watch", "Smart Watch", "Apple Watch"};
    public static void setup(String url) {
        System.setProperty("webdriver.gecko.driver", "/Users/sadaqur.rahman/IdeaProjects/MavenProject/Driver/geckodriver");

        driver = new FirefoxDriver();
        //driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        driver.get(url);
    }

    static void close() {
        driver.close();
    }

    //static void waitFor() throws  InterruptedException {
        //Thread.sleep(5000); //Non-parameterised Method
   // }
    static void waitFor(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }

    static void searchForArrays(String [] array) throws InterruptedException {
        setup("https://www.amazon.com");

        for (String element: array) {
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();//clear the search box
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(element, Keys.ENTER);
            waitFor(5);
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        /*setup("https://www.amazon.com");
        waitFor(2);
        close();

        setup("https://www.ebay.com");
        waitFor(4);
        close();

        setup("https://www.temu.com");
        waitFor(5);
        close();*/

        searchForArrays(searchKeywords);
        driver.close();
        searchForArrays(searchKeywords1);
        driver.close();
        searchForArrays(searchKeywords2);
        driver.close();
        searchForArrays(searchKeywords3);
        driver.close();
        searchForArrays(searchKeywords4);
        driver.close();


    }

}



