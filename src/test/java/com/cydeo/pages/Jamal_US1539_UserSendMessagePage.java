package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jamal_US1539_UserSendMessagePage {

    public Jamal_US1539_UserSendMessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    String person1 = "helpdesk1@cybertekschool.com";


    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement messageAreaClick;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement messageCancelButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement messageSendButton ;



    @FindBy(xpath = "//span[@id='feed-post-more-2784']")
    public WebElement moreButton;


    @FindBy(xpath = "//span[@class='menu-popup-item-text'][.='Delete']")
    public WebElement DeleteButton;








}
