
import StepObject.BasketPageSteps;
import StepObject.RegistrationPageSteps;
import Utills.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static DataObject.BasketPageData.*;

import org.testng.Assert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Basket extends ChromeRunner {
    BasketPageSteps basketPageSteps = new BasketPageSteps();

    @Test
    @Description("კალათის შემოწმება")
    @Severity(SeverityLevel.NORMAL)
    public void basketCheck() {
        basketPageSteps
                .Search(iphone)
                .SearchBtn()
                .IphoneSearch()
                .AddBasket()
                .GoToBasket()
                 .CheckMark()
                .CheckMark2();
        Assert.assertTrue(basketPageSteps.checkMarkBtn.isDisplayed());
        Assert.assertTrue(basketPageSteps.checkMarkBtn2.isDisplayed());
        Assert.assertTrue(basketPageSteps.clearBasket.isEnabled());
        basketPageSteps.ClearBasket()
                .ClickYes()
                .EmptyBasket();






    }


    @Test
    @Description("კალათაში ფასის და რაოდენობის შემოწმება")
    @Severity(SeverityLevel.CRITICAL)
    public void basket() {
        basketPageSteps
                .Search(iphone)
                .SearchBtn()
                .IphoneSearch()
                .AddBasket()
                .GoToBasket()
                .BasketCountPrice();


    }

}

