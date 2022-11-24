package com.cydeo.step_definitions;

import com.cydeo.pages.Halil_US1536_UploadFilesPicturesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.text.html.HTML;
import java.awt.*;


public class Halil_US1536_UploadFilesPictures_StepDef {

    Halil_US1536_UploadFilesPicturesPage search = new Halil_US1536_UploadFilesPicturesPage();

    @When("Click the Message on the Quick Navigate Menu")
    public void click_the_message_on_the_quick_navigate_menu() {
        search.messageButton.click();

    }

    @When("User click upload button on message box")
    public void user_click_upload_button_on_message_box() {
        BrowserUtils.waitFor(3);
        search.uploadButton.click();
    }

    @And("User click select documents from bitrix box")
    public void userClickSelectDocumentsFromBitrixBox() {
        search.bitrix.click();
        BrowserUtils.waitFor(3);
    }

    @Then("User select first file")
    public void userSelectFirstFile() {
        search.firstFile.click();
        BrowserUtils.waitFor(10);
    }

    @Then("User select second file")
    public void userSelectSecondFile() {BrowserUtils.waitFor(3);
        search.secondFile.click();
        BrowserUtils.waitFor(3);
    }

    @Then("User select third file")
    public void userSelectThirdFile() {
        search.thirdFile.click();
        BrowserUtils.waitFor(3);
    }


    @Then("User click select documents button")
    public void userClickSelectDocumentsButton() {
        search.selectDocumentButton.click();
        BrowserUtils.waitFor(3);
    }


    /* @Then("User click send button")
     public void userClickSendButton() throws InterruptedException {search.sendButton.click();Thread.sleep(10000);}


     */
    @Then("User see insert in text button at attached file section")
    public void userSeeInsertInTextButtonAtAttachedFileSection() {

        Assert.assertTrue(search.firstInsertinTextButton.isDisplayed());
        Assert.assertTrue(search.secondInsertinTextButton.isDisplayed());
        Assert.assertTrue(search.thirdInsertinTextButton.isDisplayed());


    }

    @Then("User select different format file")
    public void userSelectDifferentFormatFile() {
        search.fourthFile.click();
    }

    @Then("User see insert in text button for different format file")
    public void userSeeInsertInTextButtonForDifferentFormatFile() {
        Assert.assertTrue(search.fourthInsertinTextButton.isDisplayed());
    }

    @Then("User see insert in text button for file")
    public void userSeeInsertInTextButtonForFile() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(search.firstInsertinTextButton.isDisplayed());
    }

    @And("User click send button")
    public void userClickSendButton() {
        BrowserUtils.waitFor(3);
        search.sendButton.click();
        BrowserUtils.waitFor(10);
    }

    @Then("User see uploaded picture in activity stream")
    public void userSeeUploadedPictureInActivityStream() {
        Assert.assertTrue(search.uploadedPicture.isDisplayed());
    }

    @When("User click insert in text button")
    public void userClickInserInTextButton() {
        search.firstInsertinTextButton.click();
        BrowserUtils.waitFor(5);
    }


    @And("User see first file at into text")
    public void userSeeFirstFileAtIntoText()  {
        Driver.getDriver().switchTo().frame(search.iframe);

        System.out.println("search.firstInsertedFile.isDisplayed() = " + search.firstInsertedFile.isDisplayed());
        Assert.assertTrue(search.firstInsertedFile.isDisplayed());

    }


    @And("User click Allow a recipient to edit documents? clickbox")
    public void userClickAllowARecipientToEditDocumentsClickbox() {
        if (search.clickBox.isSelected()) {
            Assert.assertTrue(search.clickBox.isSelected());
        } else {
            search.clickBox.click();
            Assert.assertTrue(search.clickBox.isSelected());
        }
    }

    @When("User click delete box")
    public void userClickDeleteBox() {
        search.deleteBox.click();

    }


    @And("User click select documents from files and images button and attach photo and click rename button")
    public void userClickSelectDocumentsFromFilesAndImagesButtonAndAttachPhoto()  {
        String path = "C:\\Users\\HUAWEİ\\Desktop\\java\\HTML class\\tesla-m.jpg";

        BrowserUtils.waitFor(3);


        WebElement element = search.uploadImagesAndFilesButton;
        element.sendKeys(path);

        BrowserUtils.waitFor(3);
    }
}

