package day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class BasicNavigation_LocalHTML_File {

    public static void main(String[] args) {

        // st up chrome driver, open chrome browser
        WebDriverManager.chromedriver().setup();
        // navigate to that HTML file using that path you copied from the browser
        WebDriver driver = new ChromeDriver();
        // file:///C:/Users/salyb/OneDrive/Desktop/HTML_Class/Day2.html
        // YOU NEED TO REPLACE IT WITH YOUR OWN FILE PATH ON YOU COMPUTER
        driver.get("// file:///C:/Users/salyb/OneDrive/Desktop/HTML_Class/Day2.html");

        // close the browser
        driver.quit();





    }


}
