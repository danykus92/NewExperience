package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.WomenClothes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class WomenSection implements Task {
    public static WomenSection womenClothes() { return Tasks.instrumented(WomenSection.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(WomenClothes.WOMEN_BUTTON));
    }

}
