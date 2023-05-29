package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class BasketPage {
    public SelenideElement
   searchInput = $("#small-searchterms", 0),
    searchBtn =  $(".h_search_btn"),
    iphoneSearch = $(byText("Apple iPhone 14 | 256GB Red"), 0),
    addBasket = $(".n-add-cart"),
    goToBasket = $(".header_basket"),
    countAddBtn = $(".fa-plus", 1),
    checkMarkBtn = $(".basket_h_title",0),
    checkMarkBtn2 = $(".basket_check_column",1),
     clearBasket = $("#clear-basket-button"),
    yesBtn = $(".confirm_button"),
    emptyBasket = $(byText("თქვენი კალათა ცარიელია")),
    stringPricel = $(".basket_unit_price_column ", 1),
    stringCountl = $(".basket_dropdown_quantity"),
    stringSumm = $("#cart-ordertotal");
}
