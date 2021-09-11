package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class MainPage extends Base{

    static final Actions act1 = new Actions(driver);
    final List<String> links = new ArrayList<>();

    public final By autobaraholka_link = By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[2]/span[1]");
    public final By houses_link = By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[4]/a/span");
    public final By autobaraholkaDropdownMenuLinks = By.xpath("//A[@class='b-main-navigation__dropdown-advert-link b-main-navigation__dropdown-advert-link_filter'] //span[@class='b-main-navigation__dropdown-advert-sign']");
    public final By housesDropdownMenuLinks = By.xpath("//A[@class='b-main-navigation__dropdown-advert-link'] //span[@class='b-main-navigation__dropdown-advert-sign']");


    public void hoverAutobar(){
        WebElement el = Base.driver.findElement(autobaraholka_link);
        moveTo(el);
    }

    public void listAutoElements(){
        List<WebElement> autobaraholkaLinks = driver.findElements(autobaraholkaDropdownMenuLinks);
        for (WebElement e: autobaraholkaLinks) {
            //System.out.println(e.getAttribute("innerHTML"));
            links.add(e.getAttribute("innerHTML"));
        }
    }

    public void hoverHouses(){
        WebElement el = driver.findElement(houses_link);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 1);
        webDriverWait
                .ignoring(TimeoutException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(autobaraholkaDropdownMenuLinks));
        moveTo(el);
    }

    public void listHousesElements(){
        List<WebElement> housesLinks = driver.findElements(housesDropdownMenuLinks);
        for (WebElement e: housesLinks) {
            //System.out.println(e.getAttribute("innerHTML"));
            links.add(e.getAttribute("innerHTML"));
        }
    }

    public void moveTo(WebElement el) {
        act1.moveToElement(el).perform();
    }

    public boolean listComare(List<String> genkList){
        boolean result = true;
        for (int i = 0; i < links.size(); i++) {
            if (genkList.get(i).compareTo(links.get(i)) != 0) {
                result = false;
                break;
            }
        }
        links.clear();
        return result;
    }
}
