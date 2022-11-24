package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Nuri_US1533_PollPage {

    public Nuri_US1533_PollPage() {
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


    //TC2

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement pollTitleBox;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionBox;

    @FindBy(xpath = "//div[@class='vote-block-title-wrap']/input")
    public WebElement questionBox1;

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
    @FindBy(xpath = "//div[.='how many?']")
    public WebElement addedPollQuestion;

    @FindBy(xpath = "//label[.='one']")
    public WebElement addedPollAnswer1;
    @FindBy(xpath = "//label[.='two']")
    public WebElement addedPollAnswer2;
    @FindBy(xpath = "//label[.='three']")
    public WebElement addedPollAnswer3;


    //TC3
    @FindBy(xpath = "//label[@title='Delete question']")
    public WebElement XQuestion;


    @FindBy(xpath = "//label[@class='vote-block-close dela']")
    public WebElement XAnswer1;
    //label[@title='Delete answer']
    //label[@class='vote-block-close dela']

//input[@data-bx-answer-field= 'field-type']
    //input[@id='answer_0__0_']
    //label[@for='answer_0__0_']

//label[@title='Delete answer']
    //input[@id='answer_0__0_']


    //TC4
    @FindBy(xpath = "//label[@class= 'vote-checkbox-label']")
    public WebElement allowMultipleChoiceCheckbox;

    @FindBy(xpath = "//div//label[@for='vote_checkbox_134_346'][2]")
    public WebElement answer1Text;
    //label[.='Answer 1']

    @FindBy(xpath = "//div//label[@for='vote_checkbox_134_347'][2]")
    public WebElement answer2Text;
    //label[.='Answer 2']
    @FindBy(xpath = "//div//label[@for='vote_checkbox_134_348'][2]")
    public WebElement answer3Text;
    //label[.='Answer 3']

    @FindBy(xpath = "//input[@name='vote_checkbox_134[]']")
    public WebElement answer1CheckBox;
    //input[@name='vote_checkbox_134[]']
    //   (//input[@name='vote_checkbox_120[]'])[1]
    //span[@class='bx-vote-block-inp-substitute']
    @FindBy(xpath = "(//input[@name='vote_checkbox_134[]'])[2]")
    public WebElement answer2CheckBox;
    @FindBy(xpath = "(//input[@name='vote_checkbox_134[]'])[3]")
    public WebElement answer3CheckBox;


    //TC5

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement emptyfieldAlertText;

    @FindBy(xpath = " //span[@class='feed-add-post-del-but']")
    public WebElement hoverToRemoveallEmpoyeesRecipient;
//span[@class='feed-add-post-destination feed-add-post-destination-all-users feed-add-post-destination-hover']



    @FindBy(xpath = "")
    public WebElement xyz;
}