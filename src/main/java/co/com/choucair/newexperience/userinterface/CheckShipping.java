package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class    CheckShipping {
    public static final Target AGREE_TERMS = Target.the("Agree Terms").
            located(By.xpath("//*[@id=\"cgv\"]"));
    public static final Target GOTOCHECKOUT = Target.the("Checkout Shipping Button").
            located(By.xpath("//*[@id=\"form\"]/p/button/span"));
}
