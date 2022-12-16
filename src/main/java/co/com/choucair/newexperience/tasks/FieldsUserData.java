package co.com.choucair.newexperience.tasks;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FieldsUserData {
    public static final Target MISTER = Target.the("Click Mister").
            located(By.xpath("//*[@id=\"id_gender1\"]"));
    public static final Target NAME = Target.the("Name").
            located(By.xpath("//*[@id=\"customer_firstname\"]"));
    public static final Target LASTNAME = Target.the("Last Name").
            located(By.xpath("//*[@id=\"customer_lastname\"]"));
    public static final Target PASSWORD = Target.the("Password").
            located(By.xpath("//*[@id=\"passwd\"]"));
    public static final Target ADDRESS_NAME = Target.the("Address Name").
            located(By.xpath("//*[@id=\"firstname\"]"));
    public static final Target ADDRESS_LASTNAME = Target.the("Address LastName").
            located(By.xpath("//*[@id=\"lastname\"]"));
    public static final Target ADDRESS = Target.the("Address").
            located(By.xpath("//*[@id=\"address1\"]"));
    public static final Target CITY = Target.the("City").
            located(By.xpath("//*[@id=\"city\"]"));
    public static final Target STATE = Target.the("State").
            located(By.xpath("//*[@id=\"id_state\"]"));
    public static final Target ZIP = Target.the("ZIP").
            located(By.xpath("//*[@id=\"postcode\"]"));
    public static final Target PHONE = Target.the("Phone").
            located(By.xpath("//*[@id=\"phone_mobile\"]"));
    public static final Target SUBMIT_BUTTON = Target.the("Submit Button").
            located(By.xpath("//*[@id=\"submitAccount\"]/span"));
}