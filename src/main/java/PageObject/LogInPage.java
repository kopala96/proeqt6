package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class LogInPage {
       public SelenideElement
               profileBtn =  $(byText("პროფილი")),
               emailInput = $("#EmailOrPhone"),
               passwordInput = $("#Password"),
               logInBtn = $(byText("შესვლა"));




}
