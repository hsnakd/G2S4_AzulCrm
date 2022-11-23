package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zilale_US1535_FilterAndSearchPage {

    public Zilale_US1535_FilterAndSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1
    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement filterSearch;

    @FindBy(xpath = "//div[@data-id='work']")
    public WebElement workFilter;

    @FindBy(xpath = "//div[@data-id='favorites']")
    public WebElement favoritesFilter;

    @FindBy(xpath = "//div[@data-id='my']")
    public WebElement myActivityFilter;

    @FindBy(xpath = "//div[@data-id='important']")
    public WebElement announcementsFilter;

    @FindBy(xpath = "//div[@data-id='bizproc']")
    public WebElement workflowsFilter;

    //2

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addFieldFunction;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='Date']")
    public WebElement dateCheckbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='Type']")
    public WebElement typeCheckbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='Author']")
    public WebElement authorCheckbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='To']")
    public WebElement toCheckbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='Favorites']")
    public WebElement favoritesCheckbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='Tag']")
    public WebElement tagCheckbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][.='Extranet']")
    public WebElement extranetCheckbox;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement resetFunction;


    //3
    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateDropdown;

    //4
    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    public WebElement typeDropdown;

    //5
    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilterFunction;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement setFilterName;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveFilterName;

    //6
    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreFields;


    //7
    @FindBy(xpath = "//span[@class='main-ui-filter-add-edit']")
    public WebElement configureFilterFunction;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-button-item']")
    public WebElement resetToDefaultFunction;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continuePopup;






}
