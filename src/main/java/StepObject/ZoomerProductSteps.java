package StepObject;

import PageObject.ZoomerProductpage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ZoomerProductSteps extends ZoomerProductpage {
    @Step("მობილურების გვერდის გახსნა ")
    public ZoomerProductSteps MobileBtn() {
        mobileBtn.click();

        return this;
    }

    @Step("ჩამოვხსნათ რომ ავირჩიოთ ფასი ზრდადობით გვინდა თუ კლებადობით")
    public ZoomerProductSteps GamoshBtn() {
        gamoshBtn.click();

        return this;
    }

    @Step("ფასი ზრდადობით")
    public ZoomerProductSteps SortBtn() {
        sortBtn.click();

        return this;

    }

    @Step("ფასი კლებადობით")
    public ZoomerProductSteps SortBtnK() {
        getSortBtnK.click();

        return this;

    }

    @Step("ფასი ზრდადობით ფილტრის შემოწმება")
    public ZoomerProductSteps checkfilter() {

        int count = countPrdSize.size();
        String price = productPrice.$(".product_new_price").getText().replaceAll("[^\\d.]", "");
        System.out.println(price);
        System.out.println(count);
        float firstPriceFl = Float.parseFloat(price);
        System.out.println(firstPriceFl);
        for (int i = 1; i < count; i++) {
            String secondPrice = $(".product_prices", i).$(".product_new_price").getText().replaceAll("[^\\d.]", "");
            float secondPriceFl = Float.parseFloat(secondPrice);
            Assert.assertTrue(secondPriceFl >= firstPriceFl);
            System.out.println(secondPriceFl);
            firstPriceFl = secondPriceFl;

        }
        return this;
    }

    @Step("ფასი კლებადობით ფილტრის შემოწმება")
    public ZoomerProductSteps checkfilterN() {

        int count = countPrdSize.size();
        String price = productPrice.$(".product_new_price").getText().replaceAll("[^\\d.]", "");
        System.out.println(price);
        System.out.println(count);
        float firstPriceFl = Float.parseFloat(price);
        System.out.println(firstPriceFl);
        for (int i = 1; i < count; i++) {
            String secondPrice = $(".product_prices", i).$(".product_new_price").getText().replaceAll("[^\\d.]", "");
            float secondPriceFl = Float.parseFloat(secondPrice);
            Assert.assertTrue(secondPriceFl <= firstPriceFl);
            System.out.println(secondPriceFl);
            firstPriceFl = secondPriceFl;


        }
        return this;
    }

    @Step("შევამოწმოთ პროდუქტის რაოდენობა")
    public ZoomerProductSteps checkCount() {
        int count = countPrdSize.size();
        String price = productPrice.$(".product_new_price").getText().replaceAll("[^\\d.]", "");
        System.out.println(price);
        System.out.println(count);
        String counts = countS.getText();
        int i = Integer.parseInt(counts);
        System.out.println(counts);
        Assert.assertTrue(count == i);
        if (count == i) {
            System.out.println("true");

        }
        return this;
    }

}