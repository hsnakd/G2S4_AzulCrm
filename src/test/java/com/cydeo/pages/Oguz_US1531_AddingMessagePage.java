package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oguz_US1531_AddingMessagePage {

    public Oguz_US1531_AddingMessagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement message;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageBodyIframe;

    @FindBy(xpath = "//blockquote")
    public WebElement blockquote;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextBox;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkUrlBox;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement linkUrlBoxForVideo;

    @FindBy(xpath = "//img[@class='bxhtmled-surrogate-dd']")
    public WebElement videoElementInBody;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveLinkBtn;

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement cancelLinkBtn;

    @FindBy(linkText = "this text in order for test")
    public WebElement linkTextInBody;

    @FindBy(id = "bx-b-video-blogPostForm")
    public WebElement insertVideBtn ;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoSourceBox;

    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement quoteBtn;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteTextArea;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement tagBtn;

    @FindBy(xpath = "//input[@id='TAGS_blogPostForm67abSn']")
    public WebElement tagTextBox;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement addTagBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-tags']")
    public WebElement tagsArea;

    @FindBy(xpath = "//span[@class='feed-add-post-tags']//span")
    public WebElement crossOnTag;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionBtn ;

    @FindBy(xpath = "(//span[.='Record Video'])[1]")
    public WebElement recordBtn;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination feed-add-post-destination-all-users']//span)[2]")
    public WebElement allEmployeesCross;

    @FindBy(id = "feed-add-post-destination-item")
    public WebElement allEmployees;

    @FindBy(id = "bx-destination-tag")
    public WebElement addPersonGroupsDepartmentBtn;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement addEmployeesAndDepartments;

    @FindBy(xpath = "//div[.='group2.2']")
    public WebElement group2_2;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-check-arrow'])[4]")
    public WebElement group2_2AllDepartmentRadioBox;

    @FindBy(xpath = "//body[@class='vsc-initialized']")
    public WebElement messageBody;

    @FindBy(xpath = "(//div[.='helpdesk49@cybertekschool.com'])")
    public WebElement helpdesk49;

    @FindBy(xpath = "//span[.='helpdesk1@cybertekschool.com']")
    public WebElement helpdesk1InBody;

    @FindBy(xpath = "//span[@class='feed-add-post-tags-add']")
    public WebElement addMoreTagBtn;

    @FindBy(xpath = "//div[@class='feed-add-post-tags-wrap']/span")
    public WebElement childOfTagBtn;


    @FindBy(xpath = "//label[.='Video title:']")
    public WebElement videoTitle;



}
