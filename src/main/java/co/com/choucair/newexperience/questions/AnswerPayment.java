package co.com.choucair.newexperience.questions;

import co.com.choucair.newexperience.userinterface.ConfirmPayment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerPayment implements Question<Boolean> {
    private String strAnswer2;
    public AnswerPayment(String strAnswer2) {
        this.strAnswer2 = strAnswer2;
    }

    public static AnswerPayment answerPayment(String strAnswer2) {
        return new AnswerPayment(strAnswer2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextQuestion2= Text.of(ConfirmPayment.PAYMENT_ANSWER).viewedBy(actor).asString();

        if (strAnswer2.equals(TextQuestion2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
