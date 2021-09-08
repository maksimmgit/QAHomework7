package onliner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;
import onliner.pages.Base;
import onliner.pages.MainPage;

public class StepDefinitions extends Base{

    @Given("onlinerBy")
    public void onlinerBy(){
        Base.launchApplication();
        Base.driver.get("https://onliner.by");
    }
    @When("i open onliner and hover on Autobaraholka link")
    public void autoLink(){
        MainPage mainPage = new MainPage();
        mainPage.hoverAutobar();
    }
    @Then("subcategories shown")
    public void subCat(){
        System.out.println("subcat");
    }
}
