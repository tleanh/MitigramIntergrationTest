package web.inttest.objects.lib;

import org.openqa.selenium.WebDriver;

public class CleanTest
{
    private WebDriver driver;

    public CleanTest(WebDriver driver)
    {
        this.driver = driver;
    }

    public void closeWebbrowser()
    {
        if ( driver != null) {
            //driver.close();
            driver.quit();
        }
    }
}
