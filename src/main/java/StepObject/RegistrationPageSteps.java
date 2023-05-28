package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class RegistrationPageSteps extends RegistrationPage {

    @Step("პროფილის გვერდის გახსნა")
    public RegistrationPageSteps ProfileBtn() {
        profileBtn.click();
        profileBtn.shouldBe(Condition.enabled);
        return this;

    }
    @Step("რეგისტრაციაზე გადასვლა")
    public RegistrationPageSteps GotoRegPage() {
        regBtn.click();

        return this;
    }
    @Step("იმეილის ველში იმეილის ჩაწერა : {email}")
    public RegistrationPageSteps Email(String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;

    }

    @Step("პაროლის ველში პაროლის ჩაწერა : {pass}")
    public RegistrationPageSteps Password(String pass) {
        passwordInput.setValue(pass);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("გაიმეორეთ პაროლის ველში პაროლის ჩაწერა : {pass}")
    public RegistrationPageSteps ConfirmPassword(String pass) {
        confirmPasswordInput.setValue(pass);
        confirmPasswordInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("რეგისტრაციის ღილაკი ")
    public RegistrationPageSteps FinReg() {
        finRegBtn.click();
        return this;

    }
    @Step("მონიშვნა ჩექბოქსის ")
    public RegistrationPageSteps CheckMark() {
        checkMarkBtn.click();
        checkMarkBtn.shouldBe(Condition.visible);
        return this;

    }
    @Step("უკვე გავლილი გაქვთ რეგისტრაცია ამ ფანჯარის გამორთვა")
    public RegistrationPageSteps Close() {
        closeBtn.click();
        return this;

    }
    @Step("უკან დაბრუნება ავტორიზაციის გვერძე ")
    public RegistrationPageSteps BackBtn () {
        backBtn.click();
        backBtn.shouldBe(Condition.enabled);
        return this;
    }
}