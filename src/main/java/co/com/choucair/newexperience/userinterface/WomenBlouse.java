package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WomenBlouse {
    public static final Target WOMEN_BLOUSE = Target.the("Women Blouse Button Quick View").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[2]"));
}
