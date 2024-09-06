package com.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ExplicitWait implements Interaction {

    int second;

    public ExplicitWait(int second) {
        this.second = second;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static ExplicitWait wait(int second) {
        return instrumented(ExplicitWait.class, second);
    }
}
