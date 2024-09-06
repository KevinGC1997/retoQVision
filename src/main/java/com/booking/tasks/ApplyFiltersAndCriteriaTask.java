package com.booking.tasks;

import com.booking.interactions.ExplicitWait;
import com.booking.interactions.FiltersAdultChildrensInteraction;
import com.booking.interactions.GetValuesInteraction;
import com.booking.utils.DataExcel;
import com.booking.utils.GenerateCurrentDate;
import com.booking.utils.Variables;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;

import java.io.IOException;

import static com.booking.userInterfaces.FiltersAndCriteriaUI.*;

public class ApplyFiltersAndCriteriaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        DataExcel data = new DataExcel();
        Variables variables = new Variables();
        GenerateCurrentDate date = new GenerateCurrentDate();
        try {
            actor.attemptsTo(
                    Enter.theValue(data.readExcelData("Data","data.xlsx",1,0)).into(LBL_INPUT_DESTINATION),
                    Click.on(BTN_INPUT_DATE),
                    Click.on(BTN_SELECT_DATE.of(date.CurrentData(2))),
                    Click.on(BTN_SELECT_DATE.of(date.CurrentData(7))),
                    Click.on(BTN_INPUT_NEXT_DATA),
                    FiltersAdultChildrensInteraction.onTheSite(),
                    Click.on(BTN_SEARCH),
                    Scroll.to(TXT_CATEGORY),
                    Click.on(BTN_CATEGORY.of(String.valueOf(variables.stars))),
                    Click.on(BTN_FILTER),
                    Click.on(BTN_LOWER_PRICE),
                    Click.on(BTN_PRODUCTO),
                    Switch.toNewWindow(),
                    ExplicitWait.wait(2),
                    GetValuesInteraction.onTheSite()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ApplyFiltersAndCriteriaTask onTheSite(){
        return Instrumented.instanceOf(ApplyFiltersAndCriteriaTask.class).withProperties();
    }
}
