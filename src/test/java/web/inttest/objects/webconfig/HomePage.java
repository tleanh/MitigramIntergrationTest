package web.inttest.objects.webconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage
{
    public static WebDriver driver;
    public static void setupWebdriver()
    {
        /* config which web driver to run test with. Make sure the web driver
        support your web browser
        */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tleanh\\MitigramIntergrationTest\\src\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mitigram.com/");
        driver.manage().window().maximize();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
