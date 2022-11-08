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

    @FindBy(xpath = "//body[@class='vsc-initialized']")
    public WebElement messageBox1;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/iframe[1]")
    public WebElement messageBox;

    @FindBy(xpath = "//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add']")
    public WebElement addMoreButton;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement iframe;

    @FindBy(xpath = "")
    public WebElement a;

    @FindBy(xpath = "//*[@id='bx-html-editor-iframe-cnt-lifefeed_task_form']//iframe")
    public WebElement bxEditorIframe;



}
