package views.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import views.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void goToBaseUrl(){
        driver.get("https://www.saucedemo.com/");

    }

    public InventoryPage doLogin(String username, String password){
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();

        return new InventoryPage(driver);
    }
}
