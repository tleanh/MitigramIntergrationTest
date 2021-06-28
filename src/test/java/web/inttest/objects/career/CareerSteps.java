package web.inttest.objects.career;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import web.inttest.objects.lib.AccessMenu;
import web.inttest.objects.lib.WaitForWebElement;
import web.inttest.objects.lib.WebElementAttribute;
import web.inttest.objects.webconfig.HomePage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class CareerSteps
{
    private WebDriver driver;
    private CareerPage careerPage;
    @Given("user is on the Careers page")
    public void userIsOnTheCareersPage() {
        // a driver is created and passed to different Objects
        HomePage.setupWebdriver();
        driver = HomePage.getDriver();
        // Select CARRERS menu and wait until the careers page is fully loaded
        AccessMenu accessMenu = new AccessMenu(driver);
        accessMenu.NavigateTo(AccessMenu.MenuItem.CAREERS);
        WaitForWebElement wait = new WaitForWebElement(driver);
        wait.waitForElementByID("email",10);
        careerPage = new CareerPage(this.driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(careerPage.getFirstNameField());
    }
    @When("user enters first name {string}")
    public void userEntersFirstName(String string) {
        careerPage.getFirstNameField().sendKeys(string);
    }
    @When("user enters last name {string}")
    public void userEntersLastName(String string) {
        careerPage.getLastNameField().sendKeys(string);
    }
    @When("user enters country {string}")
    public void userEntersCountry(String string) {
        careerPage.getCountryField().sendKeys(string);
    }
    @When("user enters email {string}")
    public void userEntersEmail(String string) {
        careerPage.getEmailField().sendKeys(string);
    }
    @When("user enters phone number {string}")
    public void userEntersPhoneNumber(String string) {
        careerPage.getPhoneField().sendKeys(string);
    }
    @When("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        careerPage.getSubmitButton().click();
    }

    @Then("user see text {string}")
    public void userSeeTextNextTo(String arg0)
    {
        /* Select all text messages printed out when user leaves
        fields, in career page, emptied before clicking the submit button. Then all the messages
        are converted to a big string for making comparison with arg0.
        matchFound is then compared with TRUE in assertEquals.
        */
        String text = "";
        WaitForWebElement wait = new WaitForWebElement(driver);
        WebElementAttribute webElementAttribute = new WebElementAttribute(driver);
        wait.waitForElementByID("mat-error-0",10);
        ArrayList<String> messages = new ArrayList<>();
        List<WebElement> elements = (List<WebElement>) driver.findElements(By.cssSelector("mat-error[id^='mat-error']"));
        for (int i = 0; i < elements.size(); i++) {
            messages.add(elements.get(i).getText());
        }
        String messageString = String.join(",",messages);
        Pattern pattern = Pattern.compile(arg0, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(messageString);
        boolean matchFound = matcher.find();
        assertEquals(Boolean.TRUE,matchFound);
    }

}
