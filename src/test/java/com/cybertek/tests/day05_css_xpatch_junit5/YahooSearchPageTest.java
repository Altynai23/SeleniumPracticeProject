package com.cybertek.tests.day05_css_xpatch_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahooSearchPageTest {


    // write 2 tests :
    // testYahooSearchHomePageTitle
    //
    //    test when you navigate to yahoo search page
    //        the title should be "Yahoo Search - Web Search"

    @Test
    public void testYahooSearchResultPageTitle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");

        String exceptedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        // quit the browser here , because we already saved the title
        driver.quit();
        // do static import, so you can do this
        // import static org.junit.jupiter.api.Assertions.*;
        assertEquals(exceptedTitle,actualTitle ) ;


    }

    // test method name : testYahooSearchResultPageTitle
    // test navigate to yahoo page
    // and search for Selenium
    // the page title should start with selenium


}
