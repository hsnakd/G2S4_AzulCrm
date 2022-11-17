package com.cydeo.step_definitions;

import com.cydeo.pages.Sukru_US1530_File_UploadPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

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
        BrowserUtils.waitFor(2);
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
        Driver.getDriver().switchTo().frame(messageBox.iframe);

    }


    @And("user clicks first picture")
    public void userClicksFirstPicture() {
        messageBox.picture1onBitrix.click();
    }

    @And("user clicks second picture")
    public void userClicksSecondPicture() {
        messageBox.picture2onBitrix.click();
    }

    @And("user clicks third picture")
    public void userClicksThirdPicture() {
        messageBox.picture3onBitrix.click();
    }

    @Then("Verify all pictures are visible as attached files")
    public void verifyAllPicturesAreVisibleAsAttachedFiles() {
        Assert.assertTrue(messageBox.picture1AttachedFiles.isDisplayed());
        Assert.assertTrue(messageBox.picture2AttachedFiles.isDisplayed());
        Assert.assertTrue(messageBox.picture3AttachedFiles.isDisplayed());
    }
    @And("user clicks selected pictures from attached files")
    public void userClicksSelectedPicturesFromAttachedFiles() {
        BrowserUtils.waitFor(3);
        messageBox.picture1AttachedFiles.click();
        BrowserUtils.waitFor(3);
        messageBox.picture2AttachedFiles.click();
        BrowserUtils.waitFor(3);
        messageBox.picture3AttachedFiles.click();
        BrowserUtils.waitFor(3);

        Driver.getDriver().switchTo().frame(messageBox.iframe);
    }
    @Then("Verify all pictures are visible in Activity Stream")
    public void verifyAllPicturesAreVisibleInActivityStream() {

        BrowserUtils.waitFor(3);
        Assert.assertTrue(messageBox.picture1onIframe.isEnabled());
        Assert.assertTrue(messageBox.picture2onIframe.isEnabled());
        Assert.assertTrue(messageBox.picture3onIframe.isEnabled());
        Driver.getDriver().switchTo().parentFrame();
    }


    @And("user clicks send button")
    public void userClicksSendButton() {
        messageBox.sendButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Verify the pictures are visible on activity stream")
    public void verifyThePicturesAreVisibleOnActivityStream() {

      Assert.assertTrue(messageBox.picture1OnActivityStream.isDisplayed());
        Assert.assertTrue(messageBox.picture2OnActivityStream.isDisplayed());
        Assert.assertTrue(messageBox.picture3OnActivityStream.isDisplayed());
    }

    @And("user clicks insertInText button for all files")
    public void userClicksInsertInTextButtonForAllFiles() {
        messageBox.insertInText.click();

    }

    @And("user clicks Allow recipient to edit documents button")
    public void userClicksAllowRecipientToEditDocumentsButton() {
        messageBox.allowRecipientToEditCheckbox.click();
    }

    @Then("Verify Allow recipient to edit documents button is clicked")
    public void verifyAllowRecipientToEditDocumentsButtonIsClicked() {
        Assert.assertTrue(messageBox.allowRecipientToEditCheckbox.isEnabled());
    }

    @Then("remove button should be enabled")
    public void removeButtonShouldBeEnabled() {
        Assert.assertTrue(messageBox.deleteAttachedFileButton.isEnabled());
    }


    @And("user selects file to upload")
    public void userSelectsFileToUpload() {
        BrowserUtils.waitFor(3);
        messageBox.uploadFilesAndImagesButton.sendKeys("/Users/sukruozen/Desktop/Soft Skill/day02/SDLC continue note.txt"+ Keys.ENTER);
    }

    @And("user points the mouse next to uploaded file")
    public void userPointsTheMouseNextToUploadedFile() {
        BrowserUtils.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(messageBox.nameEditButton);

    }

    @Then("a pencil sign to edit the file should show up")
    public void aPencilSignToEditTheFileShouldShowUp() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(messageBox.nameEditButton.isDisplayed());
    }
}
