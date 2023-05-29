package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ZoomerProductpage {
    protected SelenideElement
            mobileBtn = $(byText("მობილურები"), 3),
            gamoshBtn = $(".dropdown", 1),
            sortBtn = $(byLinkText("ფასი: ზრდადობით")),
            getSortBtnK = $(byLinkText("ფასი: კლებადობით")),
            productPrice = $(".product_prices", 0),
            productNewPrice = $(".product_new_price"),
            countS =  $(".btn-primary");


    public ElementsCollection
            countPrdSize = $$(".product_top_div");


}
