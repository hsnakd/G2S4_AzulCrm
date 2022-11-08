package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sukru_US1530_File_UploadPage {
    public Sukru_US1530_File_UploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Message']")
    public WebElement message;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement upload;

    @FindBy(xpath = "//span[. = 'Select document from Bitrix24']")
    public WebElement selectFromBitrix;

    @FindBy(xpath = "//a[. = 'image (2).jpg']")
    public WebElement firstPicture;

    @FindBy(xpath = "//a[. = 'Static_Keyword.pdf']")
    public WebElement secondFile;

    @FindBy(xpath = "//a[. = 'Alerts_Iframes_Windows_Slides_B25 (1).pptx']")
    public WebElement thirdFile;

    @FindBy(xpath = "//span[.='Select document']")
    public WebElement selectButton;

    @FindBy(xpath = "//span[.='Insert in text']")
    public  WebElement insertInText;




}
