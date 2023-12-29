package BaseTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static MavenBasics.LearnMaven.driver;
import static MavenBasics.LearnMaven.setup;
import static org.apache.commons.io.FileUtils.waitFor;

public class TestNGTest {
    void waitFor(int second) throws InterruptedException{
        Thread.sleep(1000*second);
    }
   @AfterTest
    void close(){ driver.close();}

   @BeforeTest
   public  void navigateToAmazon(){
       setup("https://www.amazon.com");
    }

    @Test
    public  void amazonTest() throws InterruptedException{
       waitFor(5);

    }


}
