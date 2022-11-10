package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Nuri_US1533_PollPage {

    public Nuri_US1533_PollPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement pollTab;

    @FindBy(xpath = "//ol[@class='feed-add-post-strings-blocks']")
    public WebElement addMoreContacts;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartmentsGroupTag;

    @FindBy(xpath = "//div[.='QA department']")
    public WebElement qaDepartmentGroupTag;

    @FindBy(xpath = "//div[@rel='QA department: All department and subdepartment employees']")
    public WebElement allEmployeesCheckBox;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-info']//div[.='hr77@cybertekschool.com']")
    public WebElement usernameContactName;

    @FindBy(xpath = "//span[.='QA department']/span")
    public WebElement qaDepartmentText;
    //span[@id='feed-add-post-destination-item']/span/span
    @FindBy(xpath = "//span[.='hr77@cybertekschool.com']/span")
    public WebElement usernameText;







}
