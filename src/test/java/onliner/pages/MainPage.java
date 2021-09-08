package onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage{


    //private static final By Autobaraholka_page = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/a[2]/span/text()");
    private static WebElement element;

    @FindBy(xpath = "//a[@class='b-main-navigation__link' and contains(@href, 'ab.onliner.by')]")
    private WebElement autobarah;

    private WebDriver driver;
    private Actions actions;

    public void hoverAutobar(){

        actions.click(autobarah);
    }
}
