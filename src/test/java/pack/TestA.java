package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {

    @Test
    public void testA() {

        Assert.assertTrue(true);
    }

    @Test
    public void testB() {

        Boolean flag = false;
        Assert.assertTrue(flag==true);
    }
}
