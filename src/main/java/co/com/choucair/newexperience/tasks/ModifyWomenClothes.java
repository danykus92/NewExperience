package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.WomenClothesModify;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class ModifyWomenClothes implements Task {
    public static ModifyWomenClothes womenModify() { return Tasks.instrumented(ModifyWomenClothes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(WomenClothesModify.WOMENCLOTHES_ADD),
                JavaScriptClick.on(WomenClothesModify.WOMENCLOTHES_ADD),
                JavaScriptClick.on(WomenClothesModify.WOMENCLOTHES_MINUS),
                JavaScriptClick.on(WomenClothesModify.WOMENCLOTHES_ADDTOCART),
                Click.on(WomenClothesModify.WOMENCLOTHES_CHECKOUT));
    }
}
