package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Halil_US1536_UploadFilesPicturesPage {

    public Halil_US1536_UploadFilesPicturesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-message\"]/span")
    public WebElement messageButton;
    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;

    @FindBy(xpath = "(//span[.='Select document from Bitrix24'])[1]")
    public WebElement bitrix;
    @FindBy(xpath = "//a[.='image (2).jpg']")
    public WebElement firstFile;

    @FindBy(xpath = "(//a[.='Alerts_Iframes_Windows_Slides_B25 (1).pptx'])[2]")
    public WebElement secondFile;

    @FindBy(xpath = "(//a[.='Static_Keyword.pdf'])[2]")
    public WebElement thirdFile;

    @FindBy(xpath = "//a[.='Screen Shot 2022-09-21 at 11.37.01 (1).png']")
    public WebElement fourthFile;

    @FindBy(xpath = "//span[.='Select document']")
    public WebElement selectDocumentButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@id='check-in-text-n2295']")
    public WebElement firstInsertinTextButton;

    @FindBy(xpath = "//span[@id='check-in-text-n2294']")
    public WebElement secondInsertinTextButton;
    @FindBy(xpath = "//span[@id='check-in-text-n2293']")
    public WebElement thirdInsertinTextButton;

    @FindBy(xpath = "//span[@id='check-in-text-n2292']")
    public WebElement fourthInsertinTextButton;

    @FindBy(xpath = "//img[@id='disk-attach-image-383']")
    public WebElement uploadedPicture;

    @FindBy(xpath = "//body[@contenteditable='true']/img[1]")
    public WebElement firstInsertedFile;

@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "(//input[@id=\"diskuf-edit-rigths-doc\"])[1]")
    public WebElement clickBox;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement deleteBox;

    @FindBy(xpath = "//div[@class='diskuf-uploader']")
    public WebElement uploadImagesAndFilesButton;












}
