package com.cydeo.step_definitions;

import com.cydeo.pages.Jamal_US1539_UserSendMessagePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class Jamal_US1539_UserSendMessage {

    Jamal_US1539_UserSendMessagePage messagePage = new Jamal_US1539_UserSendMessagePage();
    String message = "Jamal Delete";
    String message2 = "Message for Cancel";


    @Given("Type your Message")
    public void type_your_message() {
        messagePage.messageAreaClick.click();
        BrowserUtils.waitFor(4);
        Driver.getDriver().switchTo().frame(0);
        Driver.getDriver().findElement(By.xpath("//body[@contenteditable]")).sendKeys(message);
        Driver.getDriver().switchTo().parentFrame();

    }

    @When("Click on Send button")
    public void click_on_send_button() {
        BrowserUtils.waitFor(2);

        messagePage.messageSendButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("See your Message below")
    public void see_your_message_below() {
        BrowserUtils.waitFor(2);
        String messageID = Driver.getDriver().findElement(By.className("feed-post-text-block-inner-inner")).getAttribute("id");
        System.out.println(messageID);
        Assert.assertEquals(Driver.getDriver().findElement(By.id(messageID)).getText(), message);

    }



    // @AZLC-1595 Done!



    @When("Find on Sender All employees")
    public void findOnSenderAllEmployees() {

        messagePage.messageAreaClick.click();
        BrowserUtils.waitFor(2);
        Driver.getDriver().switchTo().frame(0);
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.waitFor(2);

    }

    @Then("See AllEmployees as a recipient vy default")
    public void seeAllEmployeesAsARecipientVyDefault() {

        String senderExpected = "All employees";
        String senderActual = Driver.getDriver().findElement(By.xpath("//span[@class='feed-add-post-destination-text']")).getText();
        Assert.assertEquals(senderExpected, senderActual);
    }



    //@AZLC-1596 Done

    @Given("Type your Message2")
    public void type_your_message2() {

        messagePage.messageAreaClick.click();
        BrowserUtils.waitFor(4);
        Driver.getDriver().switchTo().frame(0);
        Driver.getDriver().findElement(By.xpath("//body[@contenteditable]")).sendKeys(message2);
        Driver.getDriver().switchTo().parentFrame();

    }

    @When("Click on Cancel button")
    public void clickOnCancelButton() {

        messagePage.messageCancelButton.click();
    }


        @Then("Verify Message is not sent")
    public void verifyMessageIsNotSent() {
   boolean exits = Driver.getDriver().findElements(By.xpath("//*[text()='Message for Cancel']")).size() != 0;
       Assert.assertEquals(false,exits);
    }

    //@AZLC-1597 Done!



    @And("Find last sent message")
    public void findLastSentMessage() {
        messagePage.moreButton.click();
        BrowserUtils.waitFor(3);

    }


    @When("Click on Delete button")
    public void clickOnDeleteButton() {
        messagePage.DeleteButton.click();
        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Verify Message deleted")
    public void verifyMessageDeleted() {

        boolean exits = Driver.getDriver().findElements(By.xpath("//*[text()='Jamal Delete']")).size() != 0;
        Assert.assertEquals(true,exits);
    }
}
