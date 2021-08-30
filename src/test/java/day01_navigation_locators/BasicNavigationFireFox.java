package day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigationFireFox {

    public static void main(String[] args) {

        // 1. sut up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // 2. Create Webdriver instance using FireFoxDriver object
        WebDriver driver = new FirefoxDriver();
        // 3. navigate to "https://cybertekschool.com"
        driver.get("https://cybertekschool.com");


        System.out.println("About the quit");
        // quit the browser
        driver.quit();



    }
}
