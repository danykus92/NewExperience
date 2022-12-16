package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.Tshirts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LooksFor implements Task{
    public static LooksFor shirtsClothes() { return Tasks.instrumented(LooksFor.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Tshirts.TSHIRTS_BUTTON));
    }
}
