package co.com.choucair.newexperience.userinterface;

import co.com.choucair.newexperience.tasks.FieldsUserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillUserData implements Task {
    public FillUserData(String strName, String strLastName, String strPassword,
                        String strAddress, String strCity, String strState,
                        String strZIP, String strPhone) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strPassword = strPassword;
        this.strAddress = strAddress;
        this.strCity = strCity;
        this.strState = strState;
        this.strZIP = strZIP;
        this.strPhone = strPhone;
    }
    public static FillUserData inFields(String strName, String strLastName, String strPassword,
                                        String strAddress, String strCity, String strState,
                                        String strZIP, String strPhone) {
        return Tasks.instrumented(FillUserData.class,strName,strLastName,strPassword,strAddress,
                strCity,strState,strZIP,strPhone);
    }

    private String strName;
    private String strLastName;
    private String strPassword;
    private String strAddress;
    private String strCity;
    private String strState;
    private String strZIP;
    private String strPhone;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FieldsUserData.MISTER),
                Enter.theValue(strName).into(FieldsUserData.NAME),
                Enter.theValue(strLastName).into(FieldsUserData.LASTNAME),
                Enter.theValue(strPassword).into(FieldsUserData.PASSWORD),
                Enter.theValue(strName).into(FieldsUserData.ADDRESS_NAME),
                Enter.theValue(strLastName).into(FieldsUserData.ADDRESS_LASTNAME),
                Enter.theValue(strAddress).into(FieldsUserData.ADDRESS),
                Enter.theValue(strCity).into(FieldsUserData.CITY),
                SelectFromOptions.byVisibleText(strState).from(FieldsUserData.STATE),
                Enter.theValue(strZIP).into(FieldsUserData.ZIP),
                Enter.theValue(strPhone).into(FieldsUserData.PHONE),
                Click.on(FieldsUserData.SUBMIT_BUTTON));
    }
}
