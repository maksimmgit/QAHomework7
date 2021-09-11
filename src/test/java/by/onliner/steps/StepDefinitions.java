package by.onliner.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import by.onliner.pages.Base;
import by.onliner.pages.MainPage;
import org.junit.AfterClass;
import org.junit.Assert;

import java.util.List;

public class StepDefinitions extends Base{

    @Given("^onlinerBy$")
    public void onlinerby(){
        launchApplication();
        Base.driver.get("https://onliner.by");
    }


    @When("^i open onliner and hover over Autobaraholka link$")
    public void i_open_onliner_and_hover_on_Autobaraholka_link() {
        MainPage mainPage = new MainPage();
        mainPage.hoverAutobar();
    }

    @Then("^subcategories from Autobaraholka are adding to the list and comparing to the following list$")
    public void subcategories_shown(List<String> list) {
        MainPage mainPage = new MainPage();
        mainPage.listAutoElements();
        Assert.assertTrue("Не вышло c автобарахолкой", mainPage.listComare(list));
    }

    @When("^i open onliner and hover over Houses link$")
    public void iOpenOnlinerAndHoverOverHousesLink() {
        MainPage mainPage = new MainPage();
        mainPage.hoverHouses();
    }

    @Then("^subcategories from Houses are adding to the list and comparing to the following houselist$")
    public void subcategoriesFromHousesAreAddingToTheListAndComparingToTheFollowingList(List<String> list) {
        MainPage mainPage = new MainPage();
        mainPage.listHousesElements();
        Assert.assertTrue("Не вышло с домами", mainPage.listComare(list));
    }

    @And("^closing browser$")
    public void closingBrowser() {
        Base.closeBrowser();
    }
}
