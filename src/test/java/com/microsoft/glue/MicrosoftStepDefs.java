package com.microsoft.glue;

import com.microsoft.pages.SupportHomePage;
import com.microsoft.pages.TemplatesPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.google.common.truth.Truth.assertThat;

public class MicrosoftStepDefs {

    @Given("^I am on the Microsoft Support homepage$")
    public void iAmOnTheMicrosoftSupportHomepage() throws Throwable {
        SupportHomePage.open();
    }

    @When("^I click the Templates Tab$")
    public void iClickTheTemplatesTab() throws Throwable {
        new SupportHomePage().get().clickTemplatesTab();
    }

    @Then("^the title '(.*)'$")
    public void theTitleOfficeTemplatesThemes(String title) throws Throwable {
        assertThat(title)
                .isEqualTo(
                        new TemplatesPage().get().getTitle());
    }

}
