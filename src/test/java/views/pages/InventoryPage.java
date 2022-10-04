package views.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import views.BasePage;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void validationLoginSuccees(){
        String titleValidation = driver.findElement(By.cssSelector(".header_secondary_container > span")).getText();

        Assertions.assertEquals("PRODUCTS", titleValidation);
    }

    public CartPage accessCart(){
        driver.findElement(By.cssSelector("#shopping_cart_container a")).click();

        return new CartPage(driver);
    }
}
