package tests.swaglags;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import views.pages.HomePage;

import java.time.Duration;

public class AddItemToCart {
    private WebDriver driver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    public void addBackpackToCart(){
        HomePage homePage = new HomePage(driver);

        homePage.goToBaseUrl();
        homePage.doLogin("standard_user", "secret_sauce");

    }
}
