package com.cydeo.step_definitions;

import com.cydeo.pages.Hasan_US1537_QuickNavigateTaskPage;
import com.cydeo.pages.Nuri_US1533_PollPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.AnnotatedType;

public class Nuri_US1533_Poll_StepDefinitions {

    //@TC1
    //[US007]-[AZLC-1533]-[AC1]-[TC1]
    Nuri_US1533_PollPage pollPage = new Nuri_US1533_PollPage();

    @Given("click on the poll tab on the tab-menu")
    public void click_on_the_poll_tab_on_the_tab_menu() {
        pollPage.pollTab.click();
        BrowserUtils.waitFor(3);
    }


    @Given("user clicks on add more link  on contacts input box.")
    public void user_clicks_on_add_more_link_on_contacts_input_box() {
       pollPage.addMoreContacts.click();
        BrowserUtils.waitFor(1);

    }

    @Given("user clicks on employees and departments tag to add a group of contacts")
    public void user_clicks_on_employees_and_departments_tag_to_add_a_group_of_contacts() {
        pollPage.employeesAndDepartmentsGroupTag.click();
        BrowserUtils.waitFor(1);
    }

    @And("user clicks on {string} and then all employees as contact group")
    public void userClicksOnAndThenAllEmployeesAsContactGroup(String string) {
        pollPage.qaDepartmentGroupTag.click();
        BrowserUtils.waitFor(1);
        pollPage.allEmployeesCheckBox.click();
        BrowserUtils.waitFor(1);
    }



    @Given("user clicks on username {string} as contact name")
    public void user_clicks_on_username_as_contact_name(String string) {
        pollPage.usernameContactName.click();
        BrowserUtils.waitFor(1);
    }

    @Then("verify that employees of {string}  and username {string} is selected as multiple contacts")
    public void verifyThatEmployeesOfAndUsernameIsSelectedAsMultipleContacts(String string0, String string1) {System.out.println(pollPage.qaDepartmentText.getText());

        System.out.println("pollPage.qaDepartmentText.getText() = " + pollPage.qaDepartmentText.getText());
        String expectedGroupText = "QA department";
        String actualGroupText = pollPage.qaDepartmentText.getText();
        Assert.assertEquals(actualGroupText, expectedGroupText);

        System.out.println("pollPage.usernameText.getText() = " + pollPage.usernameText.getText());
        String expectedUsernameText = "hr77@cybertekschool.com";
        String actualUsernameText = pollPage.usernameText.getText();
        Assert.assertEquals(actualUsernameText, expectedUsernameText);

        
    }

}//endclass
