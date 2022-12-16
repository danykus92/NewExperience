package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmPayment {
    public static final Target CONFIRM_ORDER = Target.the("Confirm Final Order").
            located(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    public static final Target PAYMENT_ANSWER = Target.the("Confirm Final Order").
            located(By.xpath("//*[@id=\"center_column\"]/p[1]"));
}