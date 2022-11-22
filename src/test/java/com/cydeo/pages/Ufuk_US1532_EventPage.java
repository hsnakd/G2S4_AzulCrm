package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ufuk_US1532_EventPage {

    public Ufuk_US1532_EventPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Event']/span")
    public WebElement eventButton;

    @FindBy(xpath ="//input[@id='feed-cal-event-namecal_3Jcl']")
    public WebElement eventName;


    @FindBy(xpath ="//input[@name='DATE_FROM']")
    public WebElement startDate;


    @FindBy(xpath ="//input[@name='TIME_FROM_']")
    public WebElement startTime;

    @FindBy(xpath ="//input[@value='Set Time']")
    public WebElement startSetTime;

    @FindBy(xpath ="//input[@name='DATE_TO']")
    public WebElement finishDate;



    @FindBy(xpath ="//input[@name='TIME_TO_']")
    public WebElement finishTime;


    @FindBy(xpath ="//input[@value='Set Time']")
    public WebElement finishSetTime;


    @FindBy(xpath ="//*[@name='EVENT_FULL_DAY']")
    public WebElement allDay;


    @FindBy(xpath ="//input[@name='EVENT_REMIND_COUNT']")
    public WebElement remindCount;


    @FindBy(xpath ="//input[@name='EVENT_REMIND_COUNT']")
    public WebElement remindUnit;


    @FindBy(xpath ="//input[@name='EVENT_LOCATION']")
    public WebElement eventLocation;


    @FindBy(xpath = "//span[.='Specify time zone']")
    public WebElement timeZoneCheck;

    @FindBy(xpath ="//select[@id='feed-cal-tz-fromcal_3Jcl']")
    public WebElement timeZone1;

    @FindBy(xpath ="//select[@id='feed-cal-tz-tocal_3Jcl']")
    public WebElement timeZone2;


    @FindBy(xpath ="//input[@id='feed-event-dest-input']")
    public WebElement members;

    @FindBy(xpath ="//a[@id='feed-event-dest-add-link']")
    public WebElement membersLink;


   @FindBy(xpath ="//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


    @FindBy(xpath ="//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;


    @FindBy(xpath ="(//*[contains(@id,'feed-event-view-link')])[1]")
    public WebElement eventDisplay;




}
