package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void testgoogle() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver  = new ChromeDriver();
        driver.navigate().to("http://google.com");
        String appTitle = driver.getTitle();
        System.out.println("Application title is :: "+appTitle);
        driver.quit();
    }

}