package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.WomenBlouse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class LooksForClothes implements Task {
    public static LooksForClothes womenBlouse() { return Tasks.instrumented(LooksForClothes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(WomenBlouse.WOMEN_BLOUSE));
    }
}
