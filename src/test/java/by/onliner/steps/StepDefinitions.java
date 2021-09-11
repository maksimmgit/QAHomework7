package by.onliner.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import by.onliner.pages.Base;
import by.onliner.pages.MainPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StepDefinitions extends Base{





    @Given("^onlinerBy$")
    public void onlinerby() {
        launchApplication();
        Base.driver.get("https://onliner.by");
    }


    @When("^i open onliner and hover on Autobaraholka link$")
    public void i_open_onliner_and_hover_on_Autobaraholka_link() {
        MainPage mainPage = new MainPage();
        mainPage.hoverAutobar();

    }

    @Then("^subcategories added to the list$")
    public void subcategories_shown() {
        MainPage mainPage = new MainPage();
        mainPage.listElements();
    }


    @And("^in the end we compare subs with the list$")
    public void inTheEndWeCompareSubsWithTheList(List<String> list) {
        System.out.println(list);

    }
}
