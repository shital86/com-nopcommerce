import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        System.out.println("The Page Resource: "+driver.getPageSource());
        String title = driver.getTitle();
        System.out.println("Title of the Page:" + title);
        System.out.println("Current Url:" + driver.getCurrentUrl());
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        WebElement emailField = driver.findElement(By.id("Email"));
        System.out.println(emailField);
        emailField.sendKeys("xyz@yahoo.co.uk");
        WebElement passwordField = driver.findElement(By.name("Password"));
        System.out.println(passwordField);
        passwordField.sendKeys("Happy");
    }
}
