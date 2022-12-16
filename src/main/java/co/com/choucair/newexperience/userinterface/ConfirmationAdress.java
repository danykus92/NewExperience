package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationAdress {
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout Button").
            located(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
}
