package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement


            closeBtn = $(byClassName("close_popup"), 1),
            profileBtn = $(byText("პროფილი")),
            regBtn = $(".registration_link"),
            emailInput = $(byName("Email")),


    passwordInput = $(byId("register-password")),


    confirmPasswordInput = $(byId("ConfirmPassword")),


    checkMarkBtn = $(".checkmark", 0),
            finRegBtn = $(byText("რეგისტრაცია"), 2),

    backBtn = $(".fa-angle-left");

}
