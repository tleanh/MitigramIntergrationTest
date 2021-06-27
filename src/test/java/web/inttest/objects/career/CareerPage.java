package web.inttest.objects.career;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareerPage
{
    private WebDriver driver;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement countryField;
    private WebElement emailField;
    private WebElement phoneField;
    private WebElement selectFileButton;
    private WebElement submitButton;
    public CareerPage(WebDriver driver)
    {
        this.driver = driver;
        firstNameField = driver.findElement(By.id("first_name"));
        lastNameField = driver.findElement(By.id("last_name"));
        countryField = driver.findElement(By.id("country"));
        emailField = driver.findElement(By.id("email"));
        phoneField = driver.findElement(By.id("phone"));
        selectFileButton = driver.findElement(By.xpath("/html/body/app-root/app-default-layout/mat-sidenav-container/mat-sidenav-content/div/main/div/app-careers/app-introduce-yourself/form/div/div[1]/div/app-file-upload/div/div/input"));
        submitButton = driver.findElement(By.name("submit"));
    }

    public WebElement getFirstNameField()
    {
        return firstNameField;
    }

    public WebElement getLastNameField()
    {
        return lastNameField;
    }

    public WebElement getCountryField()
    {
        return countryField;
    }

    public WebElement getEmailField()
    {
        return emailField;
    }

    public WebElement getPhoneField()
    {
        return phoneField;
    }

    public WebElement getSelectFileButton()
    {
        return selectFileButton;
    }

    public WebElement getSubmitButton()
    {
        return submitButton;
    }
}
