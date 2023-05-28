package StepObject;

import PageObject.LogInPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LogInPageSteps extends LogInPage {
    @Step("ავტორიზაციის გვერძე გადასვლა ")
    public LogInPageSteps ProfileBtn() {
        profileBtn.click();
        profileBtn.shouldBe(Condition.enabled);
        return this;
    }
    @Step("იმეილის ველში იმეილის ჩაწერა და შემოწმება რომ ცარიელი არ არის : {email}")
    public LogInPageSteps EmailS (String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step("პაროლის ველში პაროლის  ჩაწერა და შემოწმება რომ ცარიელი არ არის : {password}")
    public LogInPageSteps PasswordS (String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
}
    @Step("დალოგინება ")
    public LogInPageSteps LogIn () {
        logInBtn.click();
        return this;
    }

}
