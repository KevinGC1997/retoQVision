package com.booking.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import javax.swing.text.TabExpander;

public class DataQuestion implements Question<Boolean> {
    WebElementFacade elementFacade;
    int valor;

    public DataQuestion(WebElementFacade elementFacade, int valor) {
        this.elementFacade = elementFacade;
        this.valor = valor;
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        return Integer.parseInt(elementFacade.getText()) > valor;
    }

    public static Question<Boolean> validate(WebElementFacade elementFacade, int valor){
        return new DataQuestion(elementFacade, valor);
    }
}
