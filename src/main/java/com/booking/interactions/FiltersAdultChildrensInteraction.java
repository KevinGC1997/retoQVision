package com.booking.interactions;

import com.booking.questions.DataQuestion;
import com.booking.utils.DataExcel;
import com.booking.utils.Variables;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

import java.io.IOException;
import java.util.List;

import static com.booking.userInterfaces.FiltersAndCriteriaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltersAdultChildrensInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Variables variable = new Variables();
        List<WebElementFacade> listData = TXT_DATA_FRAME.resolveAllFor(actor);

            actor.attemptsTo(
                    Check.whether(DataQuestion.validate(listData.get(0), variable.adult))
                            .andIfSo(ClickAdultChildRoomsInteraction.onTheSite(BTN_LESS_ADULT, listData.get(0), variable.adult))
                            .otherwise(ClickAdultChildRoomsInteraction.onTheSite(BTN_MORE_ADULT, listData.get(0), variable.adult)),

                    Check.whether(DataQuestion.validate(listData.get(2), variable.rooms))
                            .andIfSo(ClickAdultChildRoomsInteraction.onTheSite(BTN_LESS_ROOMS, listData.get(2), variable.rooms))
                            .otherwise(ClickAdultChildRoomsInteraction.onTheSite(BTN_MORE_ROOMS, listData.get(2), variable.rooms)
                            ),
                    Check.whether(DataQuestion.validate(listData.get(1), variable.child))
                            .andIfSo(
                                    ClickAdultChildRoomsInteraction.onTheSite(BTN_LESS_CHILD, listData.get(1), variable.child),
                                    ExplicitWait.wait(5),
                                    SelectAgeChildInteraction.onTheSite("1 año", variable.child)
                            )
                            .otherwise(
                                    ClickAdultChildRoomsInteraction.onTheSite(BTN_MORE_CHILD, listData.get(1), variable.child),
                                    ExplicitWait.wait(5),
                                    SelectAgeChildInteraction.onTheSite("1 año", variable.child)

                            ),

                    ExplicitWait.wait(10)
            );

    }

    public static FiltersAdultChildrensInteraction onTheSite() {
        return instrumented(FiltersAdultChildrensInteraction.class);
    }
}
