package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Tshirts {
    public static final Target TSHIRTS_BUTTON = Target.the("TShirt Button").
            located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
}
