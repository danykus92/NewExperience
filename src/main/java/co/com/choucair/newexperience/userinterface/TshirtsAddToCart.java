package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TshirtsAddToCart {
    public static final Target TSHIRTS_PRODUCT = Target.the("T Shirt Add to Cart").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[2]"));
}
