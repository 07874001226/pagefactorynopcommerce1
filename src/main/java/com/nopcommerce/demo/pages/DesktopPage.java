package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(xpath = "//a[text()=' Desktops ']")
    WebElement clickOnDesktopLink;
    @FindBy(id = "products-orderby")
    WebElement selectOnZtoA;
    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> verifyProductDescending;
    @FindBy(id = "products-orderby")
    WebElement getSelectOnAtoZ;
    @FindBy(xpath = "//div[@class='item-box'][1]//button[text()='Add to cart']")
    WebElement addToCart;


    public void setClickOnDesktopLink() {
        Reporter.log("Click on Desktop" + clickOnDesktopLink.toString() + "<br>");
        clickOnElement(clickOnDesktopLink);
        log.info("Click on Desktop : " + clickOnDesktopLink.toString());
    }

    public void setSelectOnZtoA(String value) {
        Reporter.log("Select On Alphabeticaly Reverse" + selectOnZtoA.toString() + "<br>");
        selectByValueFromDropDown(selectOnZtoA, value);
        log.info("Select On Alphabeticaly Reverse : " + selectOnZtoA.toString());
    }

    public List setVerifyProductDescending() {
        Reporter.log("Verify product Desceding Order" + verifyProductDescending.toString() + "<br>");
        log.info("Verify product Desceding Order : " + verifyProductDescending.toString());
        return getListOfElements(verifyProductDescending);
    }

    public void setGetSelectOnAtoZ(String value) {
        Reporter.log("Select On Alphabeticaly" + getSelectOnAtoZ.toString() + "<br>");
        selectByValueFromDropDown(getSelectOnAtoZ, value);
        log.info("Select On Alphabeticaly : " + getSelectOnAtoZ.toString());
    }


    public void setAddToCart() {
        Reporter.log("Add to cart" + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        log.info("Add to cart : " + addToCart.toString());

    }

}








