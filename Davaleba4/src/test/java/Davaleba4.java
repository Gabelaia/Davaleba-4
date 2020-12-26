import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static java.lang.Thread.sleep;

public class Davaleba4 {
        @Test
        public void myFirstTest() throws InterruptedException {
            Configuration.browser = "chrome";
            Configuration.baseUrl = "https://redmed.ge/ka";
            System.setProperty("webdriver.chrome.driver", "FILES/chromedriver.exe");
            Configuration.startMaximized = true;

            Selenide.open("https://redmed.ge/ka");
            Thread.sleep(3000);
            $("#search").setValue("ფსიქოლოგი");
            Thread.sleep(5000);
            $("#search").sendKeys(Keys.ENTER);
            Thread.sleep(5000);
            $(byXpath("//*[@id=\"header\"]/div/div/div[3]/div[1]/div/b")).click();
            Thread.sleep(3000);
            $(byXpath("//*[@id=\"mat-menu-panel-0\"]/div/a[1]")).click();
            Thread.sleep(3000);
        }
    }


