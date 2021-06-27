package web.inttest.objects.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementAttribute
{
    private WebDriver driver;

    public WebElementAttribute(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getText(String indicator) {
        WebElement webElement = driver.findElement(By.id(indicator));
        //WebElement alert = driver.findElement(By.className("alert"));
        String text;
        text = webElement.getText();
        return text;
    }
}
