package web.inttest.objects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
    private WebDriver driver;
    private WebElement email;
    private WebElement password;
    private WebElement logginButton;
    private WebElement appStoreIcon;
    private WebElement googlePlayIcon;
    private WebElement notifyMessage;
    private WebElement mitigramIcon;
    private WebElement mitigramIconOnAppleStore;
    private WebElement mitigramIconOnGoogleStore;
    private WebElement emailFieldOnForgotPassword;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        email = driver.findElement(By.id("Email"));
        password = driver.findElement(By.id("Password"));
        logginButton = driver.findElement(By.id("loginBtn"));
        appStoreIcon = driver.findElement(By.xpath("//*[@id=\"app-store-badges\"]/a[1]/img"));
        googlePlayIcon = driver.findElement(By.xpath("//*[@id=\"app-store-badges\"]/a[2]"));
        mitigramIcon = driver.findElement(By.xpath("/html/body/div/div/div/div/a/img"));
        //WebElement mitigramIconOnAppleStore = driver.findElement(By.xpath("//*[@id=\"ember91\"]"));
        //WebElement mitigramIconOnGoogleStore = driver.findElement(By.xpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div/main/c-wiz[1]/c-wiz[1]/div/div[1]/div/img"));
        emailFieldOnForgotPassword = driver.findElement(By.className("form-control"));
    }

    public WebElement getEmailField()
    {
        return email;
    }

    public WebElement getPasswordFeild()
    {
        return password;
    }

    public WebElement getLogginButton()
    {
        return logginButton;
    }

    public WebElement getAppStoreIcon()
    {
        return appStoreIcon;
    }

    public WebElement getGooglePlayIcon()
    {
        return googlePlayIcon;
    }


    public WebElement getNotifyMessage()
    {
        return notifyMessage;
    }

    public WebElement getMitigramIcon()
    {
        return mitigramIcon;
    }

    public WebElement getMitigramIconOnAppleStore()
    {
        return mitigramIconOnAppleStore;
    }

    public WebElement getMitigramIconOnGoogleStore()
    {
        return mitigramIconOnGoogleStore;
    }


}
