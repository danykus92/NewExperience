package co.com.choucair.newexperience.questions;

import co.com.choucair.newexperience.userinterface.TShirtsModifyQualities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerCheckout implements Question<Boolean> {
    private String strAnswer;
    public AnswerCheckout(String strAnswer) {
        this.strAnswer = strAnswer;
    }

    public static AnswerCheckout answerCheckout(String strAnswer) {
        return new AnswerCheckout(strAnswer);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String TextQuestion= Text.of(TShirtsModifyQualities.TEXT_QUESTION).viewedBy(actor).asString();

        if (strAnswer.equals(TextQuestion)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
