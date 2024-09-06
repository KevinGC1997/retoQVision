package com.booking.interactions;

import com.booking.utils.DataExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.io.IOException;
import java.util.List;

import static com.booking.userInterfaces.FiltersAndCriteriaUI.BTN_INPUT_NEXT_DATA;
import static com.booking.userInterfaces.FiltersAndCriteriaUI.LBL_INPUT_AGE;
import static com.booking.utils.Driver.driver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectAgeChildInteraction implements Interaction {


    String text;
    int num;

    public SelectAgeChildInteraction(String text, int num) {
        this.text = text;
        this.num = num;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        DataExcel data = new DataExcel();
        for (int i = 1; i <= num; i++) {
           WebElement list = LBL_INPUT_AGE.of(String.valueOf(i)).resolveFor(actor);
           Select select = new Select(list);
            try {
                select.selectByVisibleText(data.readExcelData("Data","data.xlsx",i,4));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            actor.attemptsTo(ExplicitWait.wait(2), Click.on(BTN_INPUT_NEXT_DATA));

       }

    }
    public static SelectAgeChildInteraction onTheSite(String text, int num) {
        return instrumented(SelectAgeChildInteraction.class, text, num);
    }
}
