package com.automation.uitests;

import com.automation.PageData;
import com.automation.PageDataOrbitz;
import com.automation.pageobjects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrbitzResultsPageTests extends BaseTest{

    String goingToName = "Miami Beach";
    String checkInDate = "07/20/2019";
    String checkOutDate = "07/27/2019";
    int adultsNumber = 4;
    int childrenNumber = 1;
    int ageFirstChild = 7;
    String propertyName = "Faena Hotel Miami Beach";
    OrbitzHomePage home1;
    OrbitzResultsPage result1;

    String goingFrom = "LAS";
    String goingTo = "LAX";
    int adults = 1;
    int childs = 0;




    @BeforeMethod(alwaysRun = true)
    public void loadPage() throws InterruptedException {
        home1 = new OrbitzHomePage(myDriver.getDriver());
        //data = new PageData(OrbitzResultsPageTests.class.getSimpleName());
        result1 = home1.performSearch(goingToName,checkInDate, checkOutDate, adultsNumber, childrenNumber, ageFirstChild);
    }

    @Test
    public void searchHotel_Correct() {
        Assert.assertNotEquals(result1.flexList.size(), 0, "List came empty");
    }

    @Test(enabled = false)
    public void searchByProperty_Correct() {
        result1.searchByProperty(propertyName);
        Assert.assertEquals("a", "a");
    }

    @Test
    public void searchFlight_Correct(){
        result1 = home1.performFlySearch(goingFrom, goingTo, adults, childs);
    }

}
