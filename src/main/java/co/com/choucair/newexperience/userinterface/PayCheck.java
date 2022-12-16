package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayCheck {
    public static final Target PAYBYCHECK = Target.the("Agree Terms").
            located(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span"));
}
