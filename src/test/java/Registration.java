
import StepObject.LogInPageSteps;
import StepObject.RegistrationPageSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Registration extends ChromeRunner {
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();
    LogInPageSteps logInPageSteps = new LogInPageSteps();

    @Test
    @Description("რეგისტრაციის დადებითი მნიშვნელობის შემოწმება")
    @Severity(SeverityLevel.BLOCKER)
    public void RegistrationCheck() {
        registrationPageSteps.ProfileBtn()
                .GotoRegPage()
                .Email(email)
                .Password(password)
                .ConfirmPassword(confirmPassword)
                .CheckMark();
        Assert.assertTrue(registrationPageSteps.finRegBtn.isDisplayed());
        registrationPageSteps.FinReg()
                .Close()
                .ProfileBtn()
                .BackBtn();
        logInPageSteps.EmailS(email)
                .PasswordS(password);
        Assert.assertTrue(logInPageSteps.logInBtn.is(Condition.editable));
        logInPageSteps.LogIn();


    }


    @Test
    @Description("რეგისტრაციის უარყოფითი მნიშვნელობის შემოწმება")
    @Severity(SeverityLevel.BLOCKER)
    public void RegistrationCheckNegative() {
        registrationPageSteps.ProfileBtn()
                .GotoRegPage()
                .CheckMark()
                .FinReg()
                .Email(firstName)
                .Password(password)
                .ConfirmPassword(password)
                .FinReg()
                .Email(email)
                .Password(password)
                .Password(incorrectPassword)
                .FinReg()
                .Email(email)
                .Password(incorrectPassword)
                .ConfirmPassword(password);
        Assert.assertTrue(registrationPageSteps.finRegBtn.isDisplayed());
        registrationPageSteps.FinReg()
                .ConfirmPassword(firstName)
                .CheckMark();
        Assert.assertFalse(registrationPageSteps.finRegBtn.isEnabled());
        registrationPageSteps.FinReg()
                .BackBtn();
        logInPageSteps.EmailS(incorrectPassword)
                .PasswordS(incorrectPassword);
        logInPageSteps.LogIn();

    }


}