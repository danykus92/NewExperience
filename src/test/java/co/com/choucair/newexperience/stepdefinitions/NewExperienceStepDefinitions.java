package co.com.choucair.newexperience.stepdefinitions;

import co.com.choucair.newexperience.model.DataModel;
import co.com.choucair.newexperience.questions.AnswerCheckout;
import co.com.choucair.newexperience.questions.AnswerPayment;
import co.com.choucair.newexperience.tasks.*;
import co.com.choucair.newexperience.userinterface.FillUserData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class NewExperienceStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) quiere comprar en New Experience$")
    public void thanActorWantsToShopInNewExperience(String actor ) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenTheBrowser.shopPage());
    }

    @When("^busca ropa nueva para el$")
    public void heSearchForNewClothesForHim() {
        OnStage.theActorInTheSpotlight().attemptsTo(LooksFor.shirtsClothes(),
                AddToCart.shirtsCart(),
                ModifyTShirt.shirtsModify());
    }

    @When("^compra productos en dos secciones y se registra para realizar el pago completo$")
    public void heBuysProductsAtTwoSectionsAndRegistersToDoTheFullCheckout(List<DataModel> dataModel ) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LooksFor.shirtsClothes(),
                AddToCart.shirtsCart(),
                ModifyTShirt.shirtsModify(),
                WomenSection.womenClothes(),
                LooksForClothes.womenBlouse(),
                ModifyWomenClothes.womenModify(),
                DeleteProduct.andCheckout(),
                EnterMail.toRegisterUser(),
                FillUserData.inFields(dataModel.get(0).getStrName(),
                        dataModel.get(0).getStrLastName(),
                        dataModel.get(0).getStrPassword(),
                        dataModel.get(0).getStrAddress(),
                        dataModel.get(0).getStrCity(),
                        dataModel.get(0).getStrState(),
                        dataModel.get(0).getStrZIP(),
                        dataModel.get(0).getStrPhone()),
                ConfirmAddress.GoToCheckout(),
                ConfirmShipping.goToShipping(),
                ConfirmPay.payByCheck(),
                FinalPay.confirmOrder());
    }

    @Then("^agrego con exito un nuevo producto en la caja$")
    public void heSuccessfullyAddANewProductAtTheCheckout(List<DataModel> dataModel ) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCheckout.
                answerCheckout(dataModel.get(0).getStrAnswer())));
    }

    @Then("^el hace un pago exitoso$")
    public void heDoesASuccessfullyPayment(List<DataModel> dataModel ) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPayment.
                answerPayment(dataModel.get(0).getStrAnswer2())));
    }
}
