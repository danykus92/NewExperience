package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.ConfirmPayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinalPay implements Task {
    public static FinalPay confirmOrder() { return Tasks.instrumented(FinalPay.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConfirmPayment.CONFIRM_ORDER));
    }
}
