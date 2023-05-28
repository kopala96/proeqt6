package Utills;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {

    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public static void setUp() {
//        Configuration.browserSize = "1366x768";
        System.setProperty("selenide.browserSize", "1366x768");
        open("https://zoommer.ge/");
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterMethod(description = "ქეშიუს გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
        SelenideLogger.removeListener("allure");
    }


}