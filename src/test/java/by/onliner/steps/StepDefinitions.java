package by.onliner.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import by.onliner.pages.Base;
import by.onliner.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private WebDriver driver;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }



    @Given("^onlinerBy$")
    public void onlinerby() {
        driver.get("https://onliner.by");
    }


    @When("^i open onliner and hover on Autobaraholka link$")
    public void i_open_onliner_and_hover_on_Autobaraholka_link() {
        MainPage mainPage = new MainPage();
        mainPage.hoverAutobar();
    }

    @Then("^subcategories shown$")
    public void subcategories_shown() {
        System.out.println("subcategoriews");
    }
}
