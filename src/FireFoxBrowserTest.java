import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        System.out.println("The Page Resource: " + driver.getPageSource());
        String title = driver.getTitle();
        System.out.println("Page Title:" + title);
        System.out.println("Current Url:" + driver.getCurrentUrl());
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        // System.out.println("Current Url:" +driver.getCurrentUrl());
        WebElement emailField = driver.findElement(By.id("Email"));
        System.out.println(emailField);
        emailField.sendKeys("ab@yahoo.com");
        // driver.close();//Close the browser
        WebElement passwordField = driver.findElement(By.name("Password"));//sending password to password field element
        System.out.println(passwordField);
        passwordField.sendKeys("Boots");
        // WebElement.searchfield =driver.findElement(By.id("Search store"));

    }
}
