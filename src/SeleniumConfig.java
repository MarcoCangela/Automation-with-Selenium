import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import java.lang.Thread;

public class SeleniumConfig {
    public static void main(String[] args) {

        System.setProperty("selenium-chrome-driver-4.10.0","/../JARs"); //Adding the Chromedriver

        WebDriver driver = new ChromeDriver(); //Launching Chrome Browser using Chrome driver

        /**
         * Using the Webdriver to test a website
         */
        driver.get("https://wikipedia.com"); //Navigating to the website to test
        driver.manage().window().maximize();

        driver.findElement(By.id("js-link-box-en")).click(); //Finding and clicking the element to test on the website/page to test
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //Getting all the anchors using locator by tagname in the page and printing the text using
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(driver.getTitle());

        System.out.println(links.size());

        for(WebElement l : links){
            System.out.println(l.getText());
        }

        driver.close();
    }
}
