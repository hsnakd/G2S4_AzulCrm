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


    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement messageArea;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement messageCancelButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement messageSendButton ;


    @FindBy(xpath = "//span[@class='feed-add-post-destination-text'][.='All employees']")
    public WebElement allEmployees;


}
