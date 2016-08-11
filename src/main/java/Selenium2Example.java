/**
 * Created by chchi on 4/12/16.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Selenium2Example  {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
//
//        String PROXY = "localhost:8888";
//
//        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
//        proxy.setHttpProxy(PROXY)
//                .setFtpProxy(PROXY)
//                .setSslProxy(PROXY);
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(CapabilityType.PROXY, proxy);
//        WebDriver driver = new FirefoxDriver(cap);
//
//        File file = new File("charles.xpi");
//        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        firefoxProfile.addExtension(file);
//
//
//        firefoxProfile.setAcceptUntrustedCertificates(true);
//        firefoxProfile.setAssumeUntrustedCertificateIssuer(false);
//        WebDriver driver = new FirefoxDriver(firefoxProfile);




//                WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new SafariDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/chchi/Documents/PayPal/FN/seleniumTest/chromedriver");

        for(int i =0 ; i <10; i++){

        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.stage2mb044.stage.paypal.com/fn/testTypingUl.html?f=testPhantom&s=ul");
//        driver.get("http://localhost:3000/wt.html");
        driver.get("https://pollev.com/techexpo?_ga=1.72006739.1117165668.1469120751");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        // invoke callback first
        Thread.sleep(2000);
        driver.findElement(By.className("response")).sendKeys("RDA");
        driver.findElement(By.className("submit")).click();
//
//        WebElement email = driver.findElement(By.name("login_email"));
//        WebElement pw = driver.findElement(By.name("login_password"));
//
//        // Enter something to search for
//        email.sendKeys("dummy email");
//        pw.sendKeys("mydummypw");

        // Now submit the form. WebDriver will find the form for us from the element
//                driver.get("https://www.google.com");

        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser

        }
    }
}