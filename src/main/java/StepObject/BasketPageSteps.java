package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;


public class BasketPageSteps extends BasketPage {
    @Step("სერჩში ტექსტის ჩაწერა : {iphone}")
    public BasketPageSteps Search (String iphone){
        searchInput.setValue(iphone);
        return this;
    }
    @Step("დასერჩვა ")
    public BasketPageSteps SearchBtn () {
        searchBtn.click();
        return this;
    }
    @Step("პროდუქტზე გადასვლა ")
    public BasketPageSteps IphoneSearch () {
        iphoneSearch.click();
        return this;
    }
    @Step("კალათაში დამატება ")
    public BasketPageSteps AddBasket () {
        addBasket.click();

        return this;
    }
    @Step("კალათაში გადასვლა ")
    public BasketPageSteps GoToBasket () {
        goToBasket.click();
        goToBasket.shouldBe(visible,Duration.ofMillis(8000)).click();
        return this;
    }
    @Step("რაოდენობის გაზრდა")
    public BasketPageSteps CountAddBtn () {
        countAddBtn.click();
        countAddBtn.shouldBe(visible,Duration.ofMillis(15000)).click();
        return this;
    }
    @Step("ჩექბოქსის მონიშვნა")
    public BasketPageSteps CheckMark () {
       checkMarkBtn.$(byTagName("span")).click();
       //checkMarkBtn.shouldBe(Condition.visible);
        return this;
    }
    @Step("ჩექბოქსის მონიშვნა")
    public BasketPageSteps CheckMark2 () {
        checkMarkBtn2.shouldBe(visible);
        return this;
    }
    @Step("კალათის გასუფთავება")
    public BasketPageSteps ClearBasket () {
        clearBasket.click();
        return this;
    }
    @Step("დიახ ღილაკი. თანახმა ხართ რომ წაშალოთ კალათიდან")
    public BasketPageSteps ClickYes () {
        yesBtn.click();
        return this;
    }
    @Step("ცარიელია კალათა ტექსტი")
    public BasketPageSteps EmptyBasket () {
        emptyBasket.shouldBe(visible);
        return this;
    }




    @Step("გავზარდე ფასი და შევადარე რომ ჯამი ტოლია რაოდენობა გამრავლებული ფასზე")
    public BasketPageSteps BasketCountPrice(){
        countAddBtn.click();
        sleep(7000);
        String priceL = stringPricel.getText().replaceAll("[^\\d.]", "");
        String countL = stringCountl.$(byTagName("input")).getValue();
        String summ = stringSumm.getText().replaceAll("[^\\d.]", "");
        float sum = Float.parseFloat(summ);
        int count = Integer.parseInt(countL);
        float price = Float.parseFloat(priceL);
        System.out.println(count);
        System.out.println(sum);
        System.out.println(price);
        Assert.assertTrue(count > 1);
        Assert.assertTrue(sum == (count * price), "ჯამი ტოლია რაოდენობა გამრავლებული ფასზე");


        return this;
    }


}
