package com.booking.stepDefinitions;

import com.booking.tasks.ApplyFiltersAndCriteriaTask;
import com.booking.utils.Driver;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class FilterAndCriteriaStepDefinitions {



    @Given("that user access successfully to the (.*)$")
    public void thatUserAccessSuccessfullyToTheHttpsBookingCom(String webSite) {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.chrome().onUrl(webSite)));
    }
    @When("the user make a hotel reservation by applying various filters and criteria.")
    public void theUserMakeAHotelReservationByApplyingVariousFiltersAndCriteria() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ApplyFiltersAndCriteriaTask.onTheSite()
        );
    }
    @Then("the validate (.*)$")
    public void theValidateYouSelectedOk(String validate) {

    }
}
