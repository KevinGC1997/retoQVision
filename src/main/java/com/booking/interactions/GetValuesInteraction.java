package com.booking.interactions;

import com.booking.utils.WriteExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;
import java.util.TreeMap;

import static com.booking.userInterfaces.FiltersAndCriteriaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetValuesInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, Object[]> datos = new TreeMap<String, Object[]>();
        String hotel = TXT_TITLE.resolveFor(actor).getText();
        actor.attemptsTo(Scroll.to(LBL_SCROLL));
        String price = TXT_PRICE.resolveFor(actor).getText();

        Object[] product = new Object[]{hotel, price};
        datos.put("1",product);
        WriteExcel.WriteExcel(datos);



    }
    public static GetValuesInteraction onTheSite() {
        return instrumented(GetValuesInteraction.class);
    }
}
