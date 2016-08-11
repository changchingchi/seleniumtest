/**
 * Created by chchi on 4/12/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStage {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/chchi/Documents/PayPal/FN/seleniumTest/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.stage2mb044.stage.paypal.com/fn/testTypingUl.html?f=testPhantom&s=ul");
//        driver.get("http://localhost:3000/wt.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        // invoke callback first.
        driver.findElement(By.id("call")).click();


        WebElement email = driver.findElement(By.name("login_email"));
        WebElement pw = driver.findElement(By.name("login_password"));

        // Enter something to search for
        email.sendKeys("dummy email");
        pw.sendKeys("mydummypw");

        // Now submit the form. WebDriver will find the form for us from the element
//                driver.get("https://www.google.com");

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
//        driver.quit();
    }
}