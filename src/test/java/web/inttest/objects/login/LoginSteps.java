package web.inttest.objects.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import web.inttest.objects.lib.AccessMenu;
import web.inttest.objects.lib.CleanTest;
import web.inttest.objects.lib.WaitForWebElement;
import web.inttest.objects.webconfig.HomePage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class LoginSteps
{
    private WebDriver driver;
    private LoginPage loginPage;
    @Given("user is on the Mitigram login page")
    public void userIsOnTheMitigramLoginPage() {
        // a driver is created and passed to different Objects
        HomePage.setupWebdriver();
        driver = HomePage.getDriver();
        // Select login menu and wait until the login page is fully loaded
        AccessMenu accessMenu = new AccessMenu(driver);
        accessMenu.NavigateTo(AccessMenu.MenuItem.LOGIN);
        WaitForWebElement wait = new WaitForWebElement(driver);
        wait.waitForElementByID("Email",10);
        loginPage = new LoginPage(this.driver);
    }

    @When("user enters user name {string}")
    public void userEntersEmail(String string) {
        loginPage.getEmailField().sendKeys(string);
    }

    @When("user enters password {string}")
    public void userEntersPassword(String string) {
        loginPage.getPasswordFeild().sendKeys(string);
    }

    @When("user clicks the Login button")
    public void userClicksTheLoginButton() {
        loginPage.getLogginButton().click();
    }

    @Then("user is not logged in to Mitigram")
    public void userIsNotLoggedInToMitigram() {
        loginPage.getEmailField().sendKeys("stillOnLoginPage");
    }

    @Then("user sees message {string}")
    public void userSeesMessage(String string) {
        // compare text getting from a web element and compare it with string argument
        String textFromLogin;
        textFromLogin = driver.findElement(By.className("noty_body")).getText();
        Pattern pattern = Pattern.compile(string,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textFromLogin);
        boolean matchFound = matcher.find();
        assertEquals(Boolean.TRUE,matchFound);
    }


    @Then("user sees Forgot-Password page")
    public void userSeesForgotPasswordPage() {
        WaitForWebElement wait = new WaitForWebElement(driver);
        wait.waitForElementByXpath("/html/body/div/div/div/div/section/div/div/div[2]/div/form/div[3]/div/input",5);
    }

    @When("user clicks on App Store icon")
    public void userClicksOnAppStoreIcon() {
        loginPage.getAppStoreIcon().click();
    }

    @Then("user sees Mitigram app on App Store")
    public void userSeesMitigramAppOnAppStore() {
        WaitForWebElement wait = new WaitForWebElement(driver);
        wait.waitForElementByXpath("//*[@id=\"ember91\"]",5);
    }

    @When("user clicks on Google Play icon")
    public void userClicksOnGooglePlayIcon() {
        loginPage.getGooglePlayIcon().click();
    }

    @Then("user sees Mitigram app on Google Play")
    public void userSeesMitigramAppOnGoogle_Play() {
        WaitForWebElement wait = new WaitForWebElement(driver);
        wait.waitForElementByXpath("//*[@id=\"fcxH9b\"]/div[4]/c-wiz/div/div[2]/div/div/main/c-wiz[1]/c-wiz[1]/div/div[1]/div/img",5);
    }

    @When("user clicks on link {string}")
    public void userClicksOnLink(String text)
    {
        driver.findElement(By.linkText(text)).click();
    }

    @Given("web browser is closed")
    public void webBrowserIsClosed()
    {
        CleanTest cleanTest = new CleanTest(driver);
        cleanTest.closeWebbrowser();
    }

    @Then("user sees Contact-Us page")
    public void userSeesContactUsPage()
    {
        // switch to the second window
        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        WaitForWebElement wait = new WaitForWebElement(driver);
        wait.waitForElementByClass("play-button",5);
    }

/*    public void webBrowserIsClosed()
    {
        CleanTest cleanTest = new CleanTest(driver);
        cleanTest.closeWebbrowser();
    }*/
}
