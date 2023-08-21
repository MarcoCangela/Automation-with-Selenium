import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {
    public static void main(String[] args) {

        System.setProperty("webdricer.chrome.driver","/../JARs"); //Adding the Chromedriver

        WebDriver driver = new ChromeDriver(); //Launching Chrome Driver

        /**
         * Using the Webdriver to test a website
         */
        driver.get("https://wikipedia.com"); //Navigating to the website to test
        driver.findElement(By.id("js-link-box-en")).click(); //Finding and clicking the element to test on the website/page to test 
    }
}
