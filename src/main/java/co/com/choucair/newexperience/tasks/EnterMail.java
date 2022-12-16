package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.FillEmailSignUp;
import co.com.choucair.newexperience.util.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterMail implements Task {

    public static EnterMail toRegisterUser() { return Tasks.instrumented(EnterMail.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Const.EMAIL).into(FillEmailSignUp.EMAIL_CAMP),
                Click.on(FillEmailSignUp.SIGNUP_BUTTON));
    }
}
