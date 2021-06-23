package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @FindBy(linkText = "Apparel")
    WebElement apparelLink;
    By d = By.linkText("");
    @FindBy(linkText = "Digital downloads")
    WebElement digitaldownloadsLink;

    @FindBy(linkText = "Books")
    WebElement booksLink;

    @FindBy(linkText = "Jewelry")
    WebElement jewelryLink;

    @FindBy(linkText = "Gift Cards")
    WebElement giftcardLink;

    public void clickOnCompterLink() {
        Reporter.log("Clicking on computer link" + computersLink.toString() + "<br>");
        clickOnElement(computersLink);
        log.info("Clicking on computer lin : " + computersLink.toString());

    }

    public void clickOnElectronicsLink() {
        Reporter.log("Clicking on electronics link " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
        log.info("Clicking on electronics link : " + electronicsLink.toString());

    }

    public void clickOnApparelLink() {
        Reporter.log("Clicking on apparel link" + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
        log.info("Clicking on apparel link : " + apparelLink.toString());

    }

    public void clickOnDigitalDownloadsLink() {
        Reporter.log("Clicking on digital downloads link" + digitaldownloadsLink.toString() + "<br>");
        clickOnElement(digitaldownloadsLink);
        log.info("Clicking on digital downloads link : " + digitaldownloadsLink.toString());
    }

    public void clickOnBooksLink() {
        Reporter.log("Clicking books link" + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
        log.info("Clicking books link : " + booksLink.toString());

    }

    public void clickOnJewelryLink() {
        Reporter.log("Clicking on jewelry link" + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
        log.info("Clicking on jewelry link : " + jewelryLink.toString());

    }

    public void clickOnGiftCardsLink() {
        Reporter.log("Clicking on giftcards link" + giftcardLink.toString() + "<br>");
        clickOnElement(giftcardLink);
        log.info("Clicking on giftcards link : " + giftcardLink.toString());


    }


}