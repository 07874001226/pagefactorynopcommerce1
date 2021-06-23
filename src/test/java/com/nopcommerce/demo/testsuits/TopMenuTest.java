package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        topMenuPage = new TopMenuPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToComputerPage() throws InterruptedException {
        // Thread.sleep(3000);
        topMenuPage.selectMenu("Computers");
        String expectedPageMessage = "Computers";
        String actualPageMessage = topMenuPage.verifyComputerPageNavigation();
        Assert.assertEquals(actualPageMessage, expectedPageMessage);
    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToElectronicsPage() throws InterruptedException {
        topMenuPage.selectMenu("Electronics");
        String expectedPageMessage1 = "Electronics";
        String actualPageMessage1 = topMenuPage.verifyElectronicsPageNavigation();
        Assert.assertEquals(actualPageMessage1, expectedPageMessage1);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToApparelPage() throws InterruptedException {
        topMenuPage.selectMenu("Apparel");
        String expectedPageMessage2 = "Apparel";
        String actualPageMessage2 = topMenuPage.verifyApparelPageNavigation();
        Assert.assertEquals(actualPageMessage2, expectedPageMessage2);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToDigitalDownloadsPage() throws InterruptedException {
        topMenuPage.selectMenu("Digital downloads");
        String expectedPageMessage3 = "Digital downloads";
        String actualPageMessage3 = topMenuPage.verifyDigitalDownloadsPageNavigation();
        Assert.assertEquals(actualPageMessage3, expectedPageMessage3);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToBooksPage() throws InterruptedException {
        topMenuPage.selectMenu("Books");
        String expectedPageMessage4 = "Books";
        String actualPageMessage4 = topMenuPage.verifyBooksPageNavigation();
        Assert.assertEquals(actualPageMessage4, expectedPageMessage4);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToJewelrtPage() throws InterruptedException {
        topMenuPage.selectMenu("Jewelry");
        String expectedPageMessage5 = "Jewelry";
        String actualPageMessage5 = topMenuPage.verifyJewelryPageNavigation();
        Assert.assertEquals(actualPageMessage5, expectedPageMessage5);
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToGiftCardsPage() throws InterruptedException {
        topMenuPage.selectMenu("Gift Cards");
        String expectedPageMessage6 = "Gift Cards";
        String actualPageMessage6 = topMenuPage.verifyGiftCardsPageNavigation();
        Assert.assertEquals(actualPageMessage6, expectedPageMessage6);
    }

}
