package co.com.choucair.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WomenClothesModify {
    public static final Target WOMENCLOTHES_ADD = Target.the("Add Women Clothes Quantity").
            located(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i"));
    public static final Target WOMENCLOTHES_MINUS = Target.the("Minus Women Clothes Quantity").
            located(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[1]/span/i"));
    public static final Target WOMENCLOTHES_ADDTOCART = Target.the("Add To Cart Women Clothes").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
    public static final Target WOMENCLOTHES_CHECKOUT = Target.the("Add To Cart Women Clothes").
            located(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
}
