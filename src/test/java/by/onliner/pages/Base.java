package by.onliner.pages;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    protected static WebDriver driver;

    @BeforeClass
    public static void launchApplication(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

}