package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.CheckShipping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmShipping implements Task {
    public static ConfirmShipping goToShipping() { return Tasks.instrumented(ConfirmShipping.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckShipping.AGREE_TERMS),
                Click.on(CheckShipping.GOTOCHECKOUT));
    }
}
