package com.automation.pageobjects;

import com.automation.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage extends BasePage {

    public HotelsPage(WebDriver driver){
        super(driver);
    }



    /*@FindBy(xpath="//h1[@id='firstHeading']")
    private WebElement articleTitle;

    public String getArticleTitle() {
        return articleTitle.getText();
    }

     */
}
