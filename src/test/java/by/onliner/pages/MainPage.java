package by.onliner.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends Base{
    static Actions act1 = new Actions(driver);
    List<String> links = new ArrayList<>();

    public final By autobaraholka_link = By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[3]/a[2]/span[1]");

    public final By autobaraholkaDropdownMenuLinks = By.xpath("//A[@class='b-main-navigation__dropdown-advert-link b-main-navigation__dropdown-advert-link_filter'] //span[@class='b-main-navigation__dropdown-advert-sign']");


    public void hoverAutobar(){
        WebElement el = Base.driver.findElement(autobaraholka_link);
        //el.click();

        act1.moveToElement(el).perform();

    }
    public void listElements(){


        List<WebElement> autobaraholkaLinks = driver.findElements(autobaraholkaDropdownMenuLinks);

        for (WebElement e: autobaraholkaLinks) {
            links.add(e.getAttribute("innerHTML"));
        }

        for(String s: links) {
            System.out.println(s);
        }
    }
    public boolean listComare(List<String> genkList){
        boolean result = false;
        int i = 0;
        for (String s:genkList) {
            if(s.equals(links.get(i))){
                System.out.println("s.equals(links.get(i)), i ="+i+" " +s.equals(links.get(i)));
                return true;
            }
            i++;
        }
        return result;
    }
}
