package com.booking.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickAdultChildRoomsInteraction implements Interaction {
    Target element;
    WebElementFacade listData;
    int num;

    public ClickAdultChildRoomsInteraction(Target element, WebElementFacade listData, int num) {
        this.element = element;
        this.listData = listData;
        this.num = num;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {



        int n = num;
        int m = Integer.parseInt(listData.getText());
        while (n != m) {

            actor.attemptsTo(
                    Click.on(element)
            );


            if(n > m) {
                m = m+1;

            }else {
                m=m-1;
            }


        }


    }
    public static ClickAdultChildRoomsInteraction onTheSite(Target element, WebElementFacade listData, int num) {
        return instrumented(ClickAdultChildRoomsInteraction.class, element, listData, num);
    }
}
