import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://demo.nopcommerce.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);
        String title= driver.getTitle();
        System.out.println("Title of the Page:" +title);
        System.out.println("Current Url:" +driver.getCurrentUrl());
        String loginUrl="https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        WebElement emailField= driver.findElement(By.id("Email"));
        System.out.println(emailField);
        emailField.sendKeys("xyz@yahoo.co.uk");
        WebElement passwordField= driver.findElement(By.name("Password"));
        System.out.println(passwordField);
        passwordField.sendKeys("Happy");
    }
}
