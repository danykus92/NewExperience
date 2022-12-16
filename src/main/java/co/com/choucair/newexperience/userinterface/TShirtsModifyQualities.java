package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TShirtsModifyQualities {
    public static final Target TSHIRTS_ADDQUANTITY = Target.the("TShirt Add Quantity").
            located(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
    public static final Target SIZEOPTIONS = Target.the("TShirt L Option Size").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select"));
    public static final Target TSHIRTS_ADDTOCART = Target.the("Add TShirt to Cart").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
    public static final Target TSHIRTS_ADDTOCARTTWO = Target.the("Add TShirt to Cart").
            located(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
    public static final Target TEXT_QUESTION = Target.the("Question Text").
            located(By.xpath("//*[@id=\"product_1_5_0_0\"]/td[2]/p"));
}
