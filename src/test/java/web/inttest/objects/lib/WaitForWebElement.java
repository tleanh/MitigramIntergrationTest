package web.inttest.objects.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebElement
{
    private WebDriver driver;
    public WaitForWebElement(WebDriver driver)
    {
        this.driver = driver;
    }

    public void waitForElementByID(String locator, Integer time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }
    public void waitForElementByClass(String locator, Integer time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
    }
    public void waitForElementByCSS(String locator, Integer time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public void waitForElementByXpath(String locator, Integer time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
