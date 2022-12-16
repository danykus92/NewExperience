package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteAndCheckout {
    public static final Target DELETE_TSHIRTS = Target.the("Delete T-Shirts").
            located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/a[1]/i[1]"));
    public static final Target GOTOCHECKOUT = Target.the("Delete T-Shirts").
            located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
}