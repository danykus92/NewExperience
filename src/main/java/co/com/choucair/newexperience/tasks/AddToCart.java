package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.TshirtsAddToCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class AddToCart implements Task {
    public static AddToCart shirtsCart() { return Tasks.instrumented(AddToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(TshirtsAddToCart.TSHIRTS_PRODUCT));
    }
}
