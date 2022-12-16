package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.TShirtsModifyQualities;
import co.com.choucair.newexperience.util.Const;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ModifyTShirt implements Task {
    public static ModifyTShirt shirtsModify() { return Tasks.instrumented(ModifyTShirt.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(JavaScriptClick.on(TShirtsModifyQualities.TSHIRTS_ADDQUANTITY),
                Click.on(TShirtsModifyQualities.TSHIRTS_ADDQUANTITY),
                Click.on(TShirtsModifyQualities.TSHIRTS_ADDQUANTITY),
                SelectFromOptions.byVisibleText(Const.SIZE).from(TShirtsModifyQualities.SIZEOPTIONS),
                Click.on(TShirtsModifyQualities.TSHIRTS_ADDTOCART),
                Click.on(TShirtsModifyQualities.TSHIRTS_ADDTOCARTTWO));
    }
}
