package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.BuildYourOwnComputerProductPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    DesktopPage desktopPage;
    HomePage homePage;
    BuildYourOwnComputerProductPage buildYourOwnComputerProductPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        desktopPage = new DesktopPage();
        homePage = new HomePage();
        buildYourOwnComputerProductPage = new BuildYourOwnComputerProductPage();
    }

    @Test(groups = {"smoke", "sanity", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        homePage.clickOnCompterLink();
        Thread.sleep(1000);
        desktopPage.setClickOnDesktopLink();
        desktopPage.setSelectOnZtoA("6");
        Thread.sleep(2000);
        List<WebElement> desktop;
        desktop = desktopPage.setVerifyProductDescending();
        List<String> desktopList = new ArrayList<>();
        for (WebElement productname : desktop) {

            desktopList.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(desktopList);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(desktopList);
        System.out.println(tempList);
        Assert.assertEquals(desktopList, tempList);

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        homePage.clickOnCompterLink();
        Thread.sleep(1000);
        desktopPage.setClickOnDesktopLink();
        desktopPage.setGetSelectOnAtoZ("5");
        Thread.sleep(1000);
        desktopPage.setAddToCart();
        String expectedmessage = "Build your own computer";
        String actualmessage = buildYourOwnComputerProductPage.verifyBuildYourOwnComputer();
        Assert.assertEquals(expectedmessage, actualmessage);
        //Thread.sleep(1000);
        buildYourOwnComputerProductPage.selectTheProcesser("1");
        //Thread.sleep(1000);
        buildYourOwnComputerProductPage.setSelectRam("5");
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnHdd();
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnOsRadio();
        buildYourOwnComputerProductPage.clickOnMicrosoftOffice();
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnMicrosoftOffice();
        buildYourOwnComputerProductPage.clickOnTotalCommender();
        //Thread.sleep(1000);
        String expectedPrice = "$1,475.00";
        Thread.sleep(1000);
        String actualPrice = buildYourOwnComputerProductPage.verifyThePrice();
        Assert.assertEquals(expectedPrice, actualPrice);
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.clickOnAddtoCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputerProductPage.verifyTopGreenBarMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(1000);
        buildYourOwnComputerProductPage.setCloseTab();
    }

}
