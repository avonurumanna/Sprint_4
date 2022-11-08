import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikumServices.qaScooter.MainPage;

import java.time.Duration;

public abstract class BaseUISettings {

    protected WebDriver driver;
    protected MainPage mainPage;
    private final String url = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void startUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.get(url);
        mainPage.acceptCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}