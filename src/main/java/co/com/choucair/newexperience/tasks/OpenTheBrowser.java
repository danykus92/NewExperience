package co.com.choucair.newexperience.tasks;

import co.com.choucair.newexperience.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {
    private HomePage homePage;
    public static OpenTheBrowser shopPage() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }
}
