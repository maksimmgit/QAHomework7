package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage{


    //private static final By Autobaraholka_page = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/a[2]/span/text()");
    private static WebElement element;


    private static By autobarah =  By.xpath("//a[@class='b-main-navigation__link' and contains(@href, 'ab.onliner.by')]");

    private WebDriver driver;
    private Actions actions;

    public void hoverAutobar(){
        element.findElement(By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[3]/a[2]"));
        element.click();

    }
}
