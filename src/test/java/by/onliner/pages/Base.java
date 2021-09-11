package by.onliner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    protected static WebDriver driver;


    public static void launchApplication() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void closeBrowser() {
        driver.quit();
    }

}