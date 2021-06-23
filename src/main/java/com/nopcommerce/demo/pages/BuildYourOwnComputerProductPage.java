package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class BuildYourOwnComputerProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerProductPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;
    @FindBy(id = "product_attribute_1")
    WebElement selectProcesser;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']")
    WebElement hddRadio;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadio;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microSoftOffice;
    @FindBy(xpath = "//input[@name='product_attribute_5' and @id='product_attribute_5_12']")
    WebElement totalCammandor;
    //@FindBy (xpath = "//span[text()='$1,475.00']")
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addCartButton;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement verifyMessage;
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeTab;


    public String verifyBuildYourOwnComputer() {
        Reporter.log("Build Your Computer" + buildYourOwnComputer.toString() + "<br>");
        log.info("Build Your Computer : " + buildYourOwnComputer.toString());
        return getTextFromElement(buildYourOwnComputer);
    }
    public void selectTheProcesser(String processor) {
        Reporter.log("Select The Processer" + selectProcesser.toString() + "<br>");
        selectByValueFromDropDown(selectProcesser, processor);
        log.info("Select The Processer : " + selectProcesser.toString());
    }

    public void setSelectRam(String ram) {
        Reporter.log("Set Select Ram" + selectRam.toString() + "<br>");
        selectByValueFromDropDown(selectRam, ram);
        log.info("Set Select Ram : " + selectRam.toString());
    }

//    public void selectTheProcesser(String processor) {
//        Reporter.log("Select The Processer" + selectProcesser.toString() + "<br>");
//        selectByValueFromDropDown(selectProcesser, processor);
//        log.info("Select The Processer : " + selectProcesser.toString());
//    }
//
//    public void setSelectRam(int ram) {
//        Reporter.log("Set Select Ram" + selectRam.toString() + "<br>");
//        selectByIndex(selectRam, ram);
//        log.info("Set Select Ram : " + selectRam.toString());
//    }

    public void clickOnHdd() {
        Reporter.log("On Hdd" + hddRadio.toString() + "<br>");
        clickOnElement(hddRadio);
        log.info("On Hdd: " + hddRadio.toString());
    }

    public void clickOnOsRadio() {
        Reporter.log("On Os Radio" + osRadio.toString() + "<br>");
        clickOnElement(osRadio);
        log.info("On Os Radio: " + osRadio.toString());
    }

    public void clickOnMicrosoftOffice() {
        Reporter.log("Microsoft Office" + microSoftOffice.toString() + "<br>");
        clickOnElement(microSoftOffice);
        log.info("Microsoft Office: " + microSoftOffice.toString());
    }

    public void clickOnTotalCommender() {
        Reporter.log("Total Commender" + totalCammandor.toString() + "<br>");
        clickOnElement(totalCammandor);
        log.info("Total Commender: " + totalCammandor.toString());
    }

    public String verifyThePrice() {
        Reporter.log("Verify Price" + verifyPrice.toString() + "<br>");
        log.info("Verify Price : " + verifyPrice.toString());
        return getTextFromElement(verifyPrice);

    }

    public void clickOnAddtoCartButton() {
        Reporter.log("Add to Cart" + addCartButton.toString() + "<br>");
        clickOnElement(addCartButton);
        log.info("Add to Cart: " + addCartButton.toString());
    }

    public String verifyTopGreenBarMessage() {
        Reporter.log("Verify Message" + verifyMessage.toString() + "<br>");
        log.info("Verify Message : " + verifyMessage.toString());
        return getTextFromElement(verifyMessage);

    }

    public void setCloseTab() {
        Reporter.log("Build Your Computer" + buildYourOwnComputer.toString() + "<br>");
        clickOnElement(closeTab);
        log.info("Build Your Computer : " + buildYourOwnComputer.toString());
    }
}
