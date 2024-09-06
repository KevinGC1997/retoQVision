package com.booking.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;

public class FiltersAndCriteriaUI {

    public static final Target LBL_INPUT_DESTINATION = Target.the("input destination")
            .locatedBy("//input[@name='ss']");
    public static final Target BTN_INPUT_DATE = Target.the("inputDate")
            .locatedBy("//button[@data-testid='date-display-field-start']");
    public static final Target BTN_INPUT_NEXT_DATA = Target.the("Enter data of adult children and rooms")
            .locatedBy("//button[@data-testid='occupancy-config']");
    public static final Target TXT_DATA_FRAME = Target.the("data of adult, children, and rooms")
            .locatedBy("//span[@class='d723d73d5f']");
    public static final Target BTN_SELECT_DATE = Target.the("select date")
            .locatedBy("//span[@data-date='{0}']");
    public static final Target BTN_LESS_ADULT = Target.the("button for less adults")
            .locatedBy("(//div[@class='bfb38641b0']/button)[1]");
    public static final Target BTN_MORE_ADULT = Target.the("button for more adults")
            .locatedBy("(//div[@class='bfb38641b0']/button)[2]");

    public static final Target BTN_LESS_CHILD = Target.the("button for less CHILD")
            .locatedBy("(//div[@class='bfb38641b0']/button)[3]");

    public static final Target BTN_MORE_CHILD = Target.the("button for more child")
            .locatedBy("(//div[@class='bfb38641b0']/button)[4]");
    public static final Target BTN_LESS_ROOMS = Target.the("button for less ROOMS")
            .locatedBy("(//div[@class='bfb38641b0']/button)[5]");
    public static final Target BTN_MORE_ROOMS = Target.the("button for more rooms")
            .locatedBy("(//div[@class='bfb38641b0']/button)[6]");

    public static final Target LBL_ELEMENT_AGE = Target.the("element inpunt age child")
            .locatedBy("//div[@data-testid='kids-ages-select']");
    public static final Target LBL_INPUT_AGE = Target.the("enter to age child")
            .locatedBy("(//select[@class='ebf4591c8e'])[{0}]");
    public static final Target BTN_SEARCH = Target.the("button to search")
            .locatedBy("//*[text()='Buscar']");
    public static final Target TXT_CATEGORY = Target.the("category")
            .locatedBy("(//*[text()='Categoría del alojamiento'])[1]");
    public static final Target BTN_CATEGORY = Target.the("button to check box category")
            .locatedBy("(//input[@name='class={0}'])[1]");
    public static final Target TXT_TITLE = Target.the("title to product")
            .locatedBy("//h2[@class='af32860db5 pp-header__title']");
    public static final Target TXT_PRICE = Target.the("price to product")
            .locatedBy("(//span[@class=\"prco-valign-middle-helper\"])[1]");
    public static final Target BTN_FILTER = Target.the("filter price")
            .locatedBy("(//span[@class='cac967781c'])[1]");
    public static final Target BTN_LOWER_PRICE = Target.the("lower price")
            .locatedBy("//*[text()='Precio (más bajo primero)']");
    public static final Target BTN_PRODUCTO = Target.the("button to product")
            .locatedBy("(//div[@data-testid=\"title\"])[1]");
    public static final Target LBL_SCROLL = Target.the("scroll")
            .locatedBy("(//h3[@class=\"e2e-gr-title bui-container bui-text bui-text--variant-headline_3\"])[1]");


}
