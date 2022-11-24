package com.cydeo.step_definitions;

import com.cydeo.pages.Zilale_US1535_FilterAndSearchPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Zilale_US1535_FilterAndSearch {
    
    Zilale_US1535_FilterAndSearchPage filterAndSearch = new Zilale_US1535_FilterAndSearchPage();


    //1.User should be able to see default filters as "my activity, work, favorite,announcements, and workflows"
    @When("User clicks the Filter and search on the active stream")
    public void userClicksTheFilterAndSearchOnTheActiveStream() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that user should see default filters as my activity,work,favorite,announcement,workflows")
    public void verifyThatUserShouldSeeDefaultFiltersAsMyActivityWorkFavoriteAnnouncementWorkflows() {
        Assert.assertTrue(filterAndSearch.workFilter.isDisplayed());
        System.out.println("Work Filter");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(filterAndSearch.favoritesFilter.isDisplayed());
        System.out.println("Favorites Filter");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(filterAndSearch.myActivityFilter.isDisplayed());
        System.out.println("Activity Filter");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(filterAndSearch.announcementsFilter.isDisplayed());
        System.out.println("Announcement Filter");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(filterAndSearch.workflowsFilter.isDisplayed());
        System.out.println("Workflows Filter");
        BrowserUtils.waitFor(2);



    }



    //2. User should be able to add and remove fields.

    @When("User clicks Add field function")
    public void userClicksAddFieldFunction() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.addFieldFunction.click();
        BrowserUtils.waitFor(2);
    }

    @And("Clicks Data,Type,Author,To functions to remove fields")
    public void clicksDataTypeAuthorToFunctionsToRemoveFields() {
        filterAndSearch.dateCheckbox.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.typeCheckbox.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.authorCheckbox.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.toCheckbox.click();
        BrowserUtils.waitFor(2);

    }

    @And("Clicks Favorites,Tag,Extranet functions to add fields")
    public void clicksFavoritesTagExtranetFunctionsToAddFields() {
        filterAndSearch.favoritesCheckbox.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.tagCheckbox.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.extranetCheckbox.click();
        BrowserUtils.waitFor(2);

    }

    @And("Clicks Reset function after add and remove process")
    public void clicksResetFunctionAfterAddAndRemoveProcess() {
        filterAndSearch.resetFunction.click();
        BrowserUtils.waitFor(2);
    }

    /*@Then("Verify that fields are movable")
    public void verifyThatFieldsAreMovable() {
        boolean checkBox1 = filterAndSearch.dateCheckbox.isDisplayed();
        BrowserUtils.waitFor(2);
        filterAndSearch.dateCheckbox.click();
        BrowserUtils.waitFor(2);
        Assert.assertNotEquals(checkBox1,filterAndSearch.dateCheckbox.isDisplayed());

    }*/


    //3.User should be able to search by specifying the Date,
    @When("User clicks Date list")
    public void userClicksDateList() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.dateDropdown.click();
        BrowserUtils.waitFor(2);
    }

    @And("Search by specifying the date")
    public void searchBySpecifyingTheDate() {
        filterAndSearch.exactDate.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.giveDate.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.date16.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.searchButton.click();
        BrowserUtils.waitFor(2);


    }

    @Then("Verify that search by specifying the Date is working")
    public void verifyThatSearchBySpecifyingTheDateIsWorking() {
        Assert.assertTrue(filterAndSearch.dateIsDisplayed.isDisplayed());
        BrowserUtils.waitFor(2);
    }


    //4.User should be able to search by selecting single or multiple types,
    @When("User selects one or more options in the type function")
    public void userSelectsOneOrMoreOptionsInTheTypeFunction() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);
        System.out.println("DropDown before click");
        filterAndSearch.typeDropdown.click();
        BrowserUtils.waitFor(2);
        System.out.println("DropDown after click");



        //filterAndSearch.postsCheckbox.click();
        //BrowserUtils.waitFor(2);
        //filterAndSearch.appreciationsCheckbox.click();
        //BrowserUtils.waitFor(2);

    }

    //@Then("Verify that search by selecting single and multiple types")
    //public void verifyThatSearchBySelectingSingleAndMultipleTypes() {
    //    Assert.assertTrue(filterAndSearch.postsCheckbox.isEnabled());
    //    BrowserUtils.waitFor(2);
    //    Assert.assertTrue(filterAndSearch.appreciationsCheckbox.isEnabled());
    //    BrowserUtils.waitFor(2);
   // }


    //5. User should be able to save the filter
    @When("User clicks SAVE FILTER function")
    public void userClicksSAVEFILTERFunction() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.saveFilterFunction.click();
        BrowserUtils.waitFor(2);
    }

    @And("User sets the filter name")
    public void userSetsTheFilterName() {
        filterAndSearch.setFilterName.sendKeys("Test1");
        BrowserUtils.waitFor(2);
        
    }

    @Then ("Verify User clicks SAVE function to save the filter name")
    public void userClicksSAVEFunctionToSaveTheFilterName() {
        filterAndSearch.saveFilterName.click();
        BrowserUtils.waitFor(2);
    }




    //6. User should be able to restore the default field,
    @When("User clicks Restore default field function")
    public void userClicksRestoreDefaultFieldFunction() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);

        filterAndSearch.restoreFields.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that User should be able to restore the default field")
    public void verifyThatUserShouldBeAbleToRestoreTheDefaultField() {
        Assert.assertTrue(filterAndSearch.restoreFields.isEnabled());
        BrowserUtils.waitFor(2);
    }


    //7.User should be able to reset filters to default.
    @When("User clicks Configure filter function")
    public void userClicksConfigureFilterFunction() {
        filterAndSearch.filterSearch.click();
        BrowserUtils.waitFor(2);
        filterAndSearch.configureFilterFunction.click();
        BrowserUtils.waitFor(2);
    }

    @And("User clicks Reset to default function")
    public void userClicksResetToDefaultFunction() {
        filterAndSearch.resetToDefaultFunction.click();
        BrowserUtils.waitFor(2);
    }

    @And("User clicks CONTINUE to reset filters to default")
    public void userClicksCONTINUEToResetFiltersToDefault() {
        filterAndSearch.continuePopup.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify that user should be able to reset filters to default")
    public void verifyThatUserShouldBeAbleToResetFiltersToDefault() {
        filterAndSearch.resetToDefaultFunction.isEnabled();
        BrowserUtils.waitFor(2);
    }


}
