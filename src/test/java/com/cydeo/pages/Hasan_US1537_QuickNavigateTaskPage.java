package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Hasan_US1537_QuickNavigateTaskPage {

    public Hasan_US1537_QuickNavigateTaskPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Task']")
    public WebElement taskLink;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement messageTitle;

    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriority;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form-responsible\"]/span[2]/a[1]")
    public WebElement addMoreButton;

    @FindBy(xpath = "//div[.='helpdesk1@cybertekschool.com']")
    public WebElement addPeople;

    @FindBy(xpath = "//span[@class='task-form-field-controls']")
    public WebElement addPeopleBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//a[@title='Tasks']")
    public WebElement taskLeftSide;

    @FindBy(xpath = "//span[.='High Priority']")
    public WebElement highPriorityCheck;

    @FindBy(xpath = "//a[@class='task-title task-status-text-color-accepted']")
    public WebElement taskName;



}
