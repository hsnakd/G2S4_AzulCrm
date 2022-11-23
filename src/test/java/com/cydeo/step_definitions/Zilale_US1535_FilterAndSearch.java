package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Zilale_US1535_FilterAndSearch {
    
    
    //1.User should be able to see default filters as "my activity, work, favorite,announcements, and workflows"
    @When("User clicks the Filter and search on the active stream")
    public void userClicksTheFilterAndSearchOnTheActiveStream() {
    }

    @Then("Verify that user should see default filters as my activity,work,favorite,announcement,workflows")
    public void verifyThatUserShouldSeeDefaultFiltersAsMyActivityWorkFavoriteAnnouncementWorkflows() {
    }



    //2. User should be able to add and remove fields.
    @When("User clicks Add field function")
    public void userClicksAddFieldFunction() {
    }

    @And("Clicks Data,Type,Author,To functions to remove fields")
    public void clicksDataTypeAuthorToFunctionsToRemoveFields() {
        
    }

    @And("Clicks Favorites,Tag,Exranet fuctions to add fields")
    public void clicksFavoritesTagExranetFuctionsToAddFields() {
        
    }

    @And("Clicks Reset function after add and remove process")
    public void clicksResetFunctionAfterAddAndRemoveProcess() {
        
    }

    @Then("Verify that fields are moveable")
    public void verifyThatFieldsAreMoveable() {
        
    }

    //3.User should be able to search by specifying the Date,
    @When("User clicks Date list")
    public void userClicksDateList() {
    }

    @And("Search by specifying the date")
    public void searchBySpecifyingTheDate() {
        
    }

    @Then("Verify that search by specifying the Date is working")
    public void verifyThatSearchBySpecifyingTheDateIsWorking() {
        
    }

    //4.User should be able to search by selecting single or multiple types,
    @When("User selects one or more options in the type function")
    public void userSelectsOneOrMoreOptionsInTheTypeFunction() {
    }

    @Then("Verify that search by selecting single and multiple types")
    public void verifyThatSearchBySelectingSingleAndMultipleTypes() {
        
    }

    
    //5. User should be able to save the filter
    @When("User clicks SAVE FILTER function")
    public void userClicksSAVEFILTERFunction() {
    }

    @And("User sets the filter name")
    public void userSetsTheFilterName() {
        
    }

    @And("User clicks SAVE fuction to save the filter name")
    public void userClicksSAVEFuctionToSaveTheFilterName() {
        
    }

    @Then("Verify that user should be able to save the filter name")
    public void verifyThatUserShouldBeAbleToSaveTheFilterName() {
        
    }

    
    //6. User should be able to restore the default field,
    @When("User clicks Restore default field function")
    public void userClicksRestoreDefaultFieldFunction() {
        
    }

    @Then("Verify that User should be able to restore the default field")
    public void verifyThatUserShouldBeAbleToRestoreTheDefaultField() {
    }

    
    //7.User should be able to reset filters to default.
    @When("User clicks Configure filter function")
    public void userClicksConfigureFilterFunction() {
    }

    @And("User clicks Reset to default function")
    public void userClicksResetToDefaultFunction() {
        
    }

    @And("User clicks CONTINUE to reset filters to default")
    public void userClicksCONTINUEToResetFiltersToDefault() {
        
    }

    @Then("Verify that user should be able to reset filters to default")
    public void verifyThatUserShouldBeAbleToResetFiltersToDefault() {
    }


}
