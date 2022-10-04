package tests.swaglags;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import views.pages.HomePage;
import views.pages.InventoryPage;
import java.time.Duration;



@DisplayName("Testes da funcionalidade: Login")
public class LoginTests {
    private WebDriver driver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }


    @Test
    @DisplayName("Login com sucesso")
    public void testLoginWithSucesso(){
        HomePage homePage = new HomePage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);

        homePage.goToBaseUrl();
        homePage.doLogin("standard_user", "secret_sauce").validationLoginSuccees();

    }



    @Test
    @DisplayName("Login com senha incorreta")
    public void testLoginIncorrectPassword(){

    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
