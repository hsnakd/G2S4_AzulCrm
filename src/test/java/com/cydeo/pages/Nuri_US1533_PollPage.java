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


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement pollTitleBox;


    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionBox;

    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answerBox1;
    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answerBox2;
    @FindBy(xpath = "//input[@id='answer_0__2_']")
    public WebElement answerBox3;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    //message :"how are you today?" "good" "perfect" "not bad"
    @FindBy(xpath = "")
    public WebElement addedPollTitle;
    @FindBy(xpath = "//div[.='how are you today?']")
    public WebElement addedPollQuestion;

    @FindBy(xpath = "//label[.='good']")
    public WebElement addedPollAnswer1;
    @FindBy(xpath = "//label[.='perfect']")
    public WebElement addedPollAnswer2;
    @FindBy(xpath = "//label[.='not bad']")
    public WebElement addedPollAnswer3;




}