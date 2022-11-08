package com.cydeo.step_definitions;

import com.cydeo.pages.Sukru_US1530_File_UploadPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Sukru_US1530_FileUpload {

    Sukru_US1530_File_UploadPage messageBox = new Sukru_US1530_File_UploadPage();


    @When("user clicks message button")
    public void userClicksMessageButton() {
        messageBox.message.click();
    }

    @And("user clicks upload button")
    public void userClicksUploadButton() {
        BrowserUtils.waitForVisibility(messageBox.upload,3);
        messageBox.upload.click();
    }

    @And("user clicks select from bitrix")
    public void userClicksSelectFromBitrix() {
        messageBox.selectFromBitrix.click();
    }

    @And("user adds first file")
    public void userAddsFirstFile() {
        messageBox.firstPicture.click();
    }

    @And("user adds second file")
    public void userAddsSecondFile() {
        messageBox.secondFile.click();
    }

    @And("user adds third file")
    public void userAddsThirdFile() {
        messageBox.thirdFile.click();
    }

    @And("user clicks Select Document button")
    public void userClicksSelectDocumentButton() {
        messageBox.selectButton.click();
    }

    @Then("Verify InsertInText is visible")
    public void verifyInsertInTextIsVisible() {

        Assert.assertTrue(messageBox.insertInText.isDisplayed());
    }

}
