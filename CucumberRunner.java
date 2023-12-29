package Runner;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


@CucumberOptions(
        features = {"src/test/java/feature"},
        glue={"stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        monochrome=true,
        tags=" "
        // tags={"@Test1,@Test2"}

)




public class CucumberRunner extends AbstractTestNGCucumberTests {
   // @Override
   // @DataProvider(parallel = true)
   // public Object [][] scenarios(){
    //   return super.scenarios();
   // }

}
