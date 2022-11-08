package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogoutPage {

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileUsername;

    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    public WebElement mail;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement logout;

    @FindBy(xpath = "//span[@class='menu-item-link-text']")
    public WebElement activityStream;




}
