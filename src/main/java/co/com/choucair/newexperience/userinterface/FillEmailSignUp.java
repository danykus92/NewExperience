package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillEmailSignUp {
    public static final Target EMAIL_CAMP = Target.the("Fill Email Field").
            located(By.xpath("//*[@id=\"email_create\"]"));
    public static final Target SIGNUP_BUTTON = Target.the("Click Sign Up Button").
            located(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
}
