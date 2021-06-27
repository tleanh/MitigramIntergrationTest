package web.inttest.objects.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessMenu
{
    private WebDriver driver;
    public static WebElement LOGINLINK;
    public static WebElement CAREERSLINK;
    public AccessMenu(WebDriver driver)
    {
        this.driver = driver;
        System.out.print("FORMLINKTTT" + driver);
        LOGINLINK = driver.findElement(By.xpath("/html/body/app-root/app-default-layout/mat-sidenav-container/mat-sidenav-content/app-default-header/header/nav[2]/ul/li[4]/a"));
        CAREERSLINK = driver.findElement(By.xpath("/html/body/app-root/app-default-layout/mat-sidenav-container/mat-sidenav-content/app-default-header/header/nav[2]/ul/li[2]/a"));

    }

    public static enum MenuItem{
        LOGIN,
        CAREERS
    }

    public static void NavigateTo(MenuItem item){
        switch (item){
            case LOGIN:
                LOGINLINK.click();
                return;
            case CAREERS:
                CAREERSLINK.click();
                return;
        }
    }

}
